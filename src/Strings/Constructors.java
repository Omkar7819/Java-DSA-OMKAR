package Strings;

public class Constructors {

    public static void main(String[] args) {
        
        String s1 = new String();
        System.out.println(s1.length());

        String s2 = new String("Omkar");
        System.out.println(s2);

        String s3 = new String(new StringBuffer());
        System.out.println(s3);

        String s4 = new String(new StringBuilder());
        System.out.println(s4);        
        

        //Char Array

        char[] ch = {'j','a','v','a'};
        String s5 = new String(ch);
        
        //Byte Array
        byte[] b = {97,98,99,100};
        String s6 = new String(b);
        System.err.println(s6);
    }
    
}
