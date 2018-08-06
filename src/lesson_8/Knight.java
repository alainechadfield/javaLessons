package lesson_8;

public class Knight extends Unit{

    Knight(String n){
        super(n);
    }

    @Override
    void hit(){
//        super.hit();
        System.out.println("Knight " + this.name + " hits");
    }



    @Override
    void move(){
        position = position + 1;
    }


}
