
/**
 * Write a description of class defaultValue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class defaultValue
{
   byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    boolean flag;
    char ch;

    public static void main(String[] args) {
        defaultValue dv = new defaultValue();
        
        System.out.println("byte: " + dv.b);
        System.out.println("short: " + dv.s);
        System.out.println("int: " + dv.i);
        System.out.println("long: " + dv.l);
        System.out.println("float: " + dv.f);
        System.out.println("double: " + dv.d);
        System.out.println("boolean: " + dv.flag);
        System.out.println("char: " + (int) dv.ch);  
    }
}
