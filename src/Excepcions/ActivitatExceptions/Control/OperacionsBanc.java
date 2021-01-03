package Excepcions.ActivitatExceptions.Control;

import Excepcions.ActivitatExceptions.Exceptions.ExceptionMessage;
import Excepcions.ActivitatExceptions.Model.CompteEstalvi;
import Excepcions.Exemple.BankAccountException;

public class OperacionsBanc {

    public OperacionsBanc(String dni) {
    }

    public static boolean verifyDNI(String dni) {
        if (dni.length() !=9 ){
            System.err.println(ExceptionMessage.WRONG_DNI);
        }
        else if (dni.length() == 9){
            System.out.println("correcto");

        }
        return false;
    }

}