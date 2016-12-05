/*
Lab 3
By Elijah Augustin
*/

import javax.swing.JOptionPane;


public class timeConversion
{

   public static void main(String[] args)
   {
   
   //Variables
   String time;
   int timeInput;
   
   int secondsInAMin = 60;
   int secondsInAHour = 3600;
   int secondsInADay = 86400;
  
      
   // Asks for User Input in Seconds   
   time = JOptionPane.showInputDialog("Enter number of seconds: ");
   timeInput = Integer.parseInt(time);
   
   //Time Conversion Variables
   int minutes = ((timeInput % secondsInADay) % secondsInAHour) / secondsInAMin;
   int hours = (timeInput % secondsInADay) / secondsInAHour;
   int days = timeInput/secondsInADay;
   int seconds = ((timeInput % secondsInADay) % secondsInAHour) % secondsInAMin;


   
   
   if (timeInput >= secondsInADay)
   {
 
      JOptionPane.showMessageDialog(null, days + " days, " +  hours + " hours, "+ minutes + " minutes, " + seconds + " seconds"); 
   }
   
   else if (timeInput >= secondsInAHour && timeInput < secondsInADay)
   {

      JOptionPane.showMessageDialog(null, hours + " hours, "+ minutes + " minutes, " + seconds + " seconds"); 
      
   }   
   
   else if (timeInput >= secondsInAMin && timeInput < secondsInAHour)
   {
      
      JOptionPane.showMessageDialog(null, minutes + " minutes, " + seconds + " seconds");
   }
   
    else if (timeInput < secondsInAMin)
   {
       
       JOptionPane.showMessageDialog(null, seconds + " seconds");
      
   }
   
   System.exit(0);
   }


}