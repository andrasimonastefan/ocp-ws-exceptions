package ocpworkshop.checked;

import ocpworkshop.checked.screens.DumbScreen;
import ocpworkshop.checked.screens.NonClosingScreen;
import ocpworkshop.checked.screens.Screen;
import ocpworkshop.checked.screens.SmartScreen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {

    void readFromFile() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("./app/src/main/resources/readThis.txt"));
            System.out.println(br.readLine());
        }
        catch (IOException e) {
            System.out.println("exception");
        } finally {
            try {
                br.close();
            } catch (IOException e2) {
                System.out.println("another one");
            }
        }
    }

    void cleanerReadFromFile() {
        try(FileReader fr = new FileReader("./app/src/main/resources/readThis.txt");
                BufferedReader br = new BufferedReader(fr);) {
            System.out.println(br.readLine());
        }
        catch (IOException e) {
//            br.close();
            System.out.println("exception");
        }
    }

//    void tryWithWrongResource() {
//        try(Screen s = new Screen()) {
//
//        }
//    }

    void checkResourceOrder() {
        try(SmartScreen s1 = new SmartScreen(1);
            SmartScreen s2 = new SmartScreen(2)) {
            System.out.println("Opened some smart screens");
        }
    }

    void tryEffectivelyFinal() {
        SmartScreen s1 = new SmartScreen(1);
        final SmartScreen s2 = new SmartScreen(2);

        try(s1; s2) {
            System.out.println("Opened some smart screens");
        }
    }

    void guaranteeClosing() {
        try(SmartScreen s1 = new SmartScreen(1);
            NonClosingScreen s2 = new NonClosingScreen(2);) {
            System.out.println("Opened some screens");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void oneResourceAtATime() throws Exception {
        SmartScreen s1 = new SmartScreen(1);
        DumbScreen s2 = new DumbScreen(2);
        try(s1; s2) {
            System.out.println("Opened some screens");
        }
    }

    void suppress() {
        try(NonClosingScreen s1 = new NonClosingScreen(1)) {
            System.out.println("Screen running");
            throw new Exception("Dangerous exception that will suppress the closing one");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            for (Throwable t : e.getSuppressed())
                System.out.println("Suppressed: " + t.getMessage());
        }
    }

    void cannotSuppress() {
        try(NonClosingScreen s1 = new NonClosingScreen(1)) {
            System.out.println("Screen running");
            throw new Exception("Dangerous exception that will suppress the closing one");
        } finally {
            System.out.println("No other exceptions");
            throw new RuntimeException();
        }
    }

}
