package Part3;

import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.*;
import java.io.*;
import Part1.*;

public class NetProfit{
    public static void main(String[] args) throws FileNotFoundException {

        String path =args[0];

        DoubleQueue<Double> prices_queue=new DoubleQueueImpl<Double>();
        DoubleQueue<Double> amounts_queue=new DoubleQueueImpl<Double>();
        Scanner filescanner=new Scanner(new File(path));

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




                else if(next.equals("sell")){
                    String sell_amount=linescanner.next();
                    double amount=Double.parseDouble(sell_amount);
                    String t_string=linescanner.next();
                    String sell_price=linescanner.next();
                    double price =Double.parseDouble(sell_price);
                    double profit =compute_profit(amount,price,amounts_queue,prices_queue);
                    System.out.println("The profit is : " +  profit);






                }
            }

        }


    }


    static  double compute_profit(double my_amount,double my_price,DoubleQueue<Double> my_amounts,DoubleQueue<Double> my_prices){
            double my_profit=0.0;
            while(my_amount>0){
                double t_amount=my_amounts.get();
                double t_price=my_prices.get();
                if(my_amount<t_amount){
                    my_profit+=my_amount*(my_price-t_price);
                    my_amount=0;
                }
                else {
                    my_profit+=t_amount*(my_price-t_price);
                    my_amount-=t_amount;
                }
            }

            return my_profit;
    }

}