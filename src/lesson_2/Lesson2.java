package lesson_2;

public class Lesson2 {
    public static void main(String[] args) {

        printSum(1, 2);
        printSum(4, 5);
        int a = sum(1, 2);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(a);
        System.out.println(sum(1, 2) + 7);
        System.out.println(sum(1, 3 / 2));
        System.out.println(sum(1.5, 3.0 / 2));

        int x = 15;

        if (checkOrder(x)) {
            System.out.println("order");
        } else {
            System.out.println("no order");
        }

        System.out.println(checkOrder2(4));
        System.out.println(checkOrder(17));
    }

    private static void printSum(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    private static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    private static double sum(double a, double b) {
        return a + b;
    }

    private static boolean checkOrder(int a) {

        if (a % 2 == 0) {

            return true;
        } else {
            return false;
        }
    }

    private static boolean checkOrder2(int a) {
        boolean b = (a % 2 == 0) ? true : false;
        return b;
    }

    private static boolean checkOrder3(int a) {
        // a % 2 == 0 ? true : false;
        return (a % 2 == 0) ? true : false;
    }

    private static boolean checkOrder4(int a) {
        return (a % 2 == 0);
    }
}

/*
-1. сделать метод void greeting(String name)
который выводит в консоль "Hello, name"

т.е. если greeting("Alona") то в консоле "Hello, Alona"

0. метод passphrase(String pass)
если pass.equals("abc") то в консоль "Welcome" иначе "go out"

1. сделать метод который принимает в качестве параметро целое число (год)
и печатает на консольной слово "высокосный" если год высокосный, иначе "не высокосный"

2. сделать калькулятор: метод принимает 3 параметра, и возвращает double
    char - операция: '+', '-', '*', '/'
    double - число1
    double - число2
   и возвращает результат в соответствии с операцией
   если в качестве операции пришёл другой char, то выводить в консоль "операция не поддерживается" и возвращать -1.0
 */
