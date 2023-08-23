package com.venti.sprintDemo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    public List<Student> findAllStudent(){
    return List.of(
            new Student(
                "Venti",
                "Wang",
                LocalDate.now(),
                "contact@mail.com",
                33
            ),
            new Student(
                "Student 3",
                "Wang",
                LocalDate.now(),
                "contact@mail.com",
                28
            )
        );
    }
}
