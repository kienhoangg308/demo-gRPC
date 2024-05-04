package com.example.server.data;

import com.example.server.business.User;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.Optional;

interface UserCrudRepository extends CrudRepository<User, Integer> {
    @Override
    Collection<User> findAll();

    Optional<User> findByName(String name);

    @Transactional
    void deleteByName(String name);
}
