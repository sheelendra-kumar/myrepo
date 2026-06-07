package com.vishnu.controller;

import com.vishnu.domain.Student;
import com.vishnu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public ResponseEntity<Student> saveStudent( @Valid @RequestBody Student student){
        return ResponseEntity.ok(studentService.saveStudent(student));
    }

    @GetMapping("/fetch/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id){
        return ResponseEntity.ok(studentService.getStudent(id));

    }

    @GetMapping("/fetchAll")
    public ResponseEntity<List<Student>> getAllStudent(){
        return ResponseEntity.ok(studentService.getAllStudent());
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable Long id){
        return ResponseEntity.ok(studentService.updateStudent(student, id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){

        studentService.deleteStudent(id);
        return ResponseEntity.ok("Student Successfully Delete !");
    }

}