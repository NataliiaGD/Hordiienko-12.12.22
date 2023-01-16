package Hometask7;

import java.util.Objects;

public class Director extends Person implements Callable {

    private int yearOfExperience;
    private int numberOfMovies;


    public Director(String name, String surname, String city, String number, int yearOfExperience, int numberOfMovies) {
        super(name, surname, city, number);
        this.yearOfExperience = yearOfExperience;
        this.numberOfMovies = numberOfMovies;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public int getNumberOfMovies() {
        return numberOfMovies;
    }

    public void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }




    public String call(Person human1) {
        String str1 = "Director " + getName() + " calls  actor " + human1.getName() + " "
                + human1.getSurname();
        return str1;
    }


    @Override
    public String call(){
        String str1 = "The director " + getName() + " " + getSurname() + " from "
                + getCity() + " with " + getYearOfExperience() + " years of experience "+
                " can be called ny number " + getNumber();
        return str1;
    }



}