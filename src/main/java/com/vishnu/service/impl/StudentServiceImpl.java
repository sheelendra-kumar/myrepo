package com.vishnu.service.impl;

import com.vishnu.domain.Student;
import com.vishnu.exception.ResourceNotFoundException;
import com.vishnu.repository.StudentRepository;
import com.vishnu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student, Long id) {

        Student update = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Student not found with id: " + id
                ));

        update.setFirstName(student.getFirstName());
        update.setLastName(student.getLastName());
        update.setEmail(student.getEmail());
        update.setMobile(student.getMobile());
        update.setGender(student.getGender());

        return studentRepository.save(update);
    }

    @Override
    public void deleteStudent(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Student not found with id: " + id
                ));
        studentRepository.delete(student);
    }

    @Override
    public Student getStudent(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Student not found with id: " + id
                ));
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}
