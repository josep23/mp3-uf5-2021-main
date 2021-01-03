package Excepcions.Exemple;

public class ClientAccountException extends Exception {

    public ClientAccountException(String msg) {
        super(msg);
    }

    public ClientAccountException(String message, Throwable cause) {
        super(message, cause);
    }

    public ClientAccountException(Throwable cause) {
        super(cause);
    }


}

