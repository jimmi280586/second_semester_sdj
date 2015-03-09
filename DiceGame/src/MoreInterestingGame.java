import java.util.Random;
import java.util.Scanner;


public class MoreInterestingGame
{
	private int NUMBER_OF_SIDES;
	private int dice1;
	private int dice2;
	private int p1;
	private int p2;
	private int turn;
	private Random rand;

	private String player1;
	private String player2;
	
	public MoreInterestingGame()
	{
		this.NUMBER_OF_SIDES = 24;
		this.p1 = 0;
		this.p2 = 0;
		this.turn = 1;
		this.rand = new Random();		
	}
	
	public void interesting(int goaul1, String player1, String player2)
	   {  
			int goaul = goaul1 * 10;
			this.player1 = player1;
			this.player2 = player2;
			boolean b = true;
			
	      Scanner kb = new Scanner(System.in);
	      System.out.println("Game continues with sides of dice = 24 and goaul = " + goaul);
	      
	      while(b == true)
	      {
	         System.out.println("Turn " + this.turn);
	         
	         
	         if(p1==goaul)
	         {
	            System.out.println("Player I has won!");
	            break;
	         }
	         if(p1<goaul)
	         {
	            dice1 = rand.nextInt(NUMBER_OF_SIDES-1 + 1) + 1;
	            dice2 = rand.nextInt(NUMBER_OF_SIDES-1 + 1) + 1;
	            p1 = p1+roll(dice1, dice2);
	            System.out.println("Player I has rolled: " + dice1 + " " + dice2);
	            System.out.println("Player I: " + p1);
	         }
	                  
	         if(p2==goaul)
	         {
	            System.out.println("Player II has won!");
	            break;
	         }
	         if(p2<goaul)
	         {
	            dice1 = rand.nextInt(NUMBER_OF_SIDES-1 + 1) + 1;
	            dice2 = rand.nextInt(NUMBER_OF_SIDES-1 + 1) + 1;
	            p2 = p2 + roll(dice1, dice2);
	            System.out.println("Player II has rolled: " + dice1 + " " + dice2);
	            System.out.println("Player II: " + p2);
	         }
	         if(p1>goaul && p2>goaul)
	         {
	            System.out.println("Draw");
	            System.out.println("Do you want to continue the game type yes or no");
	            String next = kb.nextLine();
	            if(next.equalsIgnoreCase("yes"))
	            {
	            	interesting(goaul, player1, player2);
	            }
	            
	            	System.out.println("Game Over thanks for playing");
	            	break;
	            
	            
	         }
	         turn++;
	      }
	      
	   }
	   private static int roll(int d1, int d2)
	   {
	      return d1+d2;
	   }
}
