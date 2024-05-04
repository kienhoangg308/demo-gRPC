package com.example.client.business;

import java.util.Collection;

public interface UserRepository {
    User findByName(String name);

    Collection<User> findAll();

    void save(User user);

    void delete(String name);
}
