public class Main {
    public static void main(String[] args) {
        User AdamAbacki = new User(1,"Adam","Abacki",4500.00,0.00);
        User BeataBabacka = new User(2,"Beata","Babacka",4500.00,700.00);
        User TomaszTabacki = new User(3,"Tomasz","Tabakci",8000.00,200.00);

        BankAcc AdamAcc = new BankAcc(1, AdamAbacki.getName(), AdamAbacki.getSurName(), AdamAbacki.getSalary(), AdamAbacki.getGrants(), true, 2386.00, 1, "Adam");
        BankAcc BeataAcc = new BankAcc(2, BeataBabacka.getName(), BeataBabacka.getSurName(), AdamAcc.getSalary(), BeataBabacka.getGrants(), true, 1285.00,2,"Beata");
        BankAcc TomaszAcc = new BankAcc(3, TomaszTabacki.getName(), TomaszTabacki.getSurName(), TomaszTabacki.getSalary(), TomaszTabacki.getGrants(), true,12850.00,3, "Tomasz");

        Worker assistant = new Worker(true,"Julian","",3500.00);
        Worker supervisor = new Worker(false,"Michał","",5500.00);
        Worker CEO = new Worker(false,"Michał","20/12/2011",12500.00);

        AdamAbacki.showFullName();
        AdamAcc.setCurrency();
        assistant.setWorkerInfo();

    }
}