package ClassWork7;

import ClassWork9.Level;

public class ErrorMessageDemo {
    public static void main(String[] args) {
        ErrorMessage en = new ErrorMessage();

        Level myVariable = Level.HIGH;
        System.out.println(myVariable);

        System.out.println(en.getMessages(ErrorMessage.DISKERR));
        System.out.println(en.getMessages(10));

        System.out.println("Advanced");
        ErrInfo err = new ErrInfo();
        Err e;

        e = err.getErrorInfo(2);
        System.out.println(e.msg + " level: " + e.severity);
    }
}
