import java.util.Date;

// Question 8) Encapsulation allows developers to write more organized and secure code by limiting access where necessary
// Question 9) Test.id has no instance as id is non-static & cannot be referred to via the class name
// Question 10)
public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    public Account(){}
    public Account(int id,double balance, double annualInterestRate){
        this.id=id;
        this.balance =balance;
        this.annualInterestRate=annualInterestRate;
    }
    public int getId(){ return id;}
    public double getBalance(){ return balance;}
    public double getAnnualInterestRate(){ return annualInterestRate;}
    public void setId(int id){ this.id=id; }
    public void setBalance(double balance){ this.balance=balance;}
    public void setAnnualInterestRate(double annualInterestRate){ this.annualInterestRate=annualInterestRate;}
    public Date getDateCreated(){return dateCreated;}

    public double getMonthlyInterestRate(){return annualInterestRate/12;}
    public double getMonthlyInterest(){return balance*getMonthlyInterestRate()/100;}
    public void withdraw(double amount){if(balance>=amount) balance-=amount;}
    public void deposit(double amount){balance+=amount;}
}
