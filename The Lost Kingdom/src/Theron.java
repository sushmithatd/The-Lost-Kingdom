public class Theron extends Character {
    public Theron() {
        super("Theron", 50); // Example health value
    }

    @Override
    public void interact(Player player) {
        System.out.println("You encounter an enemy: Theron");

        // Simple combat logic
        while (player.getHealth() > 0 && this.health > 0) {
            System.out.println(player.getName() + " attacks Theron!");
            player.attack(this);

            if (this.health <= 0) {
                System.out.println("You defeated Theron!");
                return;
            }

            // Enemy attacks the player
            System.out.println("Theron attacks you!");
            player.setHealth(player.getHealth() - 15);
            System.out.println(player.getName() + "'s health: " + player.getHealth());

            if (player.getHealth() <= 0) {
                System.out.println("You have been defeated...");
                System.out.println("Game Over.");
                System.exit(0);
            }
        }
    }
}
