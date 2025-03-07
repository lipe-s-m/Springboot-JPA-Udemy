package com.felipeserejo.course.controller;

import com.felipeserejo.course.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
    public ResponseEntity<List<User>> findAllUsers(){
        User user1 = new User(1, "Felipe", "emailFelipe@gmail.com", "senha1", "21998887766");
        User user2 = new User(2, "João", "emailJoão@gmail.com", "123213", "21932347837");
        User user3 = new User(3, "Maria", "emailMaria@gmail.com", "SOUuma.Senha", "21991112233");
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        return ResponseEntity.ok(users);
    }

}
