package src.Part1;

import Part1.DoubleQueue;

public class DoubleQueueMain{
    public static void main(String[] args){
        DoubleQueue<Double> my_doublequeue=new DoubleQueueImpl<Double>();
        my_doublequeue.put(0.0);
        my_doublequeue.put(1.0);
        my_doublequeue.put(2.0);
        my_doublequeue.printQueue(System.out);

        my_doublequeue.get();
        my_doublequeue.printQueue(System.out);



    }
}