package servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.*;
import java.util.ArrayList;

public class Mensagem {

    private Socket socket_mensagem;
    private ArrayList<PrintStream> listaConexoes;

    public void setListaConexoes(ArrayList<PrintStream> listaConexoes) {
        this.listaConexoes = listaConexoes;
    }

    public Mensagem(Socket socket_mensagem, ArrayList<PrintStream> listaConexoes) {
        this.socket_mensagem = socket_mensagem;
        this.listaConexoes = listaConexoes;
        Thread();
    }

    private void Thread() {
        Thread thread_mensagem = new Thread(new Runnable() {
            String mensagem = "";
            @Override
            public void run() {
                try {
                    InputStreamReader input_mensagem = new InputStreamReader(socket_mensagem.getInputStream());
                    BufferedReader buffer_mensagem = new BufferedReader(input_mensagem);

                    while ((mensagem = buffer_mensagem.readLine()) != null) {
                        enviarMensagem(mensagem);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        String mensagem = "";

        thread_mensagem.start();
    }

    private void enviarMensagem(String mensagem) {
        for (int contador = 0; contador < listaConexoes.size(); contador++) {
            listaConexoes.get(contador).println(mensagem);
            listaConexoes.get(contador).flush();
        }
    }
}
