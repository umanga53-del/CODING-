
/**
 * Write a description of class tutorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tutorial
{ 
    int qty; // instance variable 
    static int rrt; // static variable
    public static void main(String[]args){ 
        
        int age=18; // local variable 
        System.out.println(age);
        System.out.println(tutorial.rrt); 
        
        //Implicit Typecasting 
        
        double dtr=age;
        System.out.println(dtr); 
        
        // Explicit Typecasting 
        
        double db= 10.09;
        int itr= (int)db;
        System,out.println(itr);
    } 
}