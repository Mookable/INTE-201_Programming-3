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
        System.out.println("---------------------------");
        System.out.println("       Byte Overflow       ");
        System.out.println("---------------------------");
            byte value = 127;
            value++;
            System.out.println("Byte Overflow: " + value + "\n");
            
        System.out.println("---------------------------");
        System.out.println("     String Comparison     ");
        System.out.println("---------------------------");    
            String A = new String("Crescendo");
            String B = new String("Crescendo");
            String C = "Crescendo";
            
            System.out.println("'==' Comparison: ");
            System.out.println("A == B: " + (A == B));
            /* The system will print false since using "new" forces Java to create 
               a different object so 'A' and 'B' is completely two different objects. */
            System.out.println("A == C: " + (A == C));
            /* The system will print false since 'C' is declared as a string pool, 
               while 'A' is declared as a new object. */
            System.out.println("B == C: " + (B == C) + "\n");
            /* This is similar to A == C. The system will print false since 'C' is 
               declared as a string pool while 'B' is declared a new object. */
            
            System.out.println("'Equals to' Comparison: ");
            System.out.println("A Equals to B: " + A.equals(B));
            System.out.println("A Equals to C: " + A.equals(C));
            System.out.println("B Equals to C: " + B.equals(C) + "\n");
        
        System.out.println("---------------------------");
        System.out.println("   Reference Investigator  ");
        System.out.println("---------------------------");      
            int [] First = {10, 20, 30};
            int [] Second = First;
            System.out.println("Original First[0]: " + First[0] + "\n");
            
            Second [0] = 99;    
            System.out.println("Altered First[0]: " + First[0]);
            System.out.println("Altered Second[0]: " + Second[0]);
    }
}
