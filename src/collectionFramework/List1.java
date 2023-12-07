package collectionFramework;

import java.util.*;

public class List1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); //array list
        list.add(1);
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Iterator itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        List<Integer> list2 = new LinkedList<>(); //linked list

        for (int i = 0; i < 10; i++) {
            list2.add(i+2);
        }

        Iterator itr2 = list2.iterator();

        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        List<Integer> list3 = new Vector<>(); //Vector

        for (int i = 0; i < 10; i++) {
            list3.add(i + 3);
        }

        Iterator itr3 = list3.iterator();

        while (itr3.hasNext()) {
            System.out.println(itr3.next());
        }


        Stack<Integer> list4 = new Stack<>(); //stack

        for (int i = 0; i < 10; i++) {
        list4.add(i+4);
        }

        Iterator itr4 = list4.iterator();

        while (itr4.hasNext())
        {
            System.out.println(itr4.next());
        }

        int top = list4.peek();

        System.out.println("Top element stack ---->"+ top);
        System.out.println("pop element stack ---->"+ list4.pop());

        top = list4.peek();
        System.out.println("Top element stack after pop ---->"+ top);

        list4.push(16);
        top = list4.peek();
        System.out.println("Top element stack after push(16) ---->"+ top);

    }
}
