package com.example.nguyenmaingoclam.services;

import com.example.nguyenmaingoclam.entity.User;
import com.example.nguyenmaingoclam.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;
    public void save(User user){
        userRepository.save(user);
    }
}
