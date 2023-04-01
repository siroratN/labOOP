/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sirorat
 */
public class Customer {

    private String firstName;
    private String lastName;
    private int numOfAccount;
    private Account acct[];

    public Customer(){
        this("","");
    }
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
    }
    public Account getAccount(int index) {
        return acct[index];
    }

    public int getNumOfAccount() {
        return numOfAccount;
    }
    
    public void addAccount(Account acct){
        this.acct[numOfAccount] = acct;
        numOfAccount++;
    }

    @Override
    public String toString() {
        return  firstName + " " + lastName + " numOfAccount = " + numOfAccount;
    }
    
}
