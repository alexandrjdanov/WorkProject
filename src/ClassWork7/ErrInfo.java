package ClassWork7;

public class ErrInfo {
    String msg[] = {
            "Output Error",
            "Input Error",
            "No available space on the disk",
            "Array index is out of range",
    };
    int howBad[] = {3, 3, 2, 4};

    Err getErrorInfo (int i) {
        if (i >= 0 & i < msg.length)
            return new Err(msg[i], howBad[i]);
        else
            return new Err("Nonexistent error type", 0);
    }
    }

