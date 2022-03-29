package com.mihai.userapi;

import com.mihai.userapi.model.User;
import com.mihai.userapi.repository.UserRepository;
import com.mihai.userapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(path = "/add")
    public @ResponseBody
    User addNewUser(@RequestBody User user) {

        return userService.createUser(user);
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(path = "/get")
    public User getUserById(@RequestParam(value="id" ) long id){
        return userService.getUserById(id);
    }
    @GetMapping(path = "/getByEmail")
    public  User getUserByEmail(@RequestParam(value="email") String email){
        return userService.getUserByEmail(email);
    }

    @PutMapping(path="/update")
    public @ResponseBody
    User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping(path ="/delete")
    public @ResponseBody String deleteUser(@RequestParam(value="id") long id){
        return userService.deleteUser(id);
    }
}
