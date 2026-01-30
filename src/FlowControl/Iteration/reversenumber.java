package FlowControl.Iteration;

import java.util.Scanner;

public class reversenumber {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String reversedNumber = "";
        
        // while(n != 0){
        //     int digit = n % 10;
        //     reversedNumber = reversedNumber * 10 + digit;
        //     n /= 10;
        // }

        String numstr = Integer.toString(n);
        for(int i= numstr.length() - 1; i >=0; i--){
            char ch = numstr.charAt(i);
            reversedNumber += ch;
        }
        
        System.out.println("The reversed number is: " + reversedNumber);
        sc.close();
    }





    
}
