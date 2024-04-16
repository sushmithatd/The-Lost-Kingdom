public class Damien extends Character {
    public Damien() {
        super("Damien", 100);
    }

    @Override
    public void interact(Player player) {
        System.out.println("Damien: " + player.getName() + ", it's good to see you again! I'll be by your side in battle.");
        // Join the player in battle, or offer advice
    }
}