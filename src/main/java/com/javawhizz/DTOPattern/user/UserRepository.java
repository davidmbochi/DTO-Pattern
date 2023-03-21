package com.javawhizz.DTOPattern.user;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserRepository {
    public List<User> findAllUsers(){
        return List.of(
                new User(1L,"john","doe",
                        "john@javawhizz.com","password123"),
                new User(2L,"mary","public",
                        "mary@javawhizz.com","password1234"),
                new User(3L,"isaac","newton",
                        "isaac@javawhizz.com","password4321"),
                new User(4L,"elon","musk",
                        "elon@javawhizz.com","password356")
        );
    }
}
