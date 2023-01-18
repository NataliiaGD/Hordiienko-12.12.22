package Hometask8;

public class Person {
    private String name;
    private String surname;
    private String job;

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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Person(String name, String surname, String job) {
        this.name = name;
        this.surname = surname;
        this.job = job;
        Logger.INFO.logInfo("Person is created: " + name + " " + surname);

    }

    public String drinkCoffee(int numberCupsOfCoffee){
        if(numberCupsOfCoffee  >= 6){
            Logger.DEBUG.logDebug(name + " selected more than five cups of coffee");
            return "it's too much coffee";
        }
        else if(numberCupsOfCoffee > 1) {
            Logger.DEBUG.logDebug(name + " selected less than six cups of coffee");
            return "drink more coffee";
        }
        else if(numberCupsOfCoffee == 5){
            Logger.DEBUG.logDebug(name + " selected five cups of coffee");
            return "You drink enough coffee";
        }
        else if(numberCupsOfCoffee == 1){
            Logger.WARN.logWarn(name + " has to drink more coffee");
            return "Person has to drink more coffee";
        }
        else if(numberCupsOfCoffee <= 0){
            Logger.ERROR.logError( name + " can't drink zero or negative cups of coffee");
            throw new InvalidCupsOfCoffeeException("Cups of coffee can't be zero");
        }

        return " ";
    }

}
