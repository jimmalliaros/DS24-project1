package  Part1;
public class StringStackMain{
    public static void main(String[] args){
        StringStack<String> my_stack=new StringStackImpl<String>();

        my_stack.push("Jim");
        my_stack.push("George");
        my_stack.push("Antonis");
        my_stack.printStack(System.out);
        my_stack.pop();
        my_stack.printStack(System.out);
    }

}