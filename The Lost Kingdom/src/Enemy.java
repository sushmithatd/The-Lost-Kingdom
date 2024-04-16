public class Enemy extends Character {
    public Enemy(String name, int health) {
        super(name, health);
    }

    @Override
    public void interact(Player player) {
        System.out.println("You encounter a fearsome enemy: " + getName());
        System.out.println("Prepare for battle!");

        // Simple combat logic
        while (player.getHealth() > 0 && getHealth() > 0) {
            System.out.println("You attack the enemy!");
            setHealth(getHealth() - 20);
            System.out.println("Enemy health: " + getHealth());

            if (getHealth() <= 0) {
                System.out.println("You defeated the enemy!");
                return;
            }

            System.out.println("The enemy attacks you!");
            player.setHealth(player.getHealth() - 15);
            System.out.println("Your health: " + player.getHealth());

            if (player.getHealth() <= 0) {
                System.out.println("You have been defeated...");
                System.out.println("Game Over.");
                System.exit(0);
            }
        }
    }
}
