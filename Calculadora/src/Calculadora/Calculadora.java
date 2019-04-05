/*
    Interface para atividade de cálculadora
    Pedro Israel Santos Fonte Boa Vilaça - 7º Período
    Computação Paralela e Sistemas Distribuídos | Professor Ilo Rivero.
    Bacharelado em Ciência da Computação - Universidade de Itaúna
*/

package Calculadora;

import java.rmi.RemoteException;

/*
    Interface de métodos para calculadora remota (RMI).
*/
public interface Calculadora  extends java.rmi.Remote{
    /*
        Método para Adição.
    */
    public long add(long a, long b) throws RemoteException;
    /*
        Método para Subtração.
    */
    public long sub(long a, long b) throws RemoteException;
    /*
        Método para Multiplicação.
    */
    public long mul(long a, long b) throws RemoteException;
    /*
        Método para Divisão.
    */
    public long div(long a, long b) throws RemoteException;
    /*
        Conforme solicitado na atividade, método para retornar o nome do desenvolvedor.
    */
    public String Nome();
}
