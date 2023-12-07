package collectionFramework;

import java.util.PriorityQueue;
import java.util.*;
public class Queue1 {

    public  static  void main(String[] args){


        Queue<Integer> q = new PriorityQueue<Integer>();//Priority queue
        for(int i =0;i<10;i++){
            q.add(i);
        }

        Deque<Integer> d = new ArrayDeque<Integer>(); //ArrayDeque
        for (int i =0 ; i<10;i++){
            d.add(i+1);
        }


    }
}
