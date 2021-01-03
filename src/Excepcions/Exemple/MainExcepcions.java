package Excepcions.Exemple;

import Excepcions.ActivitatExceptions.Control.OperacionsBanc;
import Excepcions.ActivitatExceptions.Exceptions.ExceptionMessage;
import Excepcions.ActivitatExceptions.Model.Client;
import Excepcions.ActivitatExceptions.Model.CompteEstalvi;
import com.sun.jmx.remote.internal.ClientNotifForwarder;

import javax.crypto.spec.PSource;
import java.time.LocalDate;

public class MainExcepcions {

    public static void main(String[] args) throws BankAccountException {



        try {
            addFamily();
            System.out.println("codi després de l'error");
        } catch (PersonNotBornException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
        System.out.println("codi després del try-catch");

        System.out.println("︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵");
        System.out.println("|                                                                                                                                                 |");
        System.out.println("︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶");
        System.out.println("Amb la informació dels missatges d'exepció que hi ha a `ExceptionMessage.java`, crea dos tipus d'excepcions,\n" +
                "una relacionada amb el compte anomenada `BankAccountException.java`, i una altra relacionada amb els clients que es digui ClientAccountException.java.");
        try {
            addClient();
            System.out.println("Añadiendo cliente");
        } catch(ClientAccountException c) {
            c.printStackTrace();
            throw new RuntimeException(c.getMessage());
        }
        System.out.println("Cliente comprobado");

        try {
            addCuenta();
            System.out.println("Añadiendo cuenta");
        } catch(BankAccountException b) {
            b.printStackTrace();
            if (CompteEstalvi.getNumCompte().isEmpty()) {
                System.err.println(ExceptionMessage.ACCOUNT_NOT_FOUND);
            } else if(CompteEstalvi.getSaldo()<0){
                System.err.println(ExceptionMessage.ACCOUNT_OVERDRAFT);
            } else if(CompteEstalvi.getLlista_usuaris().contains(CompteEstalvi.getNumCompte())){
                System.err.println(ExceptionMessage.ACCOUNT_ZERO_USER);
            }
            System.out.println("Cliente comprobado");

            throw new RuntimeException(b.getMessage());
        }
        System.out.println("Cuenta comprobada");
        System.out.println("︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵");
        System.out.println("|                                                                                                                                                 |");
        System.out.println("︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶");
        System.out.println("Implementa el codi de verifyDNI de la classe OperacionsBanc.java");
        System.out.println(OperacionsBanc.verifyDNI("12312312L"));
        System.out.println("︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵︵");
        System.out.println("|                                                                                                                                                 |");
        System.out.println("︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶");
        System.out.println("Implenta un mètode per fer transferències d'un compte a un altre i usa algun tipus de missatge d'excepció allà on creguis adient.");
        CompteEstalvi ct1 = new CompteEstalvi("1234123213");
        CompteEstalvi ct2 = new CompteEstalvi("1234123214");
        ct1.ingressar(999);
        CompteEstalvi.mandarDinero(ct1,ct2, 1000.00);

    }
    public static void addDni() throws ClientAccountException {
        OperacionsBanc DNI = new OperacionsBanc("12312312L");
    }

    public static void addCuenta() throws BankAccountException {
         CompteEstalvi cuenta = new CompteEstalvi ("123123123");
    }

    public static void addClient() throws ClientAccountException {
        Client cliente = new Client("nombre", "apellido", "12345678L");
    }


    public static void addPerson() throws PersonNotBornException {
        Person p = new Person("Pep", Person.Genere.HOME, LocalDate.of(2020, 10, 10));
    }

    public static void addFamily() throws PersonNotBornException {
        addPerson();
    }





}
