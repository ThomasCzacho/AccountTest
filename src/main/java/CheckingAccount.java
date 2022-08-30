public class CheckingAccount {

    public double balance;
    public double interestRate = 0.01;
    public double withdrawal;
    public String name;

    public void with() {
        if (withdrawal>1 && withdrawal<balance) {
            System.out.println("Withdrawal Successful");
            balance-=withdrawal;
        }
        else if (withdrawal < 0) {
            System.out.println("Invalid Number");
        }
        else{
            System.out.println("Not enough Money in account");

        }
    }

    public void displayCustomer(){
        System.out.println("Customer: "+name);
    }
}
