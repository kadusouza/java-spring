package kadu.studies.securityjtw.controller;

import kadu.studies.securityjtw.model.User;
import kadu.studies.securityjtw.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class WelcomeController {
    @Autowired
    UserRepository userRepository;
    @GetMapping
    public boolean welcome(){
        return userRepository.existsByUsername("jose") ;
    }//"Welcome to My Spring Boot Web API"
    @GetMapping("/users")
    public String users() {
        return "Authorized user";
    }
    @GetMapping("/managers")
    public String managers() {
        return "Authorized manager";
    }
}