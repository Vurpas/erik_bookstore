package erik_bookstore.demo.controllers;


import erik_bookstore.demo.models.User;
import erik_bookstore.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserService userService;

    // POST create user
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
    // GET list of all users
    @GetMapping
    public List<User> allUsers() {
        return userService.findAll();
    }
    // GET user by ID
    @GetMapping("/{id}")
    public Optional<User> findUserById(@PathVariable String id) {
        return userService.findUserById(id);
    }
    // DELETE user by ID
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id) {
        userService.deleteById(id);

        return "User deleted.";
    }
    // PUT update user by ID
    @PutMapping("/{id}")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
}