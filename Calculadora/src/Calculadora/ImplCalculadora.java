/*
    Implementação de métodos para atividade de cálculadora
    Pedro Israel Santos Fonte Boa Vilaça - 7º Período
    Computação Paralela e Sistemas Distribuídos | Professor Ilo Rivero.
    Bacharelado em Ciência da Computação - Universidade de Itaúna
*/
package Calculadora;

import Calculadora.Calculadora;
import java.rmi.RemoteException;

public class ImplCalculadora implements Calculadora{
    /*
        Método Construtor.
     */
    public ImplCalculadora () throws RemoteException{
        super ();
    }
    /*
        Método de Adição.
    */
    public long add(long a, long b) throws RemoteException {
        return (a+b);
    }
    /*
        Método de Subtração.
    */
    public long sub(long a, long b) throws RemoteException {
        return (a-b);
    }
    public long mul(long a, long b) throws RemoteException {
        return (a*b);
    }
    public long div(long a, long b) throws RemoteException {
        return (a/b);
    }
    public String Nome() {
        return ("Israel Vilaça");
    }
}
