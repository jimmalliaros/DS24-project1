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

    public T removeFromFront() throws Exception{
        if(isEmpty()){
            throw new Exception("The list is empty!");
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


    public T removeFromEnd() throws Exception{
        if(isEmpty()){
            throw new Exception("The list empty!");
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

}