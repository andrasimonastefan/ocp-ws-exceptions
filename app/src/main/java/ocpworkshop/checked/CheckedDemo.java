package ocpworkshop.checked;

public class CheckedDemo {
    public static void main(String[] args) throws Exception {
        CheckedExceptionsExample checkedExceptionsExample = new CheckedExceptionsExample();
//        checkedExceptionsExample.successMethod();
//        checkedExceptionsExample.failMethod();

        HandleExceptionExample handleExceptionExample = new HandleExceptionExample();
//        handleExceptionExample.readFromFile();
//        handleExceptionExample.readWithMultipleExceptions();
//        handleExceptionExample.alwaysDisplay();
//        handleExceptionExample.skipCatch();

        TryWithResourcesExample tryWithResourcesExample = new TryWithResourcesExample();
//        tryWithResourcesExample.readFromFile();
//        tryWithResourcesExample.cleanerReadFromFile();
//        tryWithResourcesExample.checkResourceOrder();
//        tryWithResourcesExample.tryEffectivelyFinal();
//        tryWithResourcesExample.guaranteeClosing();
//        tryWithResourcesExample.oneResourceAtATime();
//        tryWithResourcesExample.suppress();
        tryWithResourcesExample.cannotSuppress();
    }

}
