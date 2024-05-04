package com.example.client.grpc;

import com.example.client.business.User;
import com.example.client.business.UserRepository;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.example.proto.EmptyDto;
import com.example.proto.UserDto;
import com.example.proto.UserNameDto;
import com.example.proto.UsersDto;
import com.example.proto.UserServiceGrpc;

import java.util.Collection;
import java.util.List;

@Service
class UserGrpcClient implements UserRepository {
    private final EmptyDto EMPTY = EmptyDto.newBuilder().build();
    private final UserServiceGrpc.UserServiceBlockingStub stub;

    public UserGrpcClient(@Value("${grpc-to-database.address}") String address,
                          @Value("${grpc-to-database.port}") int port) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(address, port)
                                                      .usePlaintext()
                                                      .build();

        stub = UserServiceGrpc.newBlockingStub(channel);
    }

    @Override
    public User findByName(String name) {
        return toBusiness(stub.findByName(toProto(name)));
    }

    @Override
    public Collection<User> findAll() {
        return toBusiness(stub.findAll(EMPTY));
    }

    @Override
    public void save(User user) {
        stub.save(toProto(user));
    }

    @Override
    public void delete(String name) {
        stub.delete(toProto(name));
    }

    private UserNameDto toProto(String name) {
        return UserNameDto.newBuilder()
                        .setName(name)
                        .build();
    }

    private UserDto toProto(User user) {
        return UserDto.newBuilder()
                      .setId(user.getId())
                      .setName(user.getName())
                      .build();
    }

    private User toBusiness(UserDto userDto) {
        return User.builder()
                   .id(userDto.getId())
                   .name(userDto.getName())
                   .build();
    }

    private List<User> toBusiness(UsersDto usersDto) {
        return usersDto.getUsersList()
                       .stream()
                       .map(this::toBusiness)
                       .toList();
    }
}
