/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programming3.precedencepuzzlesolver;

/**
 *
 * @author markjimuel
 */
public class PrecedencePuzzleSolver {

    public static void main(String[] args) {
        System.out.println("------------------------------");
        System.out.println("   Precedence Puzzle Solver   ");
        System.out.println("------------------------------\n");
        
        System.out.println("Expression 1: --a * b++ - a");
        System.out.println("a = 5");
        System.out.println("b = 9");
            int a = 5;
            int b = 9;
            int expressionOne = --a * b++ - a; // Predicted Result: 33
        System.out.println("Result: " + expressionOne + "\n"); // My prediction of 33 was wrong because I thought the ++ meant add 1 to the math result after multiplying.
        
        System.out.println("Expression 2: True or False? c % d == 0 && c + d > 15 || d < 3");
        System.out.println("c = 12");
        System.out.println("d = 5");
            int c = 12;
            int d = 5;
            boolean expressionTwo = c % d == 0 && c + d > 15 || d < 3; // Predicted Result: False
        System.out.println("Result: " + expressionTwo + "\n"); 
        
        System.out.println("Expression 3: e++ * 2 - --f % 3 + ++e");
        System.out.println("e = 10");
        System.out.println("f = 4");
            int e = 10;
            int f = 8;
            int expressionThree = e++ * 2 - --f % 3 + ++e; // Predicted Result: 31
        System.out.println("Result: " + expressionThree);
    }
}
