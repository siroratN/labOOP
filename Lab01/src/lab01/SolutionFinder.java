
package lab01;

/**
 *
 * @author Sirorat
 */
public class SolutionFinder {
    public static void main(String[] args) {
        double a = 4, b = 8, c = 3;
        double x1 = (-b + (Math.sqrt((Math.pow(b, 2) - (4*a*c)))))/(2*a);
        double x2 = (-b - (Math.sqrt((Math.pow(b, 2) - (4*a*c)))))/(2*a);
        System.out.println(x1);
        System.out.println(x2);
    }
}
