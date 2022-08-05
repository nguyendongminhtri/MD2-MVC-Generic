package rikkei.academy.service.student;

import rikkei.academy.model.Student;
import rikkei.academy.service.class_room.ClassRoomServiceIMPL;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceIMPL implements IStudentService{
    public static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1,"Hung", ClassRoomServiceIMPL.classRoomList.get(0)));
        studentList.add(new Student(2,"Khanh", ClassRoomServiceIMPL.classRoomList.get(1)));
    }
    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public void save(Student student) {
        studentList.add(student);
    }
}
