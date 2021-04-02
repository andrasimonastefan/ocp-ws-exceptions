package ocpworkshop.unchecked;

public class ErrorExamples {
//    ExceptionInInitializerError
//    static {
//        int trouble = 10/0;
//    }

    //StackOverflow
    void generateErrorMethod() {
        while(true) {
            generateErrorMethod();
        }
    }
}
