import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Worker {
    public boolean working = false;
    public String Name= "";
    private String employmentDate = "";
    private double salary = 0.00;
    Scanner scanner = new Scanner(System.in);

    public Worker(boolean working, String name, String employmentDate, double salary) {
        this.working = working;
        Name = name;
        this.employmentDate = employmentDate;
        this.salary = salary;
    }
    //-------------GETTER & SETTER-------------
    public boolean isWorking() {
        return working;
    }
    public void setWorking(boolean working) {
        this.working = working;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getEmploymentDate() {
        return employmentDate;
    }
    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    //------------------METODY---------------------

    public void checkWorker(){
        if (isWorking()){
            System.out.println("Pracownik aktualnie pracuje");
        }else {
            System.out.println("Pracownik w tym momencie nie jest dostępny w pracy");
        }
    }
    public void setWorkerInfo(){
        System.out.println("Ustawiasz dane pracownika");
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println("Podaj imię");
        setName(scanner.nextLine());
        System.out.println("Podaj wynagrodzenie");
        setSalary(scanner.nextDouble());
        setWorking(false);
        setEmploymentDate(dateFormat.format(date));
        System.out.println("Pracownik: " + getName() + " zatrudniony: " + dateFormat.format(date) + " na pensję: " + getSalary());
    }
}
