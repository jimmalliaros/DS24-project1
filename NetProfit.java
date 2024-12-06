import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.*;
import java.io.*;

public class NetProfit{
    public static void main(String[] args) throws FileNotFoundException {
        DoubleQueue<Double> prices_queue=new DoubleQueueImpl<Double>() ;
        DoubleQueue<Double> amounts_queue=new DoubleQueueImpl<Double>() ;
        Scanner filescanner=new Scanner(new File("stock.txt"));

        while(filescanner.hasNextLine()){
            String my_line=filescanner.nextLine();
            Scanner linescanner =new Scanner(my_line);

            while(linescanner.hasNext()){
                String next=linescanner.next();

                if(next.equals("buy")){
                    String my_amount=linescanner.next();
                    amounts_queue.put(Double.parseDouble(my_amount));
                    System.out.println(my_amount);
                }
                else if (next.equals("price")) {
                    String my_price=linescanner.next();
                    prices_queue.put(Double.parseDouble(my_price));
                    System.out.println(my_price);
                }




                else{
                    continue;
                }
            }

        }

        prices_queue.printQueue(System.out);
        amounts_queue.printQueue(System.out);
    }
}