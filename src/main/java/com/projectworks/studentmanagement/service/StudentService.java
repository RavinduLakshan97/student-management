package com.projectworks.studentmanagement.service;

import com.projectworks.studentmanagement.model.Student;

import java.util.List;

public interface StudentService {

    Student addStudent(Student student);

    List<Student> getStudents();

    Student updateStudent(Student student, Long id);

    Student getStudentById(Long id);

    void deleteStudent(Long id);
}
