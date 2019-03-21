package servidor;
import java.io.IOException;
import java.io.PrintStream;
import java.net.*;
import java.util.ArrayList;

public class Servidor {
    
    public static void main(String[] args) {
        ArrayList <PrintStream> listaConexoes = new ArrayList<>();
        try{
          ServerSocket server = new ServerSocket(1000);
          Socket socket_server;
          
          System.out.println("Servidor iniciado.");
          while(true){
              socket_server = server.accept();
              System.out.println("Nova conexão realizada!");
             listaConexoes.add(new PrintStream(socket_server.getOutputStream()));
             
             Mensagem mensagem = new Mensagem(socket_server,listaConexoes);
        }
      }catch(IOException e){
          e.printStackTrace();
    }
  }
}
