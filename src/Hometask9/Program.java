package Hometask9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Bob", 1));
        students.add(new Student("Peter", 1));
        students.add(new Student("Nataly", 2));
        students.add(new Student("Emily", 2));
        students.add(new Student("Richard", 3));
        students.add(new Student("Stepan", 3));

        students.remove(1);

        printStudents(students, 2);
    }

    public static void printStudents(ArrayList<Student> students, int currentCourse) {
        Iterator<Student> stud = students.iterator();
        while (stud.hasNext()) {
            Student student = stud.next();
            int course = student.getCourse();
            if (course == currentCourse) {
                String name = student.getName();
                System.out.println(name);
            }
        }
    }
}
