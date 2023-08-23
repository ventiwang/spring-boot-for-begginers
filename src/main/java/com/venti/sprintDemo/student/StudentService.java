package com.venti.sprintDemo.student;

import java.util.List;

public interface StudentService {
    
    Student save(Student s);

    public List<Student> findAllStudent();

    Student findByEmail(String email);

    Student update(Student s);

    void delete(String email);
}
