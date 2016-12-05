import java.util.Scanner;
//import javax.


public class MPG {

   public static void main(String[] args)
   {
      double miles, gallons, MPG;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Miles driven: ");
      miles = keyboard.nextDouble();
      
      System.out.println("Gallons used: ");
      gallons = keyboard.nextDouble();
      
      
      MPG = miles / gallons;
      
      
      System.out.println("MPG: " + MPG );
   
   
   
   
   }


}