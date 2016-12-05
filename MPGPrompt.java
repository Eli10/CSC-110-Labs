import javax.swing.JOptionPane;


public class MPGPrompt 
{
   public static void main(String[] args)
   
   {
      
      double miles, gallons, MPG;
      String question;
      
      
      question = JOptionPane.showInputDialog("Miles driven: ");
      miles = Double.parseDouble(question);
      
      question = JOptionPane.showInputDialog("Gallons used: ");
      gallons = Double.parseDouble(question);
      
      
      MPG = miles / gallons;
      
      
      JOptionPane.showMessageDialog(null, "MPG: " + MPG);
      
      
      System.exit(0);
      
      
   
   
   }


}