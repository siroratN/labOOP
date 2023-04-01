public class Employee {
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;
    public static void setNationalily(String nationality){
        Employee.nationality = nationality;
    }
    public static String getNationality() {
        return nationality;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
    public Wallet getWallet(){
        return wallet;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public int getEnergy(){
        return energy;
    }
    public boolean equals(Employee e){
        return name.equals(e.getName()); 
    }
    public String toString(){
        String builder = "";
        builder += "My name is " + name + ".\n";
        builder += "I have " + energy + " energy left.\n";
        builder += "I have a balance of " + wallet.getBalance() + " baht.";
        return builder;
    }
    ///public boolean buyFood(Seller s){
        
    ///}
}
