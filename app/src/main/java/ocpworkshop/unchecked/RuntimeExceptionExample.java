package ocpworkshop.unchecked;

public class RuntimeExceptionExample {
//    ArithmeticException
    void generateArithmeticException() {
        int fail = 10/0;
    }

//    ArrayIndexOutOfBoundsException
    void generateArrayIndexOutOfBoundsException() {
        int[] myList = new int[3];
        myList[3] = 3;
    }

//    ClassCastException

//    NullPointerException

//    IllegalArgumentException

//    NumberFormatException
}
