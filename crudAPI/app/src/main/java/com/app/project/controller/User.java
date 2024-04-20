package com.app.project.controller;

import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;
import com.app.project.models.UserModel;
import com.app.project.services.UserService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin(origins = "https://localhost:3000")
@RestController
public class User {
    
    @Autowired
    private UserService userservice;
     //StroedProc  proc = new StroedProc();

    @GetMapping("/{id}")
    public Optional<UserModel> getUse(@PathVariable("id") Long id) {
        return userservice.getById(id);
    }

    @GetMapping("/getall")
    public List<UserModel> getAllUser() throws SQLException {
        return userservice.getAll();
    }

    @PostMapping(value = "/updateuser")
    public void updateuser(@RequestBody UserModel user) {
        userservice.updateuser(user);
    }

    @GetMapping("/delete/{id}")
    public String deleteuser(@PathVariable("id") Long id) {
        userservice.deleteUser(id);
        return "deleted user";
    }

    @PostMapping("/add")
    public void adduser(@RequestBody UserModel user) {
        userservice.saveuser(user);
    }

}
