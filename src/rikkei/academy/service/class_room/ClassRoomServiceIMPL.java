package rikkei.academy.service.class_room;

import rikkei.academy.model.ClassRoom;

import java.util.ArrayList;
import java.util.List;

public class ClassRoomServiceIMPL implements IClassRoomService {
    public static List<ClassRoom> classRoomList = new ArrayList<>();
    static {
        classRoomList.add(new ClassRoom(1,"JV062022"));
        classRoomList.add(new ClassRoom(2, "JS072022"));
    }
    @Override
    public List<ClassRoom> findAll() {
        return classRoomList;
    }

    @Override
    public void save(ClassRoom classRoom) {
        classRoomList.add(classRoom);
    }
}
