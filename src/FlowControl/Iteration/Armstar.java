package FlowControl.Iteration;

import java.util.Scanner;

public class Armstar {

    public static int  count(int n){
        int count = 0;
        while(n != 0){
            count++;
            n /= 10;
        }
        return count;
    }

    public static boolean isArmatar(int n){
        int count = count(n);
        int current = n;
        int   sum =0;
        while(current != 0){
            int digit = current % 10;
            sum +=(int)Math.pow(digit, count);
            current /= 10;
        }
        return sum ==n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            if(isArmatar(i)){
                System.out.print(i + " ");
            }
        }
        sc.close();
        
    }
    
}
