/*
CSC 110
Lab 4 By Elijah Augustin
*/
import java.io.PrintWriter;
import java.io.*;
import java.io.File;
import javax.swing.JOptionPane;

public class SwitchTempConversion 
{
   public static void main(String[] args)
   {
   //Declaring variables
   String inputOption;
   int optionChoice;
   String inputTemp;
   double temp;
   double converted_temp;
   String secondChance;
   int tryAgain;
   
   
   // The program will run again if the conditon for the "while" is met at the bottom of the code.
   do
   {
         // Ask user what conversion they would like to make
         inputOption = JOptionPane.showInputDialog("What type of temperature conversion would you like to do?\n" + "\n" +
         " 1: Farhenheit to Celcius\n 2: Celcius to Farhenheit\n 3: Celcius to Kelvin\n" 
         + " 4: Kevlin to Celcius\n 5: Farhenheit to Kelvin\n 6: Kelvin to Farhenheit\n" + "\n" +
          " Enter Number for Option. Make sure it is a number between 1 and 6 ");
         optionChoice = Integer.parseInt(inputOption);
         
         // Ask user for temperature
         inputTemp = JOptionPane.showInputDialog("Please enter the temperature: ");
         temp = Double.parseDouble(inputTemp);
         
         
         // Does the conversion and prints result based on option choice
         switch (optionChoice)
         {
         case 1:
            converted_temp = 5d/9d * (temp - 32);
            JOptionPane.showMessageDialog(null, temp + " to Celcius is " + converted_temp);
            break;
         case 2:
            converted_temp = (1.8 * temp) + 32;
            JOptionPane.showMessageDialog(null, temp + " to Farhenheit is " + converted_temp);
            break;
         case 3:
            converted_temp = temp + 273;
            JOptionPane.showMessageDialog(null, temp + " to Kelvin is " + converted_temp);
            break;
         case 4:
            converted_temp = temp - 273;
            JOptionPane.showMessageDialog(null, temp + " to Celcius is " + converted_temp);
            break;
         case 5:
            converted_temp = 5d/9d * (temp - 32) + 273;
            JOptionPane.showMessageDialog(null, temp + " to Kelvin is " + converted_temp);
            break;
         case 6:
            converted_temp = 9d/5d * (temp - 273) + 32;
            JOptionPane.showMessageDialog(null, temp + " to Farhenheit is " + converted_temp);
            break;
         default:
            JOptionPane.showMessageDialog(null, "Make sure you pick an option number that is listed!!!!!");
         
         }
         
         
      
         secondChance = JOptionPane.showInputDialog("If you would like to do another conversion please press the number 7");
         tryAgain = Integer.parseInt(secondChance);
          
         
   }  while (tryAgain == 7);
   
     System.exit(0);
   
   } 


}