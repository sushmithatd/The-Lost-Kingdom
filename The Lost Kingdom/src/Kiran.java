public class Kiran extends Character {
    public Kiran() {
        super("Kiran", 100);
    }

    @Override
    public void interact(Player player) {
        System.out.println("Kiran: Welcome, " + player.getName() + "! I will guide you on your quest.");
        // Provide the player with a magical item or guidance
    }
}






