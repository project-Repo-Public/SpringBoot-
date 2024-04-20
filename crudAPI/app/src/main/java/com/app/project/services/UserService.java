package com.app.project.services;

import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.project.models.UserModel;
import com.app.project.repository.UserRepo;

@Service
public class UserService {
    
    @Autowired
    private UserRepo userRepo;

    public Optional<UserModel> getById(Long id){
        return userRepo.findById(id);
    }

    public List<UserModel> getAll(){
        return userRepo.findAll();
    }

    public void deleteUser(Long id){
         userRepo.deleteById(id);
    }

    public UserModel saveuser(UserModel user){
       return userRepo.save(user);
    }

    public UserModel updateuser(UserModel user){
        return userRepo.save(user);
    }
}
