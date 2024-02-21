import java.util.Scanner;

public class BankAcc extends User{

    private boolean accStatus = false;
    private double currency = 0.00;
    private int accNumber = 1;
    private String owner = "";

    Scanner scanner = new Scanner(System.in);

    public BankAcc(int id, String name, String surName, double salary, double grants, boolean accStatus, double currency, int accNumber, String owner) {
        super(id, name, surName, salary, grants);
        this.accStatus = accStatus;
        this.currency = currency;
        this.accNumber = accNumber;
        this.owner = owner;
    }
    // -------------GETTER & SETTER -------------------
    public boolean isAccStatus() {
        return accStatus;
    }
    public void setAccStatus(boolean accStatus) {
        this.accStatus = accStatus;
    }
    public double getCurrency() {
        return currency;
    }
    public void setCurrency(double currency) {
        this.currency = currency;
    }
    public int getAccNumber() {
        return accNumber;
    }
    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    //--------------- METODY ----------------------


    public double setCurrency() {
        System.out.println("Jeśli chcesz wpłacić pieniądze napisz 1 jeśli wypłacić napisz 2");
        int check = scanner.nextInt();
        if (check == 1) {
            System.out.println("Podaj ile pieniędzy chcesz wpłacić");
            this.currency += scanner.nextDouble();
            System.out.println("Stan konta: " + getCurrency());
        } else if (check == 2) {
            System.out.println("Podaj ile pieniędzy chcesz wypłacić");
            double getMoney = scanner.nextDouble();
            if (currency < getMoney) {
                System.out.println("Nie możesz wypłacić tyle pieniędzy");
            } else {
                this.currency -= scanner.nextDouble();
                System.out.println("Pomyślnie wypłacono pieniądze");
                System.out.println("Stan konta: " + getCurrency());
            }
        } else {
            System.out.println("Błąd");
        }
        return currency;
    }
    public void getAccInfo(){
        System.out.println(accNumber);
        System.out.println(accStatus);
        System.out.println(currency);
        System.out.println(owner);
    }
    public String getAccOwner(String owner){
        return owner = getName() + " " + getSurName();

    }
    public boolean loanPossibility(){
        if (getSalary() > 5000){
            return true;
        }
        else {
            return false;
        }
    }



}
