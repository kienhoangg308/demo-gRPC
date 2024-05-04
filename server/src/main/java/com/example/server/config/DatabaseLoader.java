package com.example.server.config;

import com.example.server.business.User;
import com.example.server.business.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
//public class DatabaseLoader {
//
//    @Bean
//    CommandLineRunner initDatabase(UserRepository noteRepository) {
//        return args -> {
//            noteRepository.save(User.builder()
//                                    .message("First message")
//                                    .build());
//            noteRepository.save(User.builder()
//                                    .message("Second message")
//                                    .build());
//        };
//    }
//
//}
