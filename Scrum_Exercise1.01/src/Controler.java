import java.util.Scanner;
public class Controler
{
	
	private Movement move;
	private Scanner in;
	
	public void run(String flick)
	{
		int count = 0;
		while (count < 5)
		{
			if (count == 4)
			{
				count = 0;
			}
			if(flick.equals("on") && count == 0)
			{
				move.forwardWithLights(1);
				System.out.println("forward" + count);
			}
			if(flick.equals("on") && count == 2)
			{
				move.forwardWithLights(1);
				System.out.println("backward" + count);
			}
			if(flick.equals("off") && (count == 0 || count == 2))
			{
				move.backwardWithLights(2);
				move.forwardWithLights(2);
				count ++;
				System.out.println("stoped moving" + count);
			}
			if(flick.equals("on") && (count == 1 || count == 3))
			{
				move.LightOn();
				System.out.println("lights on" + count);
				
			}
			if(flick.equals("off") && (count == 1 || count == 3))
			{
				move.LightOff();
				count ++;
				System.out.println("lights off" + count);
			}
		}
	}
	
	public int menu()
	{
		
		System.out.println("welcome to my car");
		System.out.println("controls nr 1 for on:");
		System.out.println("controls nr 2 for off");
		System.out.println("please input nr");
		
	      int selection = in.nextInt();
	     
	      return selection;
	}
	
	public void start()
	{
		
		int input;
		do
		{
			input = menu();
		
		switch (input)
		   {
		   	case 1:
		   		run("on");
		   		break;
		   	case 2:
		   		run("off");
		   		break;
		   }
	 	System.out.println("\nPress ENTER to continue...");
	   	in.nextLine();
	   }
	   	while (input != 3);
			 
	}
}
