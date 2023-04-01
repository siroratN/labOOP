public class Customer {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;
    public Customer(){
        this("","",null);
    }
    public Customer(String firstName, String lastName){
        this(firstName, lastName, null);
    }
    public Customer(Stirng firstName, String lastName, CheckingAccount acct){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }
    public void setFistName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setAcct(CheckingAccount acct){
        this.acct = acct;
    }
    public CheckingAccount getAcct(){
        return acct;
    }
    @Override
    public String toString(){
        if (getAcct() == null){
            return getFirstName()+""+getLastName()+"doesn’t have account.";
        }
        return "The "+getFirstName()+" account has "+acct.getBalance()+" baht and "+acct.getCredit()+" credits.";
    }
    public boolean equals(Customer s){
        return s.firstName.equals(firstName) & s.lastName.equals(lastName);
    }
}
