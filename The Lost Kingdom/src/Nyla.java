public class Nyla extends Character {
    public Nyla() {
        super("Nyla", 100);
    }

    @Override
    public void interact(Player player) {
        System.out.println("Nyla: Welcome, " + player.getName() + "! I have ancient knowledge to share.");
        // Share ancient secrets or magic
    }
}
