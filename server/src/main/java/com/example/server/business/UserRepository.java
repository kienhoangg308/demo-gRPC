package com.example.server.business;

import java.util.Collection;
import java.util.Optional;

public interface UserRepository {
    Optional<User> findByName(String name);

    Collection<User> findAll();

    void save(User name);

    void delete(String name);
}
