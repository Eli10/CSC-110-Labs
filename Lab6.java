/*
CSC 110
Lab 6 By Elijah Augustin
*/
import java.io.PrintWriter;
import java.io.*;
import java.io.File;
import javax.swing.JOptionPane;



public class Lab6 {

  

   public static void main (String[] args) throws IOException
   {
   
      
      
            String filepath;
            String secondChance;
            int tryAgain;
   
      do{
            filepath = JOptionPane.showInputDialog("Where would you like to save the file to? Ex) /Users/elijahaugustin/Desktop/sample.txt ");
            
            File file = new File(filepath);
         
            PrintWriter pw = new PrintWriter(file);
            
            
            pw.write(choiceAns(inviteUser("4"), askTemp("54.9")));
            
            pw.close();
            
            JOptionPane.showMessageDialog(null, "Conversion completed. Please check your file.");
            
                 
            secondChance = JOptionPane.showInputDialog("If you would like to do another conversion please press the number 7");
            tryAgain = Integer.parseInt(secondChance);
             
         
          } while (tryAgain == 7);
  
      }
  
   
    public static int inviteUser(String x)
    {
       
         String inputOption;
         int optionChoice;
       
         inputOption = JOptionPane.showInputDialog("What type of temperature conversion would you like to do?\n" + "\n" +
            " 1: Farhenheit to Celcius\n 2: Celcius to Farhenheit\n 3: Celcius to Kelvin\n" 
            + " 4: Kevlin to Celcius\n 5: Farhenheit to Kelvin\n 6: Kelvin to Farhenheit\n" + "\n" +
             " Enter Number for Option. Make sure it is a number between 1 and 6 ");
          optionChoice = Integer.parseInt(inputOption);
          
          return optionChoice;
   
     }
     
     public static double askTemp(String y)
     {
         String inputTemp;
         double temp;
         
         inputTemp = JOptionPane.showInputDialog("Please enter the temperature: ");
         temp = Double.parseDouble(inputTemp);
         
         return temp;

     
     }
     
     
     public static String choiceAns(int option, double temp)
     {
      
       double converted_temp;
      
        switch (option)
            {
            case 1:
               converted_temp = 5d/9d * (temp - 32);
               return temp + " to Celcius is " + converted_temp;
            case 2:
               converted_temp = (1.8 * temp) + 32;
               return  temp + " to Farhenheit is " + converted_temp;
            case 3:
               converted_temp = temp + 273;
               return temp + " to Kelvin is " + converted_temp;
            case 4:
               converted_temp = temp - 273;
               return temp + " to Celcius is " + converted_temp;
            case 5:
               converted_temp = 5d/9d * (temp - 32) + 273;
               return  temp + " to Kelvin is " + converted_temp;
            case 6:
               converted_temp = 9d/5d * (temp - 273) + 32;
               return temp + " to Farhenheit is " + converted_temp;
            default:
               return "Make sure you pick an option number that is listed!!!!!";
            
            }

     
     }
     
    
      
 

   
}
   


