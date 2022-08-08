package org.example;

import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

public class HashMapExercise {
    HashMap<Integer, String>  carsHM = new HashMap<>();
    public void setCarsHM() {
        Car c1 = new Car(1,"Audi", "A7");
        Car c2= new Car(2,"VW", "Golf");
        Car c3= new Car(3, "MB", "200");
        Car c4= new Car(4, "BMW", "M5");

        HashMap<Integer, Car>  ocarsHM = new HashMap<>();

        ocarsHM.put(1, c1);
        ocarsHM.put(2, c2);
        ocarsHM.put(3, c3);
        ocarsHM.put(4, c4);

        carsHM.put(1, "Audi") ;
        carsHM.put(2,"VW");
        carsHM.put(3,"MB");
        carsHM.put(4,"BMW");

        System.out.println("\n  ----- Print out entire HashMap: -----\n" + carsHM);
        System.out.println("\n  ----- Print out Keys in HashMap: -----\n" + carsHM.keySet());
        System.out.println("\n  ----- Print out Values in HashMap: -----\n" + carsHM.values());
        for(Car c : ocarsHM.values()){
            System.out.println("\n  ----- Print out brand in Object in HashMap loop through values: -----\n" +  c.getBrand());
        }
        for(Map.Entry me : ocarsHM.entrySet()) {
            System.out.println("\n  ----- Print out brand in Object in HashMap loop through entrySet : -----\n" +  ((Car) me.getValue()).getBrand());
        }
    }
}
