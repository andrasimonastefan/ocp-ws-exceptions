package ocpworkshop.checked.screens;

import java.io.*;

public class Screen {

    String displayOnScreen() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("showOnScreen.txt"));
        String firstLine = br.readLine();
        return firstLine;
    }
}
