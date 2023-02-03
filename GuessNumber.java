//Number guessing Game
import java.util.Scanner;
import java.util.Random;

public class GuessNumber{
    public static void main(String ar[])
    {
        generateRandom();
    }//end of main

    public static void generateRandom()
    {
        //createing object of Random class
        Random rand = new Random();

        //generating a random number between 1- 10

        int randomNum = rand.nextInt(11);

        //calling guess method 
        guess(randomNum);
    }//end generateRando method

    public static void guess(int randomNum)
    {
        //creating the object og saccnar class
        Scanner in = new Scanner(System.in);

        //welcomre messeage
        System.out.println(" ");

        System.out.println("Number guessing game");

        System.out.println("Guess a number between 0-10 :");

        int guess = in.nextInt();

        System.out.println(" ");

        //input validation
        while(guess<0 || guess > 10)
        {
            System.out.println("Guess a number between 0-10 :");

            guess = in.nextInt();

           System.out.println(" ");

        }
        //try again util you gess coreect number
        int tries = 0;

        while(guess != randomNum)
        {
            tries++;

           System.out.println("Worong Guess!");

           System.out.println("Guess again :");

           guess = in.nextInt();
 
          System.out.println(" ");
         
          //input validation
        while(guess<0 || guess > 10)
        {
            System.out.println("Guess a number between 0-10 :");

            guess = in.nextInt();

           System.out.println(" ");

        }
       // Game Won

        System.out.println("Corecct Ans. YOU WON!");

        System.out.println("Wrong Tries :"+tries);

        System.out.println(" ");

        //Play again or exit?

        System.out.println("Press 1 to Play again");

        System.out.println("Press 0 to exit.");

        int choice = in.nextInt();

        if(choice == 1)
        {
            generateRandom();
        }
        else
        {
            return;
        }

        }////end of guess method

    }//end of class


}///////////