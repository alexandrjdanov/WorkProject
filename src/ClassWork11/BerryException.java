package ClassWork11;

public class BerryException extends Exception{
    String cause;

    BerryException(String cause) {
        this.cause = cause;
    }

    @Override
    public String toString() {
        return "ATTENTION! You got BerryException because" + cause;
    }
}
