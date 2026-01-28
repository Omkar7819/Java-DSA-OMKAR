package FlowControl.LeapYear;

import java.util.Scanner;

public class leapyear {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Year:");
        int Year = sc.nextInt();
        
        if((Year%400==0)||(Year%4==0 && Year%100!=0)){
            System.out.println("Leap");

        }
        else{
            System.out.println("Not Leap");
        }
        sc.close();
    }
}
