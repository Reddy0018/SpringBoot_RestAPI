package com.sumanthReddy.Student;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public void saveStudent(Student student){
        Optional<Student> students =  studentRepository.findStudentByEmail(student.getEmail());
        if(students.isPresent()){
            throw new IllegalStateException("Student email is already present!");
        }
        studentRepository.save(student);
    }

    public void deleteStudentbyId(Long id) {
        if(studentRepository.existsById(id)){
            studentRepository.deleteById(id);
        }else {
            throw new IllegalStateException("User not found!");
        }
    }

    @Transactional
    public void updateStudentByID(Long id, String name, String email) {
        //Get Student by ID
        Student student = studentRepository.findById(id).orElseThrow(() ->
                new IllegalStateException("Not found student by given ID: "+ id));

        //update student name
        if(null!=name && !name.isEmpty()) {
            student.setName(name);
        }

        //get Student with provided email if any
        if(null !=email && !email.isEmpty()){
            Optional<Student> stu = studentRepository.findStudentByEmail(email);
            if(stu.isPresent()){
                throw new IllegalStateException("Email Already Taken!");
            }
            student.setEmail(email);
        }
    }
}
