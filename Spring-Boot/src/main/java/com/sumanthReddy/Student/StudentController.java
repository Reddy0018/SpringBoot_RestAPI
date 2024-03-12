package com.sumanthReddy.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudents")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping("/save")
    public String saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return "Success";
    }

    @DeleteMapping(path = "/delete/{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long id){
        studentService.deleteStudentbyId(id);
    }

    @PutMapping("/update/{studentId}")
    public void updateEntity(@PathVariable("studentId") Long id,
                             @RequestParam(required = false) String name,
                             @RequestParam(required = false) String email){
        studentService.updateStudentByID(id,name,email);
    }
}
