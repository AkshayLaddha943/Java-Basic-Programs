import java.util.Scanner;
public class GuesstheNumber {
    public static void main(String[] args) {
        System.out.println("I have randomly chosen a number between [1, 100]");
        System.out.println("Try to guess it");
        System.out.println("You have 10 guess(es) left: ");
        int guess = 28;
        boolean hash = false;
        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i >= 0; i--) {
            int num = scanner.nextInt();
            if (num < guess) {
                System.out.println("The number is less then the guessed number");
            }
            if (num > guess) {
                System.out.println("The number is larger then the guessed number");
            }
            if (num == guess) {
                System.out.println("Voila! You are correct");
                hash = true;
                break;
            }
        }

        if (hash){
            System.out.println("You are a winner");
        }
        else {
            System.out.println("You are a loser");
        }


        }

}