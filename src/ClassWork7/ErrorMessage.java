package ClassWork7;

public class ErrorMessage {
    String messages[] = {
            "Output Error",
            "Input Error",
            "No available space on the disk",
            "Array index is out of range",
    };

    public String getMessages(int i) {
        if (i >= 0 & i < messages.length)
            return messages[i];
        else return "Error code doesn't exists";
    }
}
