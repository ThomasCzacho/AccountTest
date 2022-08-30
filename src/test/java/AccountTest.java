public class AccountTest {

    public static void main(String[] args) {
        CheckingAccount sa0001 = new CheckingAccount();
        SavingsBond sb0001 = new SavingsBond();
        sb0001.balance = 1200;
        sa0001.name = "Damien";
        sb0001.months = 6;



        sb0001.bond();
        sa0001.with();

        CheckingAccount sa0002 = new CheckingAccount();
        sa0002.balance = 2000;
        sa0002.name = "Bill";

        sa0001.displayCustomer();
        sa0002.displayCustomer();
    }
}