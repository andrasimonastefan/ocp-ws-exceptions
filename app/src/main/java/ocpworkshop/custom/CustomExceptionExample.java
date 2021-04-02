package ocpworkshop.custom;

public class CustomExceptionExample {
    void justWannaFail() throws ForbiddenCommercial {
        throw new ForbiddenCommercial();
    }

    void justSilentFail() {
        throw new CorruptedData();
    }

    void justWannaFailAgain() throws MissingCommercial {
        throw new MissingCommercial("PEPSI_NOT_FOUND", "Couldn't find Pepsi commercial.");
    }
}

class ForbiddenCommercial extends Exception {}
class CorruptedData extends RuntimeException{}
class CorruptedCommercialData extends CorruptedData {}

class MissingCommercial extends Exception {
    public MissingCommercial(String errorCode, String message) {
        super(message + " " + errorCode);
    }
}