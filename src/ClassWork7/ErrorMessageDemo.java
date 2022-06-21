package ClassWork7;

public class ErrorMessageDemo {
    public static void main(String[] args) {
        ErrorMessage en = new ErrorMessage();

        System.out.println(en.getMessages(3));
        System.out.println(en.getMessages(10));

        System.out.println("Advanced");
        ErrInfo err = new ErrInfo();
        Err e;

        e = err.getErrorInfo(2);
        System.out.println(e.msg + " level: " + e.severity);
    }
}
