public abstract class Player {
    private String name;

    public String getName() {
        return name;
    }

    public abstract void displayDetail();

    public Player(String name) {
        this.name = name;
    }
}
