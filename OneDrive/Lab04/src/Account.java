public class Account {
    public double balance;
    public String name;
    public void deposit(double b){
        if(b >= 0){
            balance += b;
        }
    }
    public double withdraw(double b){
        balance -= b;
        if (b>=0 & balance >= 0){
            return balance;
        }
        else if (balance < 0){
            System.out.println("Your account balance is insufficient.");
            return balance += b;
        }
        else{
            System.out.println("The balance variable must be greater than or equal to zero.");
            return balance;
        }
    }
    public void showInfo(){
        System.out.println("In "+name+"  account, there is a balance equal to "+balance+" baht.");
    }
}