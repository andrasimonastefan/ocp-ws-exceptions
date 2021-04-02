package ocpworkshop.checked;

public class CheckedExceptionsExample {

    void successMethod() throws Exception {
        System.out.println("It works");
    }

    void failMethod() throws Exception {
        System.out.println("Won't work");
        throw new Exception();
    }

}
