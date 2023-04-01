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
public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = Math.PI*(Math.pow(radius, 2));
        System.out.println(area);
    }
}
