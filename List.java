import java.io.PrintStream;
import java.util.*;
public class List<T>{
    private Node<T> head=null;
    private Node<T> tail=null;

    public boolean isEmpty() {
        return head==null;
    }

    public void insertAtFront(Node<T> my_node ){
        if(isEmpty()){
            head=my_node;
            tail=my_node;

        }

        else{
                my_node.setNext(head);
                head=my_node;

        }
    }

    public T removeFromFront() throws NoSuchElementException{
        if(isEmpty()){
            throw new NoSuchElementException();
        }

        else{
            T removed_data=head.getData();
            if(head==tail){
                head=null;
                tail=null;
                return removed_data;


            }
            else {
                head=head.getNext();
                return removed_data;
            }

        }
    }


    public void insertAtEnd(Node<T> my_node){
        if(isEmpty()){
            head=my_node;
            tail=my_node;
        }

        else{
            tail.setNext(my_node);
            tail=my_node;
        }
    }


    public T removeFromEnd() throws NoSuchElementException{
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        else{
            T removed_data=tail.getData();
            if(head==tail) {
                head = null;
                tail = null;

            }

            else{
                Node<T> current =head;
                while(current.getNext()!=tail){
                    current=current.getNext();
                }
                current.setNext(null);
                tail=current;



            }

            return removed_data;
        }
    }

    public T returnFromEnd() throws NoSuchElementException{
        if(isEmpty()){
            throw new NoSuchElementException();

        }
        else{

            return tail.getData();
        }

    }

    public T returnFromFront() throws NoSuchElementException{
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        else{
            return head.getData();
        }
    }

    public void print(PrintStream printStream){
        if(isEmpty()){
            System.out.println("List is empty!");
        }

        else{
            Node<T> current=head;
            StringBuilder sb=new StringBuilder();

            sb.append("HEAD -> ");

            while(current!=null){
                sb.append(current.getData().toString());
                if(current.getNext()!=null){
                    sb.append(" -> ");
                }
                current=current.getNext();
            }
            sb.append(" <- TAIL");
            printStream.println(sb);
        }
    }

}