import java.util.*;
public class Lab13_ParikhUdit
{
	public static void main (String [] args)
	{
		Scanner console = new Scanner(System.in); //Sets up user input system
		Random randomGen = new Random(); //Sets up the random variable input so that the card values can be made out.

		int cardValueUser = 0;
		int cardValueDeal = 0;
		int run = 1;
		int card;
		int betMoney = 0;
		int betPara;
		while (run == 1)
		{
			System.out.println("Welcome to Black Jack! Get as close as you can to 21!");
			System.out.println("How much would you like to bet? Type a whole dollar amount");
			betMoney = console.nextInt();
			System.out.println("You have bet $" + betMoney + "! Good luck with your game!");
			int cardValueUserOne = randomGen.nextInt(10) + 2;
			int cardValueUserTwo = randomGen.nextInt(10) + 2;


			
			cardValueDeal = randomGen.nextInt(10) + 2;
			cardValueDeal += randomGen.nextInt(10) + 2;
			cardValueUser = cardValueUserOne + cardValueUserTwo;
			System.out.println("Your first card is " + cardValueUserOne);
			System.out.println("Your second card is " + cardValueUserTwo);
			

			System.out.println("You got two cards. The sum of the two are " + cardValueUser);
			System.out.println("You can either hit (take another card) or stay. Press 1 to hit or 2 to stay");
			int userInput = 0;

			//Start DEALER PART
			do
			{
				if (cardValueDeal <= 14)
				{
					card = randomGen.nextInt(10) + 2;
					cardValueDeal += card;
					if (cardValueDeal > 14)
					{
						break;
					}
				}
				else if (cardValueDeal > 14)
				{
					break;
				} 
			} while (cardValueDeal > 14);


			//END DEALER. START USER

			userInput = console.nextInt();
			do
			{
				if(userInput == 1)
				{
					card = randomGen.nextInt(10) + 2;
					cardValueUser += card;
					System.out.println("Your new card value is " + cardValueUser);
					if (cardValueUser > 21)
					{
						break;
					}
					System.out.println("You can either hit (take another card) or stay. Press 1 to hit or 2 to stay");
					userInput = console.nextInt();
				}
				else if (userInput == 2)
				{
					System.out.println("You chose to stay!");
					break;
				}
			} while (cardValueUser <= 21);

			if (cardValueUser > 21)
			{
				System.out.println("You busted!");
			}

			System.out.println("The dealer ended with a total value of " + cardValueDeal);
			if (cardValueUser > 21)
			{
				System.out.println("You have lost. Try again!");
				System.out.println("You just lost $" + betMoney + "!!");	
			}
			else if (cardValueDeal > 21)
			{
				System.out.println("You Won!! Congratulations!");

				System.out.println("You have won your " + betMoney + " dollars back!");
			}
			else if (cardValueUser > cardValueDeal)
			{
				System.out.println("You Won!! Congratulations!");
				System.out.println("You have won your " + betMoney + " dollars back!");
			}
			else if (cardValueDeal > cardValueUser)
			{
				System.out.println("You have lost. Try again!");
				System.out.println("You just lost $" + betMoney + "!!");
			}
			System.out.println("Would you like to play Black Jack Again? Press 1 for yes or 0 for no!");
			run = console.nextInt();
			if (run == 0)
			{
				System.out.println("Thanks for playing! I will see you later!");
			}

			//END USER PART


		}





		 
	}
}