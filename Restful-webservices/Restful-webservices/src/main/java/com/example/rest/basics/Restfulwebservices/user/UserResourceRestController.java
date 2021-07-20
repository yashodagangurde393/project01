package com.example.rest.basics.Restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResourceRestController {

    @Autowired
    private UserDAOService service;
    //RetriveAllUsers - GET /users

    @GetMapping(path="/getall")
    public List<User> GetAllUsers(){
    //    System.out.println("In controller");
        return service.GetAll();
    }
    //Get Detail of specific User - GET /users/{id}
    @GetMapping(path="/getall/{id}")
    public User findOneUser(@PathVariable int id){
      //  System.out.println("In controller");
        return service.findOne(id);
    }
    @PostMapping("/add")
    public void createUser(@RequestBody User user){
        User saveduser=service.Save(user);
    }
}
