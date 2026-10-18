/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programming3.compoundgrowthandincrementtracker;

/**
 *
 * @author markjimuel
 */
public class CompoundGrowthAndIncrementTracker {

    public static void main(String[] args) {
        double balance = 500.00;
            System.out.println("-----------------------------");
            System.out.println("   Compount Growth Tracker   ");
            System.out.println("-----------------------------");
            
            System.out.println("Initial Balance          : $" + balance + "\n");
            
            balance += 250.00;
            System.out.println("After $250 Deposit (+=)  : $" + balance);
            
            balance *= 1.05;
            System.out.println("After 5% Interest (*=)   : $" + balance);
            
            balance += 1000.00;
            System.out.println("After $1000 Deposit (+=) : $" + balance + "\n");
            
            System.out.println("-----------------------------");
            System.out.println("      Increment Tracker      ");
            System.out.println("-----------------------------");
            
        int countOne = 5;
            System.out.println("Initial count value: " + countOne); 
            System.out.println("Result of count++: " + (countOne++));
            System.out.println("Value of countOne immediately after: " + countOne + "\n");
            /* Postfix: The countOne++ uses the value first to print then gets added by 1. 
               So it will still print the initial value. */
            
        int countTwo = 5;
            System.out.println("Initial count value: " + countTwo);
            System.out.println("Result of ++count: " + (++countTwo));
            System.out.println("Value of countTwo immediately after: " + countTwo);
            /* Prefix: The ++countTwo add 1 first, then uses the value. So it will add 1 
               to the ++countTwo value then gets printed, leading to 6. */
        
    }
}
