import java.util.Scanner;
import java.io.File;
public class U_ParikhUdit
{
    public static void main (String [] args)
    throws Exception
    {
    
        Scanner console = new Scanner(new File("U1.txt"));
        int height = console.nextInt();
        int count2 = height;
        height = 2 * height - 1;
        int count = height;
        while (height > 0) {
            int height2 = (count - height) / 2; 
            for (int i = 0; i < height2; i ++)
            {
                System.out.print(" ");
            }
            for (int i = 1; i <= height; i ++)
            {
                System.out.print("*");
            }
            System.out.println();
            height -= 2;
    }
    
    for (int i = 1; i < count2 - 1; i ++)
    {
        int o = (count / 2) - (count % 2);
        for (int f = 0; f< o; f ++)
        {
            System.out.print(" ");
        }
        System.out.print("*");
        for (int g = 0; g < 2 * i - 1; g ++)
        {
            System.out.print(" ");
        }
        //System.out.println("*");
        System.out.println("*");
        count -= 2;
    }
    
    for (int i = 0; i < (2 * count2 - 1); i ++)
    {
        System.out.print("*");
    }
    System.out.println();
    int sum = (count2 * count2) + ((count2) * (count2 -1) / 2) + (2 * count + 1);
    
    System.out.println(sum);
} 
}
