import java.util.Scanner;
public class Player
		
{
		static int money = 50000;
		static Scanner userInput = new Scanner(System.in);
			{
				AskRacerName();
			}
		public static void AskRacerName()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("What is your name, racer?");
				String name = userInput.nextLine();
				System.out.println("Hello, " + name + "!");
				System.out.println("Welcome beginner.");
				System.out.println("You have been given a 1998 Subaru Impreza");
				System.out.println("You have $9,000 to start out with.");
				
			}
	
	}
