/*
    Servidor para atividade de cálculadora
    Pedro Israel Santos Fonte Boa Vilaça - 7º Período
    Computação Paralela e Sistemas Distribuídos | Professor Ilo Rivero.
    Bacharelado em Ciência da Computação - Universidade de Itaúna
*/
package Calculadora;

import Calculadora.Calculadora;
import Calculadora.ImplCalculadora;
import java.rmi.Naming;

public class ServidorCalculo {
         public ServidorCalculo(){
             try{
                 Calculadora c = new ImplCalculadora();
                 Naming.rebind("//localhost/ServicoCalculo",c);
             } catch (Exception e){
                 System.out.println("Problema: "+ e);
             }
         }
         public static void main (String args[]){
             new ServidorCalculo();
         }
}
