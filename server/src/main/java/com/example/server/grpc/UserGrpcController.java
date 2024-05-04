package com.example.server.grpc;

import com.example.proto.EmptyDto;
import com.example.proto.UserDto;
import com.example.proto.UserNameDto;
import com.example.proto.UsersDto;
import com.example.proto.UserServiceGrpc.UserServiceImplBase;

import com.example.server.business.User;
import com.example.server.business.UserService;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;


@Controller
@RequiredArgsConstructor
public class UserGrpcController extends UserServiceImplBase {
    private final UserService userService;

    @Override
    public void findAll(EmptyDto request, StreamObserver<UsersDto> responseObserver) {
        responseObserver.onNext(UsersDto.newBuilder()
                                        .addAllUsers(userService.findAll()
                                                                .stream()
                                                                .map(this::toGrpc)
                                                                .toList())
                                        .build());
        responseObserver.onCompleted();
    }

    @Override
    public void findByName(UserNameDto request, StreamObserver<UserDto> responseObserver) {
        responseObserver.onNext(toGrpc(userService.findByName(request.getName())));
        responseObserver.onCompleted();
    }

    @Override
    public void save(UserDto request, StreamObserver<EmptyDto> responseObserver) {
        userService.save(toModel(request));
        responseObserver.onNext(EmptyDto.getDefaultInstance());
        responseObserver.onCompleted();
    }

    @Override
    public void delete(UserNameDto request, StreamObserver<EmptyDto> responseObserver) {
        userService.delete(request.getName());
        responseObserver.onNext(EmptyDto.getDefaultInstance());
        responseObserver.onCompleted();
    }

    private UserDto toGrpc(User user) {
        return UserDto.newBuilder()
                      .setId(user.getId())
                      .setName(user.getName())
                      .build();
    }

    private User toModel(UserDto userDto) {
        return User.builder()
                   .id(userDto.getId())
                   .name(userDto.getName())
                   .build();
    }
}
