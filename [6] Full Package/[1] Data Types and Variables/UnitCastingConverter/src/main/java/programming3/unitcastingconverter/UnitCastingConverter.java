/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programming3.unitcastingconverter;
import java.util.Scanner;

/**
 *
 * @author markjimuel
 */
public class UnitCastingConverter {

    public static void main(String[] args) {
            System.out.println("----------------------------------------");
            System.out.println("              Unit Conversion           ");
            System.out.println("----------------------------------------");
            
            Scanner sc = new Scanner(System.in);
                System.out.print("Enter a length in Centimeter: ");
                double totalCmeters = sc.nextDouble();
                
            int wMeters = (int) (totalCmeters / 100);
            double rCmeters = (totalCmeters % 100);
            
            System.out.println("Original Centimeters: " + totalCmeters + "cm");
            System.out.println("Converted: " + wMeters + " m and " + rCmeters + " cm\n");
            
            
            
            System.out.println("----------------------------------------");
            System.out.println("            Implicit Widening           ");
            System.out.println("----------------------------------------");
            
            int intNum = 100;
            double wideDouble = intNum;
            
            System.out.println("Integer Value: " + intNum);
            System.out.println("Widened to Double: " + wideDouble + "\n");
            
            /* For Implicit Widening, no cast is needed since int is already a 
               smaller type converting to a larger type such as double. */
            
            System.out.println("----------------------------------------");
            System.out.println("           Explicit Narrowing           ");
            System.out.println("----------------------------------------");
            double doubleNum = 12.34;
            int narrowedInt = (int) doubleNum;
            System.out.println("Double Value: " + doubleNum);
            System.out.println("Narrowed to Integer: " + narrowedInt + "\n");
            
            /* For Explicit Narrowing, the decimals from the double type ".34" 
               data is lost. Since int can only hold whole numbers, the cast 
               removes the decimal point part from the double data type. */
    }
}
