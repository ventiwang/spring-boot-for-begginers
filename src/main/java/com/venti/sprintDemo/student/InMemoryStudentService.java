package com.venti.sprintDemo.student;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class InMemoryStudentService implements StudentService {

    private final InMemoryStudentDao dao;

    public InMemoryStudentService(InMemoryStudentDao dao){
        this.dao= dao;
    }


    @Override
    public List<Student> findAllStudent() {
        return this.dao.findAllStudent();
    }

    @Override
    public Student save(Student s) {
        return this.dao.save(s);
    }

    @Override
    public Student findByEmail(String email) {
        return this.dao.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return this.dao.update(s);
    }

    @Override
    public void delete(String email) {
        this.dao.delete(email);
    }

}
