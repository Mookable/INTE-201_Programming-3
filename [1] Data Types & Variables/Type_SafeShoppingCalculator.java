/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programming3.type_safeshoppingcalculator;

/**
 *
 * @author markjimuel
 */
public class Type_SafeShoppingCalculator {

    public static void main(String[] args) {
        int quantity = 2;
            double unitPrice = 25.63, totalCost; // totalCost should not be an "int" since it multiplies quantity and unitPrice, and unitPrice contains a decimal. Since unitPrice contains a decimal, totalCost must also hold a decimal.
            String storeName = "         CAFE NIPPONICA         ";
            
            totalCost = quantity * unitPrice;
            
            System.out.println("--------------------------------");
            System.out.println(storeName);
            System.out.println("--------------------------------");
            System.out.println("        Purchase Summary        ");
            System.out.println("Price: " + unitPrice);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total: " + totalCost);

    }
}
