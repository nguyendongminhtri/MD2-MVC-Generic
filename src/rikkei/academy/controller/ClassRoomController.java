package rikkei.academy.controller;

import rikkei.academy.model.ClassRoom;
import rikkei.academy.service.class_room.ClassRoomServiceIMPL;
import rikkei.academy.service.class_room.IClassRoomService;

import java.util.List;

public class ClassRoomController {
    IClassRoomService classRoomService = new ClassRoomServiceIMPL();
    public List<ClassRoom> showListClassRoom(){
        return classRoomService.findAll();
    }
    public void createClassRoom(ClassRoom classRoom){
        classRoomService.save(classRoom);
    }
}
