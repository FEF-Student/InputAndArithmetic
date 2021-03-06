 
/**
 * Write a description of class InputAndArithmetic here.
 * 
 * Description: We will do the Java application
 * InputAndArithmetic from homework04 again with some additional features. 
 * Also, for the Final, modify the input part as follows and keep the rest the same as in the HW 5 draft.  
 * 
 * @author: Felix Estay-Foix
 * @version: 9/29/2020
 */
import java.util.Scanner;

public class InputAndArithmetic
{
    public static int v;
    public static int v2;
    public static String value;
    public static String value2;
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        if (in.hasNextInt())
        {
            v = in.nextInt();
        }
        else 
        {
            value = in.nextLine();
            System.out.println(value + " is not an integer!");
            System.out.println("Program terminated!");
            System.exit(0); 
        }
        System.out.println("The first integer is "+ v + ".");
        System.out.print("Enter another integer: ");
            // check is value entered is an interger
        if (in2.hasNextInt())
        {
            v2 = in2.nextInt();
        }
        else 
        {
            value2 = in2.nextLine();
            System.out.println(value2 + " is not an integer!");
            System.out.println("Program terminated!");
            System.exit(0); 
        }    

        System.out.println("The second integer is "+ v2 + ".");
        int product = v*v2;
        System.out.println("The product of the two integers is "+ product + ".");
       
        
        if(v2 != 0)
        {
            double quotientD = (double)v/(double)v2;
            System.out.print("The double quotient of " + v + " divided by " + v2 + " is ");
            System.out.printf( "%.2f", quotientD);
            System.out.println(".");
            int quotientI = v/v2;
            System.out.println("The integer quotient of " + v + " divided by " + v2 + "  is " + quotientI + ".");
            int remainder = v%v2;
            System.out.println("The remainder of " + v + " divided by " + v2 + " is " + remainder + ".");
        }
        else
        {
            System.out.println("The second number is zero and there is no quotient or remainder.");
        }
        
        if(v > 0)
        {
            double xAnswer = Math.sqrt(v);
            System.out.print("The square root of " + v + " is ");
            System.out.printf( "%.5f", xAnswer);
            System.out.println(".");
       
          
        }
        else
        {
            System.out.println( v +" is negative and there is no square root.");
        }
   
    }
    
}
        