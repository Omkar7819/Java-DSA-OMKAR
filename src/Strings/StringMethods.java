package Strings;

public class StringMethods {
    public static void main(String[] args) {
        
        String s = new String("java");
        
        System.out.println(s.charAt(0));
        System.out.println(s.concat(" Prog"));
        System.err.println(s.equals("Java"));
        System.err.println(s.equalsIgnoreCase("Java"));
        System.err.println(s.length());
        System.err.println(s.isEmpty());
        System.err.println(s.replace('j', 'y'));
        System.out.println(s.indexOf('v'));
        System.err.println();


    }
    
}
