public class List{
    protected Node head=null;
    protected  Node tail=null;


    public  boolean isEmpty(){
        return (head==null);
    }

    public void insertAtFront(Node my_node){
        if(isEmpty()){
            head=my_node;
            tail=my_node;
        }

        else{
            my_node.setNext(head);
            head=my_node;
        }
    }

    public void insertAtEnd(Node my_node){
        if(isEmpty()){
            head=my_node;
            tail=my_node;
        }
        else {
            tail.setNext(my_node);
            tail=my_node;
        }
    }

    public String removeFromFront() throws Exception{
        if(isEmpty()){
            throw new Exception("The list is empty!");
        }

        else{
            String my_data=head.getData();
            if(head==tail){
                head=null;
                tail=null;
            }
            else{
                head=head.getNext();

            }

            return my_data;
        }

    }


    public String removeFromEnd() throws Exception{
        if(isEmpty()){
            throw new Exception("List is empty!");
        }

        else{
            String my_data=tail.getData();
            if(head==tail){
                head=null;
                tail=null;
            }

            else{
                Node current=head;
                while(current.getNext()!=tail){
                    current=current.getNext();
                }

                current.setNext((Node) null);
                tail=current;
            }

            return my_data;
        }



    }





}