package FlowControl.Iteration;

import java.util.Scanner;
public class sumofevenodd {
    public static void main(String[] args){
        System.out.println("Enter the n number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evensum = 0;
        int oddsum = 0;
        for(int 
            i=1; i<=n; i++){
            if(i%2==0){
                evensum = evensum + i;
            }
            else{
                oddsum = oddsum + i;
            }
        }
        sc.close();
        System.out.println("Sum of even numbers: " + evensum);
        System.out.println("sum of Odd number: " + oddsum);

    }
    
}
