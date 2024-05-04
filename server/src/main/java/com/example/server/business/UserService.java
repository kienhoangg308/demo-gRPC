package com.example.server.business;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User findByName(String name) {
        return userRepository.findByName(name)
                             .orElse(User.builder()
                                         .id(0)
                                         .name("No name with id: %s".formatted(name))
                                         .build());
    }

    public Collection<User> findAll() {
        return userRepository.findAll();
    }

    public void save(User user) {
        userRepository.save(user);
    }

    @Transactional
    public void delete(String name) {
        userRepository.delete(name);
    }
}