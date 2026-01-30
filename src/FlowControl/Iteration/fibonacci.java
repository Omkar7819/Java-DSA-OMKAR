package FlowControl.Iteration;

import java.util.Scanner;

public class fibonacci {

    public static int fibonacciNum(int n){
        int a = 1;
        int b = 0;
        int c= 0;
        String result = "";

        for(int i=0; i<=n; i++){
            c=a+b;
            a = b;
            b = c;
            result += c + " ";
            
        }
        System.out.println("The fibonacci number at position " + n + " is: " + result);
        return 0;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        fibonacciNum(n);

        
        sc.close();
    }
    
}
