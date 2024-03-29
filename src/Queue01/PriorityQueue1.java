package Queue01;


import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;



public class PriorityQueue1 {


    public static void main(String[] args) {
        Queue pq = new PriorityQueue();
        pq.offer(10); //offer means add
        pq.offer(30);
        pq.offer(35);
        System.out.println(pq);



        //correctway

        Queue<Integer> intq = new PriorityQueue<>();
        intq.add(123);
        intq.add(10);
        intq.add(40);
        System.out.println(intq);

        //intq.poll();// delete the first value in the queue
        System.out.println(intq);
        System.out.println(intq.peek());
        System.out.println("------------");




        Iterator iterator = intq.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next() + " ");

        }






    }




}
