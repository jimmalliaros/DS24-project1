package src.Part1;



import java.util.NoSuchElementException;
import java.io.PrintStream;

public class StringStackImpl<String> implements StringStack<String>{
    List<String> my_list=new List<String>();
    private int size=0;

    public boolean isEmpty(){
        return my_list.isEmpty();
    }

    public void push(String item){
        Node<String> temp=new Node<String>(item);
        my_list.insertAtFront(temp);
        size++;
    }

    public String pop() throws NoSuchElementException {

            String my_string=my_list.removeFromFront();
            size--;
            return my_string;






    }


    public String peek() throws NoSuchElementException{

        return my_list.returnFromFront();
    }

    public void printStack(PrintStream stream){
        my_list.print(stream);


    }


    public int size(){
        return size;
    }








}