package com.gilberthg.mini_project.task;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @GetMapping("/")
    public String index(HttpServletRequest request) {
        return "Welcome to Fairtech " + request.getSession().getId();
    }

}
