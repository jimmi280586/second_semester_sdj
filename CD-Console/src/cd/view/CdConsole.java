package cd.view;
import java.util.Scanner;

import cd.controller.Controller;
import cd.domain.model.*;
public class CdConsole implements CdView
{
   private Scanner in;
   private Controller controller;

   public CdConsole()
   {
      in = new Scanner(System.in);
      controller = null;
   }

   @Override
   public void show(String value)
   {
      System.out.println(value);
   }

   @Override
   public String get(String what)
   {
      System.out.print("Please enter: " + what + ": ");
      String input = in.nextLine();
      return input;
   }

   private int menu()
   {
      System.out.println("CD Application");
      System.out.println("--------------");
      System.out.println("1) List all CD's");
      System.out.println("2) Add new CD");
      System.out.println("3) Remove CD");
      System.out.println("4) Search CD by title");
      System.out.println("5) Quit");
      System.out.println();
      System.out.print("Select an item 1-5: ");
      int selection = in.nextInt();
      in.nextLine();
      return selection;
   }

   @Override
   public void start(Controller controller)
   {
      this.controller = controller;
      int menuSelection;
      do
      {
         menuSelection = menu();
         switch (menuSelection)
         {
            case 1:
               show("" + this.controller);
               break;
            case 2:
               show("Add method - not implemented");
               break;
            case 3:
               String input = get("Title");
               if (input.length() == 0)
                  return;
               String msg = "";
               Cd cd = cdList.removeFirstCdByTitle(input);
               if (cd != null)
               {
                  msg = "REMOVED: \n" + cd.toString();
               }
               else
               {
                  msg = "No CD with title: \"" + input + "\" found";
               }
               show(msg);
               break;
            case 4:
               input = get("Title");
               if (input == null)
                  return;
               msg = "";
               Controller list = cdList.getCdsByTitle(input);
               for (int i = 0; i < list.getNumberOfCds(); i++)
               {
                  msg += list.getCD(i) + "\n";
               }
               if (list.getNumberOfCds() == 0)
               {
                  msg = "No CD with title: \"" + input + "\" found";
               }
               show(msg);
               break;
            case 5:
               System.out.println("Quit");
               break;
            default:
               show("Wrong input");
               break;
         }
         System.out.println("\nPress ENTER to continue...");
         in.nextLine();
      }
      while (menuSelection != 5);

   }





}
