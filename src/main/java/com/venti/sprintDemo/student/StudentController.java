package com.venti.sprintDemo.student;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @GetMapping
    public List<String> findAllStudent(){
        return List.of(
            "Venti",
            "Hello world"
        );
    }
}
