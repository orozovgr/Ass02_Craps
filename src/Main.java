import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
     int die1;
     int die2;
     int sum;
     int point;
     Random random = new Random();

        Scanner in = new Scanner(System.in);
        String continueYN = "";
        Boolean done = false;


        do
        {
            die1 = random.nextInt(6)+1;
            die2 = random.nextInt(6)+1;
            sum = die1 + die2;
            System.out.printf("You rolled %d + %d = %d %n", die1, die2, sum);

            if (sum == 2 || sum == 3 || sum == 12)
            {
                System.out.println("craps or crapping out, the game is over with a loss.");
            } else if (sum == 7 || sum == 11 )
            {
                System.out.println("natural and the game is over with a win.");
            }else
            {
             point = sum;
                System.out.println("You made points " + point );
             do
             {
                 System.out.println("Rolling for points...");
                 die1 = random.nextInt(6)+1;
                 die2 = random.nextInt(6)+1;
                 sum = die1 + die2;
                 System.out.printf("You rolled %d + %d = %d%n", die1, die2, sum);
                 if (sum == point)
                 {
                     System.out.println("You make the points, you win");
                     break;
                 } else if (sum == 7)
                 {
                     System.out.println("You loose");
                     break;
                 }


             }while(true);
            }



            System.out.print("Do you play again?[YN]: ");
        continueYN = in.nextLine();
        if(continueYN.equalsIgnoreCase("N"))
        {
            done = true;
        }


    } while(!done);

    }
}