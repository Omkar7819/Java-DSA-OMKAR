package String;

public class Example {

    public static void main(String[] args){
        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println(s1==s2);

        String s3 = "Java";

        System.out.println(s1==s3);

        String s4 = "Java";

        System.out.println(s3==s4);

        String s5 = "Ja" + "va";
        System.out.println(s4==s5);

        String s6 = "Ja";
        String s7 = s6 + "va";

        System.out.println(s4==s7);

        final String s8 = "Ja";
        String s9 = s8 + "va";
        System.out.println(s4==s9);
    }
    
}
