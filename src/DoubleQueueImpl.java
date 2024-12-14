

import java.io.PrintStream;
import java.util.NoSuchElementException;

public class DoubleQueueImpl<Double> implements DoubleQueue<Double>{

    List<Double> my_list=new List<Double>();
    int size=0;

    public boolean isEmpty(){
        return my_list.isEmpty();
    }

    public void put(Double item){
        Node<Double> temp=new Node<Double>(item);
        my_list.insertAtEnd(temp);
        size++;
    }

    public Double get() throws NoSuchElementException{
        Double my_double=my_list.removeFromFront();
        size--;
        return my_double;
    }

    public Double peek() throws NoSuchElementException{
        return my_list.returnFromFront();
    }

    public void printQueue(PrintStream stream){
        my_list.print(stream);

    }

    public int size(){
        return  size;
    }


}