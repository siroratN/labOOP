package lab01;
import java.util.*;
public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age, numDay1, numDay2; double weight, salary = 0, bonas = 0;
        System.out.print("Please insert your name : ");
        String name = sc.nextLine();
        System.out.print("Please insert your age : ");
        age = sc.nextInt();
        System.out.print("Please insert number of working days : ");
        numDay1 = sc.nextInt();
        System.out.print("Please insert number of absent days : ");
        numDay2 = sc.nextInt();
        System.out.print("Please insert your body weight : ");
        weight = sc.nextDouble();
        if (age > 50) {
            salary =  (numDay1 * 3000) ;
        }
        else if (age > 40) {
            salary = (numDay1 * 1000) - (numDay2 * 25);
        }
        else if (age > 30) {
            salary = (numDay1 * 500) - (numDay2 * 50); 
        }
        else if (age > 20) {
            salary =  (numDay1 * 300) - (numDay2 * 50);
        }
        if (9 < weight && weight < 61) {
            bonas = salary + 5000;
        }
        else if (60 < weight && weight < 91){
            bonas = salary + (5000 - ((weight-60) * 10));
        }
        System.out.println("Hi, " +name);
        System.out.println("Your salary is "+salary+" Baht");
        System.out.println("Your salary and bonus is "+(bonas)+" Baht");
    }
}
