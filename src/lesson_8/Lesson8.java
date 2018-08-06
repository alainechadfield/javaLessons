package lesson_8;

import java.util.ArrayList;

public class Lesson8 {

    public static void main(String[] args) {

//        ArrayList<Unit> list = new ArrayList<>();
//        list.add(new Knight("Petya"));
//        list.add(new Archer("Vasya"));
//        list.add(new Archer("Masha"));

//        for(int i=0; i < list.size(); i++){
//            Unit u = list.get(i);
//            u.hit();
//        }

        /*
        HOMEWORK
         */
        Unit[] list = {new Knight("Petya"), new Archer("Vasya"), new Archer("Masha")};
        for(int i=0; i < list.length; i++){
            Unit u = list[i];
            System.out.println(u);
            u.hit();
            u.move();
            System.out.println(u);
        }

    }

    //1. переделать со списка на массив

    //2. create method move() and field position. //
    // Method move() in class Archer must move archer on 3 meters
    // Method move() in class Knight must move knight on 1 meters
    // Create toString() which shows inner fields values
}
