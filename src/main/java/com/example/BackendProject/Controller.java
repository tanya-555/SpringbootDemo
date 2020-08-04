package com.example.BackendProject;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    Db db = new Db();

    //for get api
    @GetMapping("/hi")
    public String sayHello() {
        return "Hello";
    }

    //api to convert meters to centimeters
    //http://localhost:8080/convertToCenti?q=9
    @GetMapping("/convertToCenti")
    public int convert(@RequestParam int q) {
        return q*100;
    }

    //api to fetch the data from database depending on query
    //http://localhost:8080/search?q=Sachin
    @GetMapping("/search")
    public String search(@RequestParam String q) {
        return db.searchAWord(q);
    }

    //get api to return all users
    //http://localhost:8080/getUsers
    @GetMapping("/getUsers")
    public List<User> getUsers() {
        return db.getUserList();
    }

    //post api for adding a new user in database
    //query to be provided in the form of JSON
    @PostMapping("/addUser")
    public boolean createUser(@RequestBody User user) {
        return db.addUser(user);
    }
}
