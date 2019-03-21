package cliente;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;

public class Cliente {
    public static void main(String[] args) {     
        
        String nomeCliente = showInputDialog(null,"Informe seu nome:","",PLAIN_MESSAGE);
        
        Chat chat = new Chat(nomeCliente);
        chat.setVisible(true);
    }  
}
