/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programming3.four_functioncalculator;
import java.util.Scanner;

/**
 *
 * @author markjimuel
 */
public class Four_FunctionCalculator {

    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
            System.out.println("--------------------------------");
            System.out.println("    Four-Function Calculator    ");
            System.out.println("--------------------------------");
            System.out.print("Enter First Integer: ");
                int firstInt = inputInt.nextInt();
            System.out.print("Enter Second Integer: ");
                int secondInt = inputInt.nextInt();
            
            System.out.println("\nResults: ");
            System.out.println("(+) Addition: " + (firstInt + secondInt));
            System.out.println("(-) Subtraction: " + (firstInt - secondInt));
            System.out.println("(*) Multiplication: " + (firstInt * secondInt));
            System.out.println("(/) Division: " + (firstInt / secondInt)); // The result for the division operations, it always rounds towards zero.
            System.out.println("(%) Modulo / Remainder: " + (firstInt % secondInt)); // The result for modulo operations, it always take the sign of the divinend or the first entered integer. 
    }
}
