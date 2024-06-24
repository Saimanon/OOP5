package service;

import model.DB.DataBase;
import model.impl.Teacher;

public class TeacherService {
    public Teacher getById(int id) {
        return DataBase.teachersDB
                .stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);
    }
}