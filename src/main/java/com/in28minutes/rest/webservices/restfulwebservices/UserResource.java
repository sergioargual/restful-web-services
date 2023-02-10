package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.MessageFormat;
import java.util.*;

@RestController
public class UserResource {

    private MessageSource messageSource;

    public UserResource(MessageSource messageSource){
        this.messageSource = messageSource;
    }
    public UserDaoService service;
    public UserResource(UserDaoService service){
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return service.retrieveAllUsers();
    }
    @GetMapping("/users/{id}")
    public User getOneUser(@PathVariable int id){
        return service.retrieveOneUser(id);
    }
    @PostMapping("/users")
    public void createUser(@Valid @RequestBody User user){
        service.saveUser(user);
    }
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id){
        service.deleteOneUser(id);
    }

}
