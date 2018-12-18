//Udit Parikh
//Period 4B
import java.util.*;

public class Lab14_ParikhUdit
{
	public static void main (String[] args)
	{
		Scanner console = new Scanner(System.in);

		int num = 1;

		//1
		for (int i = 1; i < 10; i++)
		{
			System.out.print(num);
			num++;
		}

		System.out.println(" ");

		//2
		num = 1;
		for (int j = 1; j < 10; j++)
		{
			System.out.print(num + " ");
			num++;
		}

		System.out.println(" ");

		//3
		num = 0;
		for (int k = 1; k <= 10; k++)
		{
			num += 2;
			System.out.print(num + " ");
		}

		System.out.println(" ");

		//4
		num = 20;
		for (int l = 0; l <= 5; l++)
		{
			System.out.print(num + " ");
			num ++;
		}

		System.out.println(" ");

		//5
		num = 0;
		for (int m = 0; m < 8; m++)
		{
			num += 10;
			System.out.print(num + " ");
		}

		System.out.println(" ");

		//6
		//Riddle

		//7
		num = 0;
		for (int n = 0; n <= 10; n++)
		{
			System.out.print(num + " ");
			num --;
		}

		System.out.println(" ");

		//8
		System.out.println("Pick an integer");
		num = console.nextInt();
		for (int t = 0; t < num; t++)
		{
			System.out.print("* ");
		}

		System.out.println(" ");

		//9
		num = 1;
		for (int u = 0; u < 10; u++)
		{
			System.out.print((num)*(num) + " ");
			num++;
		}

		System.out.println(" ");

		//10
		num = 1;
		for (int q = 0; q < 9; q++)
		{
			if (num % 3 == 0)
			{
				System.out.print("? ");
			}

			else
			{
				System.out.print(num + " ");
			}
			num++;
		}

		System.out.println(" ");

		//11
		System.out.println("Enter an integer to see its factorial");
		int n = console.nextInt();
		int factorial = n;
		for (int y = 0; y <= n; y++)
		{
			factorial *= (n-1);
			n--;
		}
		System.out.println(factorial);
		//Prime Checker
		int run = 1;
		System.out.println("Enter a number to check if it is prime or not");
		while (run == 1)
		{
			num = console.nextInt();
	        boolean prime = false;
	        for (int i = 2; i <= num / 2; ++i)
	        {
	            if(num % i == 0)
	            {
	                prime = true;
	                break;
	            }
	        }
	        if (num == 1)
	        {
	        	System.out.println("1 is not a prime number.");
	        }
	        else if (!prime)
	            System.out.println(num + " is a prime number.");
	        else
	            System.out.println(num + " is not a prime number.");

			System.out.println("Do you want to enter another number? Press 1 for yes or 0 for no.");
			run = console.nextInt();
		}
	}
}