package DataType;

import java.util.Scanner;

public class uppertolowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        StringBuilder result1 = new StringBuilder();
        StringBuilder result2 = new StringBuilder();

        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                char lowerCh = (char)(ch + 32); 
                result1.append(lowerCh);
                result2.append(ch);
            } 
            else if(ch >= 'a' && ch <= 'z'){
                char upperCh = (char)(ch - 32); 
                result2.append(upperCh);
                result1.append(ch);
            }
            else {
                result1.append(ch);
                result2.append(ch);
            }
        }

        System.out.println("Lower Converted string: " + result1.toString());
        System.out.println("Higher Converted string: " + result2.toString());
        sc.close();
    }
    
}
