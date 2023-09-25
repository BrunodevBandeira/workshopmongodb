package com.workshopmongodb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshopmongodb.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResourse {


    @GetMapping 
    public ResponseEntity<List<User>> findAll() {
            User maria = new User("1", "Amanda Bandeira", "amanda@bandeira.com");
            User bruno = new User("2", "Bruno Bandeira", "bruno@bandeira.com");
            List<User> list = new ArrayList<>();
            list.addAll(Arrays.asList(maria, bruno));
            return ResponseEntity.ok().body(list);
    }
}
