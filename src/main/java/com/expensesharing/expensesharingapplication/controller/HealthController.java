package com.expensesharing.expensesharingapplication.controller;

import com.expensesharing.expensesharingapplication.domain.User;
import com.expensesharing.expensesharingapplication.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    private final UserRepository userRepository;

    public HealthController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @GetMapping("/health")
    public String healthCheck() {
        if(userRepository.count()==0) {
            User user = new User();
            user.setName("Shubham");
            user.setEmail("shubham@gmail.com");
            userRepository.save(user);
        }
        return  "Application is running. User count is " + userRepository.count();
    }
}
