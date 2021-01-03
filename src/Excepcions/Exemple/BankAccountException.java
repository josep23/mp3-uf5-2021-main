package Excepcions.Exemple;

public class BankAccountException extends Exception {

    public BankAccountException(String msg) {
        super(msg);
    }

    public BankAccountException(String message, Throwable cause) {

        super(message, cause);
    }

    public BankAccountException(Throwable cause) {
        super(cause);
    }


}

