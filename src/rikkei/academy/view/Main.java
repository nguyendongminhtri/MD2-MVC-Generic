package rikkei.academy.view;

import rikkei.academy.controller.ClassRoomController;
import rikkei.academy.controller.StudentController;
import rikkei.academy.model.ClassRoom;
import rikkei.academy.model.Student;
import rikkei.academy.service.class_room.ClassRoomServiceIMPL;
import rikkei.academy.service.student.StudentServiceIMPL;

public class Main {
    public static void main(String[] args) {
        System.out.println("SHOW LIST CLASSROOM");
        System.out.println(new ClassRoomController().showListClassRoom());
        System.out.println("Create ClassRoom");
        new ClassRoomController().createClassRoom(new ClassRoom(3, "JV082022"));
        System.out.println("LIST CLASS SAU KHI TAO");
        System.out.println(ClassRoomServiceIMPL.classRoomList);
        System.out.println("SHOW LIST STUDENT");
        System.out.println(new StudentController().showListStudent());
        System.out.println("Create Student");
        new StudentController().createStudent(new Student(3,"BA",ClassRoomServiceIMPL.classRoomList.get(2)));
        System.out.println("LIST STUDENT SAU KHI THEM MOI");
        System.out.println(StudentServiceIMPL.studentList);
    }
}