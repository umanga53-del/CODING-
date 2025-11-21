import java.util.*;

/**
 * Write a description of class gpa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class gpa{
    public static void main(String[] args){
    
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter student name:");
        String studentName= input.nextLine();
        
        System.out.print("Enter age: ");
        int age = input.nextInt();
        
        System.out.print("Enter GPA : ");
        double gpa = input.nextDouble();
        
        System.out.println("/n--- Student Information  ---");
        System.out.println("Name: " + studentName);
        System.out.println("Age : " + age );
        System.out.println("GPA:"+ gpa);
         
    
    }
     }

 