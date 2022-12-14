package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> set1 = new LinkedHashSet<>();
        set1.add("1");
        set1.add("2");
        set1.add("3");

        Set<String> set2 = new LinkedHashSet<>();
        set2.add("0");
        set2.add("1");
        set2.add("2");

        System.out.println(set1);
        System.out.println(set2);

        System.out.println(symmetricDifference(set1, set2)); // {0, 3}
    }
  
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> set = new HashSet<>();
        set.addAll(set1);
        set.addAll(set2);

        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            T item = it.next();
            if (set1.contains(item) && set2.contains(item)) {
                it.remove();
            }
        }

        return set;
    }
}
