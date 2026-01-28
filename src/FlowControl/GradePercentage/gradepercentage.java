package FlowControl.GradePercentage;

import java.util.Scanner;

public class gradepercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Subject1 marks: ");
        int Subject1 = scanner.nextInt();

        System.out.print("Enter Subject2 marks: ");
        int Subject2 = scanner.nextInt();

        System.out.print("Enter Subject3 marks: ");
        int Subject3 = scanner.nextInt();
    
        System.out.print("Enter Subject4 marks: ");
        int Subject4 = scanner.nextInt();

        System.out.print("Enter Subject5 marks: ");
        int Subject5 = scanner.nextInt();

        int percentage = (Subject1 + Subject2 + Subject3 + Subject4 + Subject5) / 5;
        
        
        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        scanner.close();
    }
}