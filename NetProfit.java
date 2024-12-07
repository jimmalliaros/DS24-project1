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
            for(int i=1; i<=my_amounts.size(); i++){
                double t_amount=my_amounts.get();
                double t_price=my_prices.get();
                my_profit+=t_amount*(my_price-t_price);

            }

            return my_profit;
    }

}