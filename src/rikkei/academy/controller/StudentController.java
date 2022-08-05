package rikkei.academy.controller;

import rikkei.academy.model.Student;
import rikkei.academy.service.student.StudentServiceIMPL;

import java.util.List;

public class StudentController {
    public List<Student> showListStudent(){
        return new StudentServiceIMPL().findAll();
    }
    public void createStudent(Student student){
        new StudentServiceIMPL().save(student);
    }
}
