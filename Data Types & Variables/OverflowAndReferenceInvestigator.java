/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programming3.overflowandreferenceinvestigator;

/**
 *
 * @author markjimuel
 */
public class OverflowAndReferenceInvestigator {

    public static void main(String[] args) {
            byte value = 127;
            value++;
            System.out.println("Byte Overflow: " + value);
            
            String a = new String("Java");
            String b = new String("Java");
            String c = "Java";
            
            System.out.println("a == b: " + (a == b));
            System.out.println("a == c: " + (a == c));
            System.out.println("b == c: " + (b == c));
            
            System.out.println("a equals to b: " + a.equals(b));
            System.out.println("a equals to c: " + a.equals(c));
            System.out.println("b equals to c: " + b.equals(c));
            
            int [] first = {10, 20, 30};
            int [] second = first;
            System.out.println("Original first[0]: " + first[0]);
            
            second [0] = 99;    
            System.out.println("first[0]: " + first[0]);
            System.out.println("second[0]: " + second[0]);
    }
}
