public class Main {
    public static void main(String[] args) {
        Account a1 = new Account(1122, 20000, 4.5);
        a1.withdraw(2500);
        a1.deposit(3000);
        System.out.println("Balance: " + a1.getBalance());
        System.out.println("Monthly Interest: " + a1.getMonthlyInterest());
        System.out.println("Date Created: " + a1.getDateCreated());
    }

}