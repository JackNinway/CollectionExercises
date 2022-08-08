package org.example;

//import java.util.ArrayList;
import java.util.*;

public class CollectionExercises {
    ArrayList<String> weekDays = new ArrayList<>();

    public CollectionExercises() {
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednsday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
        System.out.println(weekDays);
    }

    public void  iterateWeekDays() {
        Iterator<String> iterator = weekDays.iterator();
        while (iterator.hasNext()) {
             String s = iterator.next();
             System.out.println(s);
        }
    }
}








