import java.util.*;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a lower bound: ");
        int lower = scanner.nextInt();
        System.out.print("Enter an upper bound: ");
        int upper = scanner.nextInt();

        int randomInt = generateInt(lower, upper);

        gameLoop(randomInt);

        scanner.close();
    }


    public static void gameLoop(int number) {


        int guesses = 0;

        while(true) {
            System.out.print("Enter a number: ");
            int userInput = scanner.nextInt();
            if (userInput == number) {
                System.out.println("You win!\nTotal guesses: " + guesses);
                break;
            } else if (userInput < number) {
                System.out.println("Higher!");
            } else if (userInput > number) {
                System.out.println("Lower!");
            }

            guesses += 1;
        }
    }

    public static int generateInt(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt(lowerBound, upperBound);
    }
}