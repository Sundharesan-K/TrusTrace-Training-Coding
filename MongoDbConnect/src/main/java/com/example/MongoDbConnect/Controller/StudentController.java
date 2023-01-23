package com.example.MongoDbConnect.Controller;

import com.example.MongoDbConnect.Pojo.Student;
import com.example.MongoDbConnect.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    public StudentRepository studentRepository;
    @PostMapping("/")
    public ResponseEntity<?> addStudent(@RequestBody Student student) {
        Student save = this.studentRepository.save (student);
        return ResponseEntity.ok (save);
    }
    @GetMapping("/")
    public ResponseEntity<?> getStudent(){
        return ResponseEntity.ok (this.studentRepository.findAll ());
    }

}
