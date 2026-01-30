package FlowControl.Iteration;

import java.util.Scanner;   

public class primenumber {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1){
            System.out.println(n + " is not a prime number.");

        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.println(n + " is a prime number.");
                return;
            }
        }
        
        sc.close();
        
    }
    
}
