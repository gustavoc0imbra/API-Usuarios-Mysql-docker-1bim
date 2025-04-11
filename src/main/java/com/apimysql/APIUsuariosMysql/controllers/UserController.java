package com.apimysql.APIUsuariosMysql.controllers;

import com.apimysql.APIUsuariosMysql.constants.Constants;
import com.apimysql.APIUsuariosMysql.models.User;
import com.apimysql.APIUsuariosMysql.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(Constants.API_USERS)
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping(Constants.API_USERS + "/{id}")
    public ResponseEntity<Optional<User>> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(userService.findById(id));
    }

    @PostMapping(Constants.API_USERS)
    public ResponseEntity<User> save(@RequestBody User user) {
        System.out.println("Informação request: " + user.toString());
        return ResponseEntity.status(201).body(userService.save(user));
    }

    @PutMapping(Constants.API_USERS)
    public ResponseEntity<User> update(@RequestBody User user) {
        return ResponseEntity.ok(userService.save(user));
    }

    @DeleteMapping(Constants.API_USERS + "/{id}")
    public ResponseEntity<User> delete(@PathVariable("id") Long id) {
        userService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
