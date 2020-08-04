package com.example.BackendProject;

import java.util.HashMap;

public class Db {

    HashMap<String,String> storage = new HashMap<>();

    public Db() {
        storage.put("Sachin","A Great Batsman");
        storage.put("Varun", "A nice chef");
    }

    public String searchAWord(String word) {
        return storage.get(word);
    }
}
