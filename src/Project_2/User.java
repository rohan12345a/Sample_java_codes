package Project_2;

public class User {
    private String name;
    private int age;
    private String occupation;
    private double income;

    public User(String name, int age, String occupation, double income) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    public double getIncome() {
        return income;
    }
}

