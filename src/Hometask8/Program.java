package Hometask8;

public class Program {
    public static void main(String[] args) {
        Person person1 = new Person("Kate","Smith","Developer");
        Person person2 = new Person("John", "Smith", "Developer");

        Employee employee1 = new Employee("Bin", "Mister","cleaner",
                5, "London");
        employee1.yearsToRetirement(25);

        person1.drinkCoffee(5);
        person1.drinkCoffee(3);
        person1.drinkCoffee(7);
        person2.drinkCoffee(1);
        person2.drinkCoffee(-1);


    }
}
