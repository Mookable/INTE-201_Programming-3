/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programming3.gradethresholdchecker;

/**
 *
 * @author markjimuel
 */
public class GradeThresholdChecker {

    public static void main(String[] args) {
        double studentAverageGrade = 89.5;
        int studentAbsences = 2;
        boolean studentPassed = (studentAverageGrade >= 75 && studentAbsences <= 3) || (studentAverageGrade >= 90);
        
        System.out.println("---------------------------------");
        System.out.println("     Grade Threshold Checker     ");
        System.out.println("---------------------------------");
        
        System.out.println("Student's Average Grade: " + studentAverageGrade);
        System.out.println("Student's Absences:  " + studentAbsences);
        
            if (studentPassed) {
                System.out.println("\nSTATUS: PASS");
                    if (studentAverageGrade >= 90){
                        System.out.println("Remarks: The student achieved an Average Grade 90 or above, passing automatically regardless of absences.");
                    }
                    else {
                        System.out.println("Remarks: The student achieved an Average Grade at least 75 and they have 3 or fewer absences.");
                    }
            }
            else {
                System.out.println("\nSTATUS: FAILS");
                System.out.println("Remarks: The student dit not meet the required Average Grade and Attendance thresholds.");
            }
    }
}
