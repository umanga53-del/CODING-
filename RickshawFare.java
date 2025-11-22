
/**
 * Write a description of class RickshawFare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class RickshawFare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Distance(km):");
        double d = sc.nextDouble();

        System.out.print("Time (min):");
        double t = sc.nextDouble();

        System.out.print("Local?(yes/no):");
        String local = sc.next();

        System.out.print("Night?(yes/no):");
        String night = sc.next();

        double fare = 50 + (d*20) + t;

        fare -= local.equals("yes") ? 10 :0;
        fare += night.equals("yes") ? 20 :0;

        System.out.println("\nTotal Fare: Rs."+fare);

        sc.close();
    }
}
