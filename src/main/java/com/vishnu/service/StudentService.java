package com.vishnu.service;

import com.vishnu.domain.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    Student updateStudent(Student student, Long id);
    void deleteStudent(Long id);
    Student getStudent(Long id);
    List<Student> getAllStudent();

}
