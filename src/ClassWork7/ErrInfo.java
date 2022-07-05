package ClassWork7;

import ClassWork9.Level;

public class ErrInfo {
    String msg[] = {
            "Output Error",
            "Input Error",
            "No available space on the disk",
            "Array index is out of range",
    };

    Level severity;
    String howBad[] = {String.valueOf(Level.HIGH), String.valueOf(Level.MEDIUM), String.valueOf(Level.LOW), String.valueOf(Level.MEDIUM)};

    Err getErrorInfo (int i) {
        if (i >= 0 & i < msg.length)
            return new Err(msg[i], howBad[i]);
        else
            return new Err("Nonexistent error type", String.valueOf(severity.UNDEFINED));
    }
    }

