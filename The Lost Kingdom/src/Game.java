import java.util.Scanner;

public class Game {
    private Player player;
    private Scanner scanner;

    public Game() {
        player = new Player("Elara", 100);
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to The Lost Kingdom, " + player.getName() + "!");
        System.out.println("An ancient evil has awakened, threatening to plunge the land into darkness.");
        System.out.println("You must embark on a quest to vanquish this menace and restore peace to the kingdom.");
        System.out.println("Your journey begins now...");
        startAdventure();
    }

    private void startAdventure() {
        // Chapter 1: Meeting Kiran
        System.out.println("\nChapter 1: Meeting Kiran");
        System.out.println("You travel through a dense forest and come across Kiran, a wise and enigmatic wizard.");
        System.out.println("Kiran: 'Greetings, " + player.getName() + "! I have been expecting you.'");
        System.out.println("Kiran offers to guide you on your quest.");

        System.out.println("Do you accept Kiran's offer? (yes/no)");
        String decision = scanner.nextLine().trim().toLowerCase();

        if (decision.equals("yes")) {
            System.out.println("You accept Kiran's offer and begin your journey together.");
            // Continue the adventure...
        } else {
            System.out.println("Kiran wishes you luck and parts ways with you.");
            // Continue the adventure without Kiran...
        }

        // Add more chapters and decision points here...
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
