import java.io.PrintWriter;
import java.io.*;
import java.io.File;

public class ArgumentDemo
{
   public static void main(String[] args) throws IOException
   {
   
      File file = new File("/Users/elijahaugustin/Desktop/out.txt");
   
      PrintWriter pw = new PrintWriter(file);
      
      for(int n = 1; n <= 1000; n++)
      {
         pw.write(showKilometers(n));
      }
      
      pw.close();
   
   }
   
   public static String showKilometers(double miles)
   {
      double kilometers = Math.round(miles * 1.609);
      return miles + " miles is equal to " + kilometers + " kilometers.\n";
      
   }

}