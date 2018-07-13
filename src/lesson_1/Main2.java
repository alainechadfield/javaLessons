package lesson_1;

public class Main2 {
    public static void main(String[] args) {

//        main3(1, 2);

        int w = 15;
        int y = 15;

        main4(w, y);
        main4(2, 20);
    }


    private static void main2(){
        int a = 1;
        int b = 2;
        int c = a + b; //+ - sum

        System.out.println(6 + 7); // + - sum
        System.out.println("Java" + "Hello"); // + - concatenation
        System.out.println("Java " + 77); // + - concatenation
        System.out.println("Java" + 7 + 7);
        System.out.println(7 + 7 + " Java");
    }

    private static void main3(int a, int b){
        if (a < b) {
            System.out.println("number a " + a + " is less than b " + b);
        } else {
            System.out.println(a + " is bigger than " + b);
        }
    }

    private static void main4 (int w, int y){
        if (w == y) {
            System.out.println(w + " is equal to " + y);
        } else if (w < y) {
            System.out.println(w + " is less than " + y);
        } else {
            System.out.println(w + " is bigger than " + y);
        }
    }
}
