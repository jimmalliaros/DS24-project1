import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagChecking{
    public static void main(String[] args) throws FileNotFoundException ,TagsNotMatchingExc{
       StringStack<String> my_stack=new StringStackImpl<>();

        Scanner filescanner =new Scanner(new File("myfile.html"));




        Pattern my_pattern=Pattern.compile("</?[a-z]+[1-7]?>");



        while(filescanner.hasNextLine()){
            String my_line=filescanner.nextLine();

            Matcher my_matcher=my_pattern.matcher(my_line);

            while(my_matcher.find()){
                String my_string=my_matcher.group();

                if(my_string.equals("<br>") ||my_string.equals("<img>")){
                    continue;
                }
                else if (my_string.startsWith("</")) {
                    String previous=my_stack.peek();
                    String new_string=my_string.replace("/","");
                    if(new_string.equals(previous)){
                        my_stack.pop();
                    }
                    else{
                          throw  new TagsNotMatchingExc();  
                    }
                }

                else{
                    my_stack.push(my_string);
                }
            }


        }






    }
}