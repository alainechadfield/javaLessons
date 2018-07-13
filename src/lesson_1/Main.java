package lesson_1;

public class Main {

    public static void main(String[] args) {
        int a;
        a = 1;
        int a2 = 2; int a3 = -3; // binary operator
        int a4 = -a3; // - unary operator
        String name;
        name = "alena";
        byte b1 = 127;//1 byte ; 1 byte - 8 bit; 2^n (amount of bits) = amount of variants // -128..127
        short s;//2 bytes - 2^16
        int i; //4bytes - 2^32 // -2^31 .. 2^31 - 1
        long l = 15L; //8bytes - 2^64 //-2^63 .. 2^63 - 1

        b1 = (byte)130;
        int i2 = 0xf7;

        float f = 2.5F;// 4byte
        double d = 3.5; //8 byte
        double d2 = 2.5D;
        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool3 = 1 > 3;
        char c = 80; //2 byte //ASCII
        char c2 = 'a';
        char c3 = 'ק';
        char c4 = '\n'; // \t - tabulation ; \n - new line; \\ - it's one \; \' - ' ; \" - " (inside string)
        char c5 = ';' ;
        char c6 = ':';
        char c7 = '\"';
        char c8 = '\u0030';



        System.out.println("hello \"java\"");
        System.out.println("hello " + c7 + "java" + c7);
        System.out.print(a);
        System.out.println(a2);
        System.out.println(name);
        System.out.println(b1);
        System.out.println(bool3);
        System.out.println(c);
        System.out.println(a4);
    }
}
