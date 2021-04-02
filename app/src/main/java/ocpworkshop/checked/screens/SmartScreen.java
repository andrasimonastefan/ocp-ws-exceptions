package ocpworkshop.checked.screens;

public class SmartScreen implements AutoCloseable {
    public int id;

    public SmartScreen(int id) {
        System.out.println("Opening smart " + id);
        this.id = id;
    }

    @Override
    public void close() {
        System.out.println("Closing smart " + id);
    }
}
