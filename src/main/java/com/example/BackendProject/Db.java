package com.example.BackendProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Db {

    HashMap<String,String> storage = new HashMap<>();
    ArrayList<User> userList = new ArrayList<>();

    public Db() {
        storage.put("Sachin","A Great Batsman");
        storage.put("Varun", "A nice chef");

        userList.add(new User(1,"Joe",23));
        userList.add(new User(2,"John",90));
    }

    public String searchAWord(String word) {
        return storage.get(word);
    }

    public boolean addUser(User user) {
        userList.add(user);
        return true;
    }

    public List<User> getUserList() {
        return userList;
    }
}
