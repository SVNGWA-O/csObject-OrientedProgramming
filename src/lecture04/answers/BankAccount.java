package lecture04.answers;/* Stub for students to fill in*/
/** The "Hello world" of OOP: The Bank Account Class */
public class BankAccount {
    /** A Customer's identifier (their name) */
    String customer;
    /** A Customer's numeric monetary worth ($$$) */
    double balance;

    /**
     * initializes an empty balance
     * @param customer the customer's name
     */
    public BankAccount(String customer){
        this.customer = customer;
        this.balance = 0.0;
    }

    /**
     * initializes a non-empty balance
     * @param customer the customer's name
     * @param initialBalance the initial balance (0.0 is used if a negative is given)
     */
    public BankAccount(String customer, double initialBalance){
        this.customer = customer;
        this.balance = initialBalance > 0.0 ? initialBalance : 0.0;
    }

    /**
     * looks up the customer's current balance
     * @return their wealth in USD ($)
     */
    public double balance() {
        return this.balance;
    }

    /**
     * The amount of money
     * @param usd the amount of money to deposit
     */
    public void deposit(double usd) {
        this.balance += usd;
    }

    /**
     * Attempts to withdraw money from this account and update the balance
     * @param usd The amount of money to withdraw from this account
     * @return the amount of money successfully withdrawn
     */
    public double withdraw(double usd) {
        if(this.balance - usd < 0){
            double result = this.balance;
            this.balance = 0.0;
            return result;
        }
        else {
            this.balance -= usd;
            return usd;
        }
    }

    /**
     * Withdraws money from this account to deposit in another account
     * @param l the account to give money to
     * @param v the amount of money to give
     * @return the amount of money successfully sent
     */
    public double transfer(BankAccount l, double v) {
        double amountToSend = this.withdraw(v);
        l.deposit(amountToSend);
        return amountToSend;
    }
}
