import java.io.PrintStream;
import java.util.NoSuchElementException;

public class DoubleQueueImpl<Double> implements DoubleQueue<Double>{
    Node<Double> head=null;
    Node<Double> tail=null;
    int size=0;


    public boolean isEmpty(){
        return (size==0);
    }

    public void put(Double item){
        Node<Double> new_node=new Node<Double>(item);
        if(head==tail){
            head=new_node;
            tail=new_node;
            size++;
        }

        else{
            tail.setNext(new_node);
            tail=new_node;
            size++;
        }
    }

    public Double get() throws NoSuchElementException{
        if(isEmpty()){
            throw new NoSuchElementException();
        }

        else{
            Double my_double=head.getData();
            head=head.getNext();
            return my_double;
        }
    }




    public int size(){
        return size;
    }


}