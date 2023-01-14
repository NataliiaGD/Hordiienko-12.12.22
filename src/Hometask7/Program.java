package Hometask7;


import static Hometask7.Person.call;

public class Program {
    public static void main(String[] args) {
        Person person1 = new Person("Will", "Smith", "New York", "2936729462846");
        Person person2 = new Person("Jackie", "Chan", "Shanhai", "12312412412");
        Person person3 = new Person("Sharlock", "Holmes", "London", "37742123513");
        Person person4 = new Person("Sharlock", "Holmes", "London", "37742123513");


//        System.out.println(person1.call());
//        System.out.println(person2.call());
//        System.out.println(person3.call());


        System.out.println(call(person1, person3));
        System.out.println(call(person1, person1));
        System.out.println(call(person3, person4));













    }
}
