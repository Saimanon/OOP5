package service;

import java.util.List;

import model.impl.Student;
import model.impl.StudentGroup;
import model.impl.Teacher;

public class StudentGroupService {

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
        return new StudentGroup(teacher, students);
    }
}