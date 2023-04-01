
public class CheckingAccount extends Account {

    private double credit;

    public CheckingAccount() {
        super(0, "");
    }

    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }

    public void setCredit(double credit) {
        if (credit > 0) {
            this.credit = credit;
        } else {
            System.out.println("Input number must be a positive integer.");
        }
    }

    public double getCredit() {
        return credit;
    }

    @Override
    public void withdraw(double a) {
        double money = getBalance()-a;
        if (a > 0){
            if (money >= 0){
                if(a < 0){
                    System.out.println("Input number must be a positive integer.");
                }
                else if ((getBalance()-a) < 0){
                    System.out.println("Not enough money!");
                }
                else{
                    System.out.println(a+" baht is withdrawn from "+name+" and your credit balance is "+getCredit());
                    setBalance(getBalance() - a);
                }
            }
        else if (money < 0 & money + getCredit() >= 0){
                this.balance = 0;
                this.credit -= a;
                System.out.println(a+" baht is withdrawn from "+name+" and your credit balance is "+getCredit());
        }
        else if (money < 0 & money + getCredit() < 0){
                System.out.println("Not enough money!");
        }
    }
    }
    public void withdraw(String a) {
        this.withdraw(Double.parseDouble(a));
    }

    @Override
    public String toString() {
        return "The " + name + " account has " + balance + " baht and " + credit + " credits.";
    }
}
