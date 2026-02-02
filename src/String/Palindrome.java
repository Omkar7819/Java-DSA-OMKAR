package String;

import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String  :");
        
        String s = sc.nextLine();
        
        for(int i=0; i<s.length(); i++){
            char Start = s.charAt(i);
            char end = s.charAt(s.length()-1-i);
            if(Start!=end){
                System.out.println("Not a Palinadrom ");
                break;
            }
            System.out.println("IS Palindrome");
        }
        
        
    }
    
}
