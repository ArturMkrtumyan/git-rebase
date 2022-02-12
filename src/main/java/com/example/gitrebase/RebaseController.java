package com.example.gitrebase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RebaseController {
    @GetMapping
    public String message(){
        return "rebase example by Admin";
    }
}
