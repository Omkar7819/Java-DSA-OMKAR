package Strings;

public class Example {
    public static void ex1() {
        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println(s1 == s2);

        String s3 = "Java";

        System.out.println(s1 == s3);

        String s4 = "Java";

        System.out.println(s3 == s4);

        String s5 = "Ja" + "va";
        System.out.println(s4 == s5);

        String s6 = "Ja";
        String s7 = s6 + "va";

        System.out.println(s4 == s7);

        final String s8 = "Ja";
        String s9 = s8 + "va";
        System.out.println(s4 == s9);
    }

    public static void ex2() {
        String s1 = new String("Hello");
        s1.concat("HI");
        String s2 = s1.concat(" World");

        System.out.println(s1);
        System.out.println(s2);
    }

    public static void ex3() {
        String s1 = "  Hello World  ";
        System.out.println("Original: '" + s1 + "'");
        String s2 = s1.trim();
        System.out.println("Trimmed: '" + s2 + "'");
    }

    public static void ex4() {
        // String s = new String(char[] ch);
        char[] ch = { 'H', 'e', 'l', 'l', 'o' };
        String s1 = new String(ch);
        System.out.println(s1);
    }

    public static void ex5() {
        String s = new String("Java");
        String s1 = "java";
        System.out.println(s.equals("Java"));
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(s == s1);

    }

    public static void ex6() {
        String s = new String("java");
        String s1 = s.toUpperCase();
        String s2 = s.toLowerCase();
        System.out.println(s == s2);
        System.out.println(s == s1);
        System.out.println(s1 == s2);
    }

    public static void ex7() {
        String s1 = "java";
        String s2 = s1.toString();
        String s3 = s1.toUpperCase();
        String s4 = s1.toLowerCase();
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
    }

    public static void ex8() {
        final StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);
    }

    public static void ex9() {
        String s = " ";
        s.trim();// reference is not give
        System.out.println(s.equals("") + "    " + s.isEmpty());
    }

    public static void ex10() {
        String s = "Hello World";
        int len = s.trim().length();
        System.out.println(len);
    }

    public static void ex11() {
        StringBuffer sb = new StringBuffer(5);
        String s = "..";
        if (sb.equals(s)) {
            System.out.println("Match 1");
        } else if (sb.toString().equals(s)) {
            System.out.println("Match 2");
        } else {
            System.out.println("No Match");
        }

    }

    public static void main(String[] args) {
        ex11();
    }

}
