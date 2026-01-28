package FlowControl.Gretestof3;

import java.util.Scanner;

public class gretestof3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        
        scanner.close();
        // int greatest = num1;
        // if (num2 > greatest) {
        //     greatest = num2;
        // }
        // if (num3 > greatest) {
        //     greatest = num3;
        // }

        // System.out.println("The greatest of the three numbers is: " + greatest);
        // scanner.close();




        // if (num1 >= num2 && num1 >= num3) {
        //     System.out.println(num1 + " is the greatest number.");
        // } else if (num2 >= num1 && num2 >= num3) {
        //     System.out.println(num2 + " is the greatest number.");
        // } else {
        //     System.out.println(num3 + " is the greatest number.");
        // }



        // int greatest = (num1 >= num2) ? (num1 >= num3 ? num1 : num3) : (num2 >= num3 ? num2 : num3);
        // System.out.println("The greatest of the three numbers is: " + greatest);
    

    
        int greatest = Math.max(num1, Math.max(num2, num3));
        System.out.println("The greatest of the three numbers is: " + greatest);
    
        
    }
}