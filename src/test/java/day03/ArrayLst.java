package day03;

import java.util.ArrayList;

public class ArrayLst {
    public static void main(String[] args) {
        ArrayList<String> cities=new ArrayList<>();
        cities.add("Miami");
        cities.add("New York");

        if(cities.size()<6){
            System.out.println("oldu mu");
        }
cities.set(3,"asd");
}
}