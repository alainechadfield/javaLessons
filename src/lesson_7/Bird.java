package lesson_7;

public class Bird {

    private boolean flight = true; //can;t modify or read


    void flyUp() {
        flight = true;
        System.out.println("I am flying");

    }

    void land() {
        flight = false;
        System.out.println("I am landing on the tree");

    }

    boolean isFlight() {
        return flight;
    }



}
