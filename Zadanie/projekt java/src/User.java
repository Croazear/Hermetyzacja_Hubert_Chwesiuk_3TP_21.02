import java.util.Scanner;

public class User {

    Scanner scanner = new Scanner(System.in);
    private int id = 0;
    private String name = "";
    private String surName = "";
    private double salary = 0.00;
    private double grants = 0.00;

    public User(int id, String name, String surName, double salary, double grants) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.grants = grants;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getGrants() {
        return grants;
    }
    public void setGrants(double grants) {
        this.grants = grants;
    }

// -------------- METODY ------------
    public void showFullName(){
        System.out.println(getName() + getSurName());
    }
    private void setFullName(){
        System.out.println("Podaj imię");
        this.name = scanner.nextLine();
        System.out.println("Podaj nazwisko");
        this.surName = scanner.nextLine();
    }
    private double getIncome(double salary,double grants){
        double income = getSalary() + getGrants();
        return income;
    }
    private double getTaxes(double salary,double grants){
        double realIncome = (getSalary() + getGrants())*0.77;
        return realIncome;
    }
}
