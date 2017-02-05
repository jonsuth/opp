package exercises.exercise2;

/**
 * Created by jss33 on 24/01/17.
 */
public class TestAccount {

    public static void main(String[] args) {
        Account account1 = new Account(500);
        Account account2 = new Account(100);

        account1.setInterestRate(0.1);
        account2.setInterestRate(0.1);

        System.out.println(account2.computeInterest(12));
        System.out.println(account2.computeInterest(24));
        System.out.println(account2.computeInterest(36));
    }
}
