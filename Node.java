public class Node{
    protected String data;
    protected  Node next=null;

    Node(String data){
        this.data=data;

    }

    public  void setData(String data){
        this.data=data;
    }
    public String getData(){
        return data;
    }

    public void setNext(Node  next_node){
        this.next=next_node;
    }

    public void setNext(String next_data){
        this.next=new Node(next_data);
    }

    public Node getNext(){
        return next;
    }

    public String getNext_data(){
        return next.getData();
    }





}