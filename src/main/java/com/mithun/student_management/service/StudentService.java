package com.mithun.student_management.service;

import com.mithun.student_management.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudent();
}
