//Udit
//Period 4B
import java.util.*;

public class Lab15_ParikhUdit
{
	public static void main (String [] args)
	{
		Scanner console = new Scanner(System.in);

		//1
		System.out.println("Enter an integer to see the factorization of it");
		int num = console.nextInt();
		for (int i = 1; i <= num; i++)
		{
			if (num % i == 0)
			{
				System.out.print(i + " ");
			}		
		}

		System.out.println(" ");

		//2
		System.out.println("Enter an integer to see how many cool numbers are between 1 and your number (using a for loop");
		num = console.nextInt();
		int coolNumber = 0;
		for (int j = 1; j <= num; j++)
		{
			if (j % 3 == 1)
			{
				if (j % 4 == 1)
				{
					if (j % 5 == 1)
					{
						if (j % 6 == 1)
						{
							coolNumber++;
						}
					}
				}
			}
		}

		System.out.println("There are " + coolNumber + " cool numbers up to " + num);

		//3
		System.out.println("Enter an integer to see how many cool numbers are between 1 and your number (using while loop)");
		num = console.nextInt();
		coolNumber = 0;
		while (j <= num)
		{
			j = 1;
			if (j % 3 == 1)
			{
				if (j % 4 == 1)
				{
					if (j % 5 == 1)
					{
						if (j % 6 == 1)
						{
							coolNumber++;
						}
					}
				}
			}
			j++;
		}

		System.out.println("There are " + coolNumber + " cool numbers up to " + num);


	}
}
