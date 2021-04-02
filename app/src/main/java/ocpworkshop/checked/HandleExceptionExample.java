package ocpworkshop.checked;

import java.io.*;

public class HandleExceptionExample {

    void readFromFile() {
        BufferedReader br = null;
//        String firstLine = null;
        try {
//            br = new BufferedReader(new FileReader("readThis.txt"));
            br = new BufferedReader(new FileReader("./app/src/main/resources/readThis.txt"));
            String firstLine = br.readLine();
//            System.out.println(firstLine);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e2) {
//            System.out.println(firstLine);
            e2.printStackTrace();
//            e1.printStackTrace();
        }
//        System.out.println(firstLine);
    }

    void readWithMultipleExceptions() {
        System.out.println("Throw multiple exceptions");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("./app/src/main/resources/readThis.txt"));
            throw new NoSuchFieldException();
        } catch (FileNotFoundException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    void alwaysDisplay() {
        try {
            System.out.println("Start running");
            throw new IOException();
        } catch (IOException e) {
            System.out.println("Encounter error");
//            System.exit(1);
//            throw new Error();
        } finally {
            System.out.println("Always display this");
        }
    }

    void skipCatch() {
        try {
            String printMe = null;
            System.out.println(printMe.indexOf('a'));
        } finally {
            System.out.println("You didn't catch it");
        }
    }
}
