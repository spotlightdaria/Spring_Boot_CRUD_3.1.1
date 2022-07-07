package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.reposirory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getOne(Long id){
        return userRepository.getReferenceById(id);
    }
    public List<User> getAll(){
        return userRepository.findAll();
    }
    public void add(User user){
        userRepository.save(user);
    }

    public void removeUser(Long id){
        userRepository.deleteById(id);
    }
}
