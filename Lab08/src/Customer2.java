import java.util.ArrayList;
public class Customer2 {

    private String firstName;
    private String lastName;
    private int numOfAccount;
    private ArrayList<Account> acct;

    public Customer2(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = new ArrayList<>();
    }
    public Account getAccount(int index) {
        return this.acct.get(index);
    }

    public int getNumOfAccount() {
        return this.acct.size();
    }
    
    public void addAccount(Account acct){
        this.acct.add(acct);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return  firstName + " " + lastName + " numOfAccount = " + numOfAccount;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}


