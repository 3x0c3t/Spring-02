package com.wildcodeschool.myProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

    @GetMapping("/doctor/{id}")
    public String getDoctorById(@PathVariable Long id) {
        // Replace this with your actual logic to fetch doctor details
        return "Doctor ID: " + id;
    }
}
