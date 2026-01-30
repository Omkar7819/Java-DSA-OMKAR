package FlowControl.Iteration;

import java.util.Scanner;

public class sumofalldigit {public static void main(String[] args) {
        System.out.println("Enter the n numbeer: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        for(int i=0; i<=n; i++){
            result = result + i;
            
        }
        System.out.println(result);
    }
    
}
