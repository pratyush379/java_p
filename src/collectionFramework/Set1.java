package collectionFramework;

import java.awt.*;
import java.util.*;

public class Set1 {
    public  static  void main(String[] args){
        Set<Integer> set = new HashSet<Integer>(); //Hashset

        for (int i = 0;i<100;i++){
           set.add(i);
        }

        for(int i : set){
            System.out.println(i);
        }

        Set<Integer> set2 = new LinkedHashSet<Integer>();//Linked hash set
        for (int i = 0;i<100;i++){
            set2.add(i);
        }


//        for(int i : set2){
//            System.out.println(i);
//        }

        Iterator itr = set2.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        Set<String> set3 = new HashSet<String>();
        Set<String> set4 = new LinkedHashSet<String>();//Linked hash set
        String a = null;
        set3.add(a);
        set4.add(a);
        System.out.println(a);
        System.out.println(a);

        SortedSet<Integer> set5 = new TreeSet<Integer>(); //TreeSet

        set5.add(5);
        set5.add(5);
        set5.add(1);
        set5.add(3);

        Iterator itr2 = set5.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
