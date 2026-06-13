package lecture04.activity;

public class BankAccount {
    public String customer;
    public double balance;

    public BankAccount(String customer){
        this.customer = customer;
        this.balance = 0.0;
    }

    public BankAccount(String customer, double balance){
        this.customer = customer;
        if(balance >=0.0)
        {
        this.balance = balance;
        }
        else{
            this.balance =0.0;
        }
    }

    public double balance(){
        return this.balance;
    }

    public void deposit(double amt){
        this.balance = this.balance + amt;

    }

    public double withdraw(double amount){
        double answer =0.0;
        if(this.balance >= amount){
                this.balance -= amount;
                answer = amount;
        }
        else{
            answer = this.balance;
            this.balance = 0.0;
        }
        return answer;
    }

    public double transfer(BankAccount l, double v) {
        double answer = this.withdraw(v);
        l.deposit(answer);
        return answer;
    }
    public boolean equals(Object o) {
        if(o instanceof BankAccount b){
            return this.customer.equals(b.customer) &&
                    Math.abs(this.balance - b.balance) < 0.01;
        } else {
            return false;
        }
    }

}
