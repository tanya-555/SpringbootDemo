package com.example.BackendProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

}
