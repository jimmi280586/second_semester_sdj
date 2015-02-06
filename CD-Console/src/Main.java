import java.io.IOException;

import javax.swing.JOptionPane;

import cd.domain.mediator.CdTextFile;
import cd.view.CdConsole;

public class Main
{
   public static void main(String args[])
   {
      try
      {
        

         CdView view = new CdConsole();
         view.start(cdList);
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }
   }

}
