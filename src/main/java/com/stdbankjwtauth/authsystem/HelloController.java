/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package com.stdbankjwtauth.authsystem;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Tino
 */
@RestController
@RequestMapping("/url")
public class HelloController {
    @GetMapping("/")
    public String index(){
    	return "Greeting from Spring Boot!";
    }
}
