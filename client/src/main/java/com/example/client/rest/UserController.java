package com.example.client.rest;

import com.example.client.business.User;
import com.example.client.business.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public Collection<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{name}")
    public User findByName(@PathVariable String name) {
        return userService.findByName(name);
    }

    @PostMapping
    public void save(@RequestBody User user) {
        user.setId(0);
        userService.save(user);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody User user) {
        if (user.getId() != 0) {
            user.setId(id);
            userService.save(user);
        }
    }

    @DeleteMapping("/{name}")
    public void delete(@PathVariable String name) {
        userService.delete(name);
    }
}
