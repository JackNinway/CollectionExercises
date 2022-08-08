package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashExercise {
    HashSet<String> hashSet = new HashSet<>();

    public void setHashSet() {
        hashSet.add("aMonday");
        hashSet.add("bTuesday");
        hashSet.add("cWednsday");
        hashSet.add("dThursday");
        hashSet.add("eFriday");
        hashSet.add("fSaturday");
        System.out.println("\n  ---- print hashSet: ----    \n" + hashSet);
        ArrayList<String>  passedToArrayList = new ArrayList<>(hashSet);
        System.out.println("\n  Convert it to arrayList by constructor parameter\n" + passedToArrayList);
        passedToArrayList.clear();
        passedToArrayList.addAll(hashSet);
        System.out.println("\n  Move hashSet to ArrayList by addAll()\n" + passedToArrayList);
// manually  sorting 7
        String tmpStr;
        for (int i = 0; i < passedToArrayList.size() - 1; i++) {
            for (int j = i + 1; j < passedToArrayList.size(); j++) {
                if (passedToArrayList.get(i).compareToIgnoreCase(passedToArrayList.get(j)) > 0) {
                    tmpStr = passedToArrayList.get(i);
                    passedToArrayList.set(i, passedToArrayList.get(j));
                    passedToArrayList.set(j, tmpStr);
                }
            }
        }
        System.out.println("\nManually sorted array list:\n" + passedToArrayList);
// sorting exc.8
        Collections.sort(passedToArrayList);
        System.out.println("\nSorted by Collections.sort:\n" + passedToArrayList);
    }
}
