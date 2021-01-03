package Excepcions.ActivitatExceptions.Model;

import Excepcions.ActivitatExceptions.Exceptions.ExceptionMessage;
import Excepcions.Exemple.BankAccountException;

import java.util.List;

public class CompteEstalvi {
    private static String numCompte;
    private static double saldo;
    private static List<Client> llista_usuaris;

    public CompteEstalvi(String numCompte) {
        this.numCompte = numCompte;
        saldo = 0;
    }

    /**
        Afegeix un usuari d'aquest compte
        @param client
        @return quantitat d'usuaris que té el compte

     **/
    public int addUser(Client client) {
        llista_usuaris.add(client);
        return llista_usuaris.size();
    }

    /**
     Elimina un usuari d'aquest compte,
     Com que no pot quedar un compte sense usuari, si és l'ùltim és llança una excepció
     @param dni
     @return quantitat d'usuaris que té el compte
     @throws BankAccountException
     **/
    public int removeUser(String dni) {
        llista_usuaris.removeIf(u -> dni.equals(u.getDNI()));
        return llista_usuaris.size();
    }

    /**
     * Afegeix m diners al saldo
     * @param m
     */
    public void ingressar(double m) {
        saldo += m;
    }

    public void treure(double m) {
        saldo -= m;
    }

    public static void mandarDinero(CompteEstalvi ct1, CompteEstalvi ct2, Double cantidad) throws BankAccountException {
        if(!(ct1.getSaldo()>=0)){
            ct1.treure(cantidad);
            ct2.ingressar(cantidad);
        } else {
            throw new BankAccountException(ExceptionMessage.TRANSFER_ERROR);
        }
    }

    /**
     * Treu m diners del compte si n'hi han suficient sinó es llança l'excepció
     * @param m
     * @throws BankAccountException
     */




    public static String getNumCompte() {
        return numCompte;
    }

    public static double getSaldo() {
        return saldo;
    }

    public static List<Client> getLlista_usuaris() {
        return llista_usuaris;
    }
}
