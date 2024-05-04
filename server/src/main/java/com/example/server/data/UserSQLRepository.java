package com.example.server.data;

import com.example.server.business.User;
import com.example.server.business.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@RequiredArgsConstructor
class UserSQLRepository implements UserRepository {

    private final UserCrudRepository userCrudRepository;

    @Override
    public Optional<User> findByName(String name) {
        return userCrudRepository.findByName(name);
    }

    @Override
    public Collection<User> findAll() {
        return userCrudRepository.findAll();
    }

    @Override
    public void save(User user) {
        userCrudRepository.save(user);
    }

    @Override
    public void delete(String name) {
        userCrudRepository.deleteByName(name);
    }
}
