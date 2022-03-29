package com.mihai.userapi.service;

import com.mihai.userapi.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User createUser(User user);
    User getUserById(long id);
    List<User> getAllUsers();
    String deleteUser(long id);
    User updateUser(User user);
    User getUserByEmail(String email);
}
