public class SavingsBond {

    double interestRate = 0.5;
    double months;
    double balance;

    public void bond() {

        if (months >= 0 && months < 12) {
            interestRate = 0.5;
        } else if (months >= 12 && months < 23) {
            interestRate = 1.0;
        } else if (months >= 24 && months < 36) {
            interestRate = 1.5;
        } else if (months >= 36 && months < 48) {
            interestRate = 2.0;
        } else if (months >= 48 && months < 61) {
            interestRate = 2.5;
        }
        System.out.println(balance*=(months*interestRate));
    }

}
