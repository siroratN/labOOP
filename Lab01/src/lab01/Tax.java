/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

/**
 *
 * @author Sirorat
 */
import java.util.*;
public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Salary = sc.nextDouble();
        double tax;
        if(Salary > 50000) {
            tax = Salary*0.1;
        }
        else {
            tax = Salary*0.05;
        }
        System.out.println(tax);
    }
}
