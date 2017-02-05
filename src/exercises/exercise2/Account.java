package exercises.exercise2;

/**
 * Created by jss33 on 24/01/17.
 */
public class Account {
    double balance;
    double interestRate;

    Account(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    void getBalance() {
        System.out.println(balance);
    }

    void setInterestRate(double rate) {
        this.interestRate = rate;
    }

    int computeInterest(int n) {
        return (int) (balance * Math.pow((1+interestRate), (n / 12)));
    }

}
