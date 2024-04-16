public class Aya extends Character {
    public Aya() {
        super("Aya", 100);
    }

    @Override
    public void interact(Player player) {
        System.out.println("Aya: Hello, " + player.getName() + "! I can help you unlock paths and find secrets.");
        // Offer lockpicking assistance
    }
}