package Hometask8;

public class Employee extends Person {
    private int yearsOfExperience;
    private String city;

    public Employee(String name, String surname, String job, int yearsOfExperience, String city) {
        super(name, surname, job);
        this.yearsOfExperience = yearsOfExperience;
        this.city = city;
        Logger.INFO.logInfo("Employee is created: " + name + " " + surname + " from " + city);
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String yearsToRetirement(int yearsOfExperience){
        if(yearsOfExperience > 30){
            Logger.INFO.logInfo("Person can retire " + getName() + " " + "from " + city);
            return "It's time to retirement " + getName();
        } else if(yearsOfExperience > 0) {
            Logger.WARN.logWarn("You still have to work " + getName());
            return "You still have to work " + getName();
        } else {
            Logger.ERROR.logError("Error! Years of experience can't be zero or negative");
            throw new IllegalArgumentException();

        }

    }
}
