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
public class Account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total;
        System.out.print("Input your money : ");
        double money = sc.nextDouble();
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        String type = sc.next();
        switch (type) {
            case "B":
                total = money + (money*0.2);
                break;
            case "X":
                total = money + (money*0.5);
                break;
            default:
                total = money + (money*0.15);
                break;
        }
        System.out.println(total);
    }
}
