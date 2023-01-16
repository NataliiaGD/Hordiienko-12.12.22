package Hometask7;


import static Hometask7.Person.call;

public class Program {
    public static void main(String[] args) {

        Person person1 = new Person("Will", "Smith", "New York", "2936729462846");
        Person person2 = new Person("Jackie", "Chan", "Shanhai", "12312412412");
        Person person3 = new Person("Sharlock", "Holmes", "London", "37742123513");
        Person person4 = new Person("Sharlock", "Holmes", "London", "37742123513");

        Director director1 = new Director("John", "Stevenson", "Los Angeles", "123456",
                5, 10);


        System.out.println(person1.call());
        System.out.println(person2.call());
        System.out.println(person3.call());

        // person calls the same person
        System.out.println(call(person1,person1));

        // person calls the same person
        System.out.println(call(person3,person4));


        // person 3 makes a call to person2
        System.out.println(call(person3,person2 ));

        // Director makes a call to a person
        System.out.println(director1.call(person2));


        //Overidend method call in class Direcot
        System.out.println(director1.call());















    }
}
