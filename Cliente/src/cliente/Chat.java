package cliente;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.*;
import static javax.swing.JOptionPane.*;

public class Chat extends javax.swing.JFrame {

    private String nomeCliente;
    private Socket socket_chat;
    private BufferedReader buffer_chat;
    private InputStreamReader input_chat;
    private boolean execute;

    public Chat(String nomeCliente) {
        initComponents();
        this.nomeCliente = nomeCliente;
        execute = true;
        try {
            socket_chat = new Socket("127.0.0.1", 1000);
        } catch (IOException e) {
            showMessageDialog(null, "Não foi possível conectar ao servidor!", "", ERROR_MESSAGE);
            System.exit(0);
        }
        Thread();
    }

    private void Thread(){
        Thread thread_chat = new Thread(new Runnable() {
            String mensagem;
            public void run() {
                try{
                    input_chat = new InputStreamReader(socket_chat.getInputStream());
                    buffer_chat = new BufferedReader(input_chat);
                    
                    while((mensagem = buffer_chat.readLine())!=null){
                        mensagemRecebida.setText(mensagemRecebida.getText() + mensagem + "\n");
                        
                        if(!execute){
                            break;
                        }
                    }
                }catch(IOException e){
                    showMessageDialog(null,"Erro de conexão com o servidor!","",ERROR_MESSAGE);
                }
            }
        });
        thread_chat.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        mensagemRecebida = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        mensagemEnviada = new javax.swing.JTextArea();
        btEnviar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);

        mensagemRecebida.setEditable(false);
        mensagemRecebida.setColumns(20);
        mensagemRecebida.setRows(5);
        jScrollPane1.setViewportView(mensagemRecebida);

        mensagemEnviada.setColumns(20);
        mensagemEnviada.setRows(5);
        mensagemEnviada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mensagemEnviadaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(mensagemEnviada);

        btEnviar.setText("Enviar");
        btEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEnviarMouseClicked(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEnviarMouseClicked
        try {
            String mensagem = nomeCliente + " disse: ";
            PrintStream ps_chat = new PrintStream(socket_chat.getOutputStream());
            mensagem += mensagemEnviada.getText();
            ps_chat.println(mensagem);
            ps_chat.flush();

            mensagemEnviada.setText("");
        } catch (IOException e) {
            showMessageDialog(null, "Não foi possível enviar a mensagem!", "", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btEnviarMouseClicked

    private void mensagemEnviadaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mensagemEnviadaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String mensagem = nomeCliente + " disse: ";
                PrintStream ps_chat = new PrintStream(socket_chat.getOutputStream());
                mensagem += mensagemEnviada.getText();
                ps_chat.println(mensagem);
                ps_chat.flush();

                mensagemEnviada.setText("");
            } catch (IOException e) {
                showMessageDialog(null, "Não foi possível enviar a mensagem!", "", ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_mensagemEnviadaKeyPressed

    private void btSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSairMouseClicked
       try{
           socket_chat.close();
           System.exit(0);
       }catch(IOException e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_btSairMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEnviar;
    private javax.swing.JButton btSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea mensagemEnviada;
    private javax.swing.JTextArea mensagemRecebida;
    // End of variables declaration//GEN-END:variables
}
