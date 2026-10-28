import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secret = (int) (Math.random() * 100) + 1;
        int guess = 0;
        int count = 0;

        // Your code goes here //

        while( guess != secret ) {
            System.out.print("Guess a Number from 1 to 100: ");
            guess = input.nextInt();

            count++;

            if (guess > secret ) {
                System.out.print("--------------------------- < ");
                System.out.println("Too high");
            } else if ( guess < secret ) {
                System.out.print("--------------------------- > ");
                System.out.println("Too low");
            } else {
                System.out.print("--------------------------- = ");
                System.out.println("You got it!");
                System.out.println("You got it in " + count + " guesses.");
                System.out.print("--------------------------- ? ");
                System.out.println("Play Again?");
            }
        }



    }
}