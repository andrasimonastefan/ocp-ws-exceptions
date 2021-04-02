package ocpworkshop.checked.screens;

public class NonClosingScreen implements AutoCloseable {
    public int id;

    public NonClosingScreen(int id) {
        System.out.println("Opening nonClosing " + id);
        this.id = id;
    }

    @Override
    public void close() throws Exception {
        throw new Exception("Will not close " + id);
    }
}
