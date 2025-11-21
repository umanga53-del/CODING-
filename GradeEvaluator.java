import java.util.*;

/**
 * Write a description of class GradeEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaluator
{
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter your grade: ");

int grade = sc.nextInt();

String result = (grade >= 40) ? "Pass" : "Fail";
System.out.println("--- Grade Report ---");
System.out.println("Grade:\t" + grade); 
System.out.println("Status:\t" + result); 
sc.close(); 
} 
}