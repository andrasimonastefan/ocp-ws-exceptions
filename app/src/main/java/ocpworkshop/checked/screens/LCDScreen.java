package ocpworkshop.checked.screens;

import java.io.FileNotFoundException;
import java.io.IOException;

public class LCDScreen extends Screen {

    String displayOnScreen() {
         return "High quality text displayed";

//         throw new FileNotFoundException();
//         throw new IllegalStateException();
//         throw new Exception();

//        BufferedReader br = new BufferedReader(new FileReader("showOnScreen.txt"));
//        StringBuilder sb = new StringBuilder();
//        String firstLine = br.readLine();
//
//        sb.append("High quality");
//        sb.append(firstLine);
//        return sb;
    }
}
