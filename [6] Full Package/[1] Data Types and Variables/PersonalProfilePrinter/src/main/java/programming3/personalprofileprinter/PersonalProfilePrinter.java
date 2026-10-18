/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programming3.personalprofileprinter;

/**
 *
 * @author markjimuel
 */
public class PersonalProfilePrinter {

    public static void main(String[] args) {
            int age = 18;
            double height = 171;
            boolean studentstatus = true;
            char firstinitial = 'M', secondinitial = 'J';
            String name = "Mark Jimuel D. Consular";
            
            System.out.println("--------------------------------");
            System.out.println("      STUDENT INFORMATION       ");
            System.out.println("--------------------------------");
            System.out.println(" ");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Height: " + height + "cm");
            System.out.println("Initial: " + firstinitial + secondinitial);
            System.out.println("Enrollment Status: " + (studentstatus ? "Enrolled" : "Not Enrolled")); // Used a conditional operator (condition ? true_value : false_value) to print the student's enrollment status. :)
    }
}
