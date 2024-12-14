

public class Node<T>{
    protected  T data;
    protected  Node<T> next=null;


    Node(T data){
        this.data=data;
    }

    public void setNext(Node<T> my_node){
        this.next=my_node;
    }

    public Node<T> getNext(){
        return this.next;
    }

    public void setData(T data){
        this.data=data;
    }

    public T getData(){
        return data;
    }






}