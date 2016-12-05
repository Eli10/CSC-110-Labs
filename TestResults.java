import javax.swing.JOptionPane;

public class TestResults 
{
   public static void main(String[] args)
   {
      int testScore;
      String input;
      
      do {
      input = JOptionPane.showInputDialog("Enter your numeric test score and I will tell you the grade");
      testScore = Integer.parseInt(input);
      
      } while (testScore <= 0 || testScore >= 100);
      
      if (testScore < 60)
      {
         JOptionPane.showMessageDialog(null, "Your grade is F.");
      }
      else if (testScore < 70)
      {
         JOptionPane.showMessageDialog(null, "Your grade is D.");
      }
      else if (testScore < 80)
      {
         JOptionPane.showMessageDialog(null, "Your grade is C.");
      }
      else if (testScore < 90)
      {
         JOptionPane.showMessageDialog(null,"Your grade is B.");
      }
      else
      {
         JOptionPane.showMessageDialog(null, "Your grade is A.");
      }
      
      System.exit(0);
   
   
   }

}