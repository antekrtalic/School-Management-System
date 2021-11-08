package school.management.system;

import java.util.List;

public class School {
    public List<Teacher> teachers;
    public List<Student> students;
    public int totalMoneyEarned;
    public int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return this.teachers;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public int getTotalMoneyEarned() {
        return this.totalMoneyEarned;
    }

    public void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public int getTotalMoneySpent() {
        return this.totalMoneySpent;
    }

    public void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent += moneySpent;
    }


}
