package ocpworkshop.checked.screens;

public class DumbScreen implements AutoCloseable {
    public int id;

    public DumbScreen(int id) throws Exception {
        System.out.println("Opening dumb " + id);
        this.id = id;
        throw new Exception("Oups");
    }

    @Override
    public void close() {
        System.out.println("Closing dumb" + id);
    }
}
