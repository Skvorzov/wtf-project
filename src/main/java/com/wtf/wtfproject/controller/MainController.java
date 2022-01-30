package com.wtf.wtfproject.controller;

import com.wtf.wtfproject.entity.Student;
import com.wtf.wtfproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return """
                Use https://wtf-project.herokuapp.com/ping to get pong
                Use https://wtf-project.herokuapp.com/create-random-student to create random student
                Use https://wtf-project.herokuapp.com/students to create random student""";
    }

    @GetMapping("/ping")
    public String ping(){
        Student student = new Student();
        student.setName("Petro");
        student.setEmail("petro@gmail.com");
        userRepository.save(student);
        return "pong";
    }
}