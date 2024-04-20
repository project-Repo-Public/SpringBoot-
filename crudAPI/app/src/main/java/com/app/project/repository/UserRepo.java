package com.app.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.app.project.models.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Long>{
    
}
