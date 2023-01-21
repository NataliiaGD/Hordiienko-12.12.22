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


        //System.out.println(students);
        printStudents(students, 2);

    }

    public static void printStudents(List<Student> students, int course){
        Iterator<Student> studs = students.iterator();
        while(studs.hasNext()){
             int course1 = studs.next().getCourse();

             if(course != course1){
                 studs.remove();
             }
        }
        studs = students.iterator();

        while(studs.hasNext()){
            String name = studs.next().getName();
            System.out.println(name);
        }

    }
}
