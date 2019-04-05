/*
    Servidor para atividade de cálculadora
    Pedro Israel Santos Fonte Boa Vilaça - 7º Período
    Computação Paralela e Sistemas Distribuídos | Professor Ilo Rivero.
    Bacharelado em Ciência da Computação - Universidade de Itaúna
*/
package Calculadora;

import java.rmi.Naming;

public class ClienteCalculadora {
    public static void main(String[] args){
        try{
            Calculadora c = (Calculadora) Naming.lookup( "rmi://localhost:1099/ServicoCalculo");
            System.out.println(c.sub(4,3));
            System.out.println(c.add(4,5));
            System.out.println(c.mul(3,6));
            System.out.println(c.div(9,3));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
