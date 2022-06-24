package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "James"),
            new Student(2, "Maria"),
            new Student(3, "Anna")
    );

    public Student getStudent(Integer studentId){
        return STUDENTS.stream()
                .filter(x -> x.getStudentId().equals(studentId))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Student " + studentId + " does not exist"));
    }

    public List<Student> getStudents(){
        return STUDENTS;
    }

    public void registerNewStudent(Student student) {
        System.out.println("Registering a new student");
    }

    public void deleteStudent(Integer studentId) {
        System.out.println("Deleting a new student");
    }

    public void updateStudent(Integer studentId, Student student) {
        System.out.println("Updating student");
    }
}
