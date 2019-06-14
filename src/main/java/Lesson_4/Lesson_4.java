package Lesson_4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson_4 {
    public static void main(String[] args) {

        /*Task 1*/
        ArrayList ArrayList = new ArrayList();
        ArrayList.add("10");
        ArrayList.add("25");
        ArrayList.add("50");
        System.out.println(ArrayList);
        System.out.println();


        /*Task 2*/
        System.out.println(Vehicles.BMW);
        System.out.println(Vehicles.OPEL);
        System.out.println(Vehicles.AUDI);
        System.out.println(Vehicles.HONDA);
        System.out.println(Vehicles.FORD);
        System.out.println();


        /*Task 4*/
        task4();
        System.out.println();
        System.out.println();

        /*Task 5*/
        List<String> actors = Arrays.asList("John Travolta", "Johny Depp", "Jessica Alba", "Will Smith", "Angelina Jolly");

        for (int i=0; i<actors.size(); i++){
            String actor = actors.get(i);
            System.out.println(actor);
        }
        System.out.println("Размер массива:" + " " + actors.size());
        System.out.println();

        /*Task 6*/
        




    }

    public enum Vehicles {
        BMW,
        OPEL,
        AUDI,
        HONDA,
        FORD
    }


    static void task4() {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 10));
            System.out.print(array[i] + " ");
        }
    }

}
