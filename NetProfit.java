import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.*;

public class NetProfit{
    public static void main(String[] args){
        DoubleQueue<Double> prices_queue=new DoubleQueueImpl<Double>() ;
        DoubleQueue<Double> amounts_queue=new DoubleQueueImpl<Double>() ;
        Scanner filescanner=new Scanner("stock.txt");

        while(filescanner.hasNextLine()){
            String my_line=filescanner.nextLine();
            Scanner linescanner =new Scanner(my_line);
            while(linescanner.hasNext()){
                String next=linescanner.next();
                
            }

        }
    }
}