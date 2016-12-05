import javax.swing.JOptionPane;

public class Choices {

   public static void main (String [] args)
   
   {
      String x, y;
      double new_x, new_y;
   
   
      x = JOptionPane.showInputDialog("X: ");
      new_x= Double.parseDouble(x);
      y = JOptionPane.showInputDialog("Y: ");
      new_y = Double.parseDouble(y);

      if (new_x > new_y)
      {
         JOptionPane.showMessageDialog(null, new_x + " is greater than " + new_y);
      }
      
      if (new_x == new_y)
      {
         JOptionPane.showMessageDialog(null, new_x + " is equal to " + new_y);
      }
      
      if (new_x != new_y)
      {
         JOptionPane.showMessageDialog(null, new_x + " is not equal to " + new_y);
         new_x = new_y;
         JOptionPane.showMessageDialog(null, "But it is now ");
         
      
      }
      
   
   }

}