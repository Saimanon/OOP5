package controller;

import java.util.List;

import model.impl.Student;
import model.impl.StudentGroup;
import model.impl.Teacher;
import service.StudentGroupService;
import service.StudentService;
import service.TeacherService;

public class StudentController {
    private StudentService studentService = new StudentService();
    private TeacherService teacherService = new TeacherService();
    private StudentGroupService studentGroupService = new StudentGroupService();

    public Student createStudent(String name, String lastName, int idgroup) {
        return studentService.createStudent(name, lastName, idgroup);
    }

    public Student getById(int id) {
        Student student = null;
        try {
            student = studentService.getById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return student;
    }

    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    public StudentGroup createStudentGroup(int teacherId, List<Integer> studentIds) {
        Teacher teacher = teacherService.getById(teacherId);
        List<Student> students = studentService.getStudentsByIds(studentIds);
        return studentGroupService.createStudentGroup(teacher, students);
    }
}