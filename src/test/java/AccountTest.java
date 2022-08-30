public class AccountTest {

    public static void main(String[] args) {
        CheckingAccount sa0001 = new CheckingAccount();
        sa0001.balance = 1200;
        sa0001.name = "Damien";
        sa0001.interestRate = 0.02;
        sa0001.withdrawal = -1;

        sa0001.with();

        CheckingAccount sa0002 = new CheckingAccount();
        sa0002.balance = 2000;
        sa0002.name = "Bill";

        sa0001.displayCustomer();
        sa0002.displayCustomer();
    }
}