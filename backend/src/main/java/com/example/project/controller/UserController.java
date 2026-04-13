package com.example.project.controller;

import com.example.project.common.Result;
import com.example.project.entity.User;
import com.example.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public Result list() {
        return Result.success(userService.list());
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Long id) {
        return Result.success(userService.getById(id));
    }

    @PostMapping
    public Result save(@RequestBody User user) {
        userService.save(user);
        return Result.success(null);
    }

    @PutMapping
    public Result update(@RequestBody User user) {
        userService.updateById(user);
        return Result.success(null);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id) {
        userService.removeById(id);
        return Result.success(null);
    }
}