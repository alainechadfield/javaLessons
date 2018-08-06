package lesson_8;

public abstract class Unit {

    String name;
    int position = 0;

    Unit(String n) {
        name = n;
    }

    void hit() {
        System.out.println("Base Hit");
    }

    void move() {
        System.out.println("Base move");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " "+ name + ", position=" + position; //Unit Artur, position=9
    }

}
