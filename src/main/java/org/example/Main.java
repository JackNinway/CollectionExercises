package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CollectionExercises cE = new CollectionExercises();
        Iterator<String> iterator = cE.weekDays.iterator();
        System.out.println(cE.weekDays);

        System.out.println("\n  Iterate by for loop");
        for (String s : cE.weekDays)
            System.out.println(s);

        System.out.println("\n  Iterate by iterator in Main");
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
        System.out.println("\n  Iterate by iterator from Main");
        cE.iterateWeekDays();

// adding Thursday to the list
        cE.weekDays.add(3,"Thursday");
        System.out.println("\n      --------- Adding Thursday to the list : ---------     " );
        System.out.println( cE.weekDays);

// Creating sublist
        List<String> weekDaysSubList = new ArrayList<>();
        weekDaysSubList = cE.weekDays.subList(0,3);
        System.out.println("\n      --------- Create sublist: : ---------     " );
        System.out.println( weekDaysSubList);

// HashSet
        HashExercise hE = new HashExercise();
        hE.setHashSet();
        Iterator<String> iteratorHS = hE.hashSet.iterator();
        System.out.println("\n      --------- iterator for hashset: ---------     " );
        while(iteratorHS.hasNext()){
            String str = iteratorHS.next();
            System.out.println(str);
        }
// MashMap #9
        HashMapExercise hmEx = new HashMapExercise();
        hmEx.setCarsHM();
    }
}

