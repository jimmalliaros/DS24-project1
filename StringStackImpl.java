import java.util.NoSuchElementException;
import java.io.PrintStream;

public class StringStackImpl<String> implements StringStack<String>{
    private Node<String>  top;
    private int size=0;

    public boolean isEmpty(){
        return (size==0);
    }

    public void push(String item){
        Node<String> new_node=new Node<String>(item);

        if(top==null){
            top=new_node;
            size++;
        }

        else{
            new_node.setNext(top);
            top=new_node;
            size++;
        }
    }

    public String pop() throws NoSuchElementException {
         if(isEmpty()){
            throw new NoSuchElementException();
        }
        else {
            String my_string=top.getData();
            top=top.getNext();
            size=size-1;
            return my_string;


        }

    }


    public String peek() throws NoSuchElementException{
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        else{

            return top.getData();
        }
    }

    public void printStack(PrintStream stream){

        if(isEmpty()){
            stream.println("The list is empty!");
        }

        Node<String> current=top;
        while(current.getNext()!=null){
            stream.print(current.getData() + " -> ");
            current=current.getNext();
        }

    }


    public int size(){
        return size;
    }





}