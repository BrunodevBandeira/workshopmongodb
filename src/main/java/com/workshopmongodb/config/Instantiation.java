package com.workshopmongodb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.workshopmongodb.domain.User;
import com.workshopmongodb.repository.UserRepository;


@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... arg0) throws Exception {

        userRepository.deleteAll();

        User amanda = new User(null, "Amanda Bandeira", "manada@Bandeira.com");
        User bruno = new User(null, "Bruno Bandeira", "bruno@Bandeira.com");
        User bob = new User(null, "bob Bandeira", "bob@Bandeira.com");

        userRepository.saveAll(Arrays.asList(amanda, bruno, bob));
        
    }
}




