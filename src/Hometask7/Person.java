package Hometask7;

import java.util.Objects;

public  class Person implements Callable {
    private String name;
    private String surname;
    private String city;
    private String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Person(String name, String surname, String city, String number) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) && surname.equals(person.surname) && city.equals(person.city)
                && number.equals(person.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, city, number);
    }

    @Override
    public String call() {
        String str1 = "Call person " + name + " " + surname + " from " + city + " can be called by " + number;
        return str1;
    }

    @Override
    public String call(Person human1) {
        if(this.equals(human1)){
            return "You can't call yourself";
        }
        else {
            return this.getName() + " " + this.getSurname() + " calls person "
                    + human1.getName() + " " + human1.getSurname() + " by number " + human1.getNumber();
        }
    }








}
