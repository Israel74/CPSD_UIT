package jantarfilosofos;

import java.util.Random;

/*
 * Platão /      garfo_5 (direita) e garfo_1 (esquerda)
 * Aristóteles / garfo_1 (direita) e garfo_2 (esquerda)
 * Sócrates /    garfo_2 (direita) e garfo_3 (esquerda)
 * Descartes /   garfo_3 (direita) e garfo_4 (esquerda)
 * Sarthre /     garfo_4 (direita) e garfo_5 (esquerda)
 * 
 * @author Israel Vilaça
 */
public class Filosofos {

    public class Garfos extends Thread{
        private final int garfoEsquerda;
        private final int garfoDireita;

        public Garfos(int garfoEsquerda, int garfoDireita){
            this.garfoEsquerda = garfoEsquerda;
            this.garfoDireita = garfoDireita;
        }
        public void run() {
            while(true) {
                try {
                    SorteioDireita();
                    SorteioEsquerda();
                    Thread.sleep(5000);
                } catch(InterruptedException ex){
                    System.out.println(ex);
                }
            }
        }
        public void SorteioDireita() {
            int garfoDireita;
            Random d = new Random();
            garfoDireita = d.nextInt(5);
            System.out.println("O garfo da direita sorteado " + garfoDireita);
        }
        public void SorteioEsquerda() {
            int garfoEsquerda;
            Random e = new Random();
            garfoEsquerda = e.nextInt(5);
            
            System.out.println("O garfo da esquerda sorteado " + garfoEsquerda);
        }
    }
    
    public class Filosofo extends Thread{
        String nome;
        Garfos garfo;
        public Filosofo(String nome, Garfos garfo) {
            this.nome=nome;
            this.garfo=garfo;
            System.out.println("O filósofo " + nome + " sentou à mesa.");
        }
        
        public void Pensar() throws InterruptedException{
            System.out.println("O filósofo " + nome + " está pesando. ");
           
            Thread.sleep(5000);
        }
        
        public void run() {
            while(true) {
                if(garfo.garfoDireita==5) {
                    System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.garfoDireita);
                    if(garfo.garfoEsquerda==1) {
                        System.out.println("O filósofo " + nome + " pegou o garfo "+ garfo.garfoEsquerda);
                        System.out.println("O filósofo " + nome + " está comendo.");
                        System.out.println("O filósofo " + nome + " largou o garfo da direita.");
                        System.out.println("O filósofo " + nome + " largou o garfo da esquerda.");
                    } else {
                        System.out.println("O filósofo " + nome + " largou o garfo "+ garfo.garfoDireita);
                    }
                } else {
                    try {
                        Pensar();
                    }catch(InterruptedException ex) {
                        System.out.println(ex);
                    }
                }
                if(garfo.garfoDireita == 1) {
                    System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.garfoDireita);
                    if(garfo.garfoEsquerda == 2) {
                        System.out.println("O filósofo " + nome + " pegou o garfo" + garfo.garfoEsquerda);
                        System.out.println("O filósofo " + nome + " está comendo.");
                        System.out.println("O filósofo " + nome + " largou o garfo da direita.");
                        System.out.println("O filósofo " + nome + " largou o garfo da esquerda.");
                    }else {
                        System.out.println("O filósofo " + nome + " largou o garfo " + garfo.garfoDireita);
                    }
                } else {
                    try {
                        Pensar();
                    } catch(InterruptedException ex) {
                        System.out.println(ex);
                    }
                }
                
                if(garfo.garfoDireita == 2) {
                    System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.garfoDireita);
                    if(garfo.garfoEsquerda == 3) {
                        System.out.println("O filósofo " + nome + " pegou o garfo" + garfo.garfoEsquerda);
                        System.out.println("O filósofo " + nome + " está comendo.");
                        System.out.println("O filósofo " + nome + " largou o garfo da direita.");
                        System.out.println("O filósofo " + nome + " largou o garfo da esquerda.");
                    }else {
                        System.out.println("O filósofo " + nome + " largou o garfo " + garfo.garfoDireita);
                    }
                } else {
                    try {
                        Pensar();
                    } catch(InterruptedException ex) {
                        System.out.println(ex);
                    }
                }
                if(garfo.garfoDireita == 3) {
                    System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.garfoDireita);
                    if(garfo.garfoEsquerda == 4) {
                        System.out.println("O filósofo " + nome + " pegou o garfo" + garfo.garfoEsquerda);
                        System.out.println("O filósofo " + nome + " está comendo.");
                        System.out.println("O filósofo " + nome + " largou o garfo da direita.");
                        System.out.println("O filósofo " + nome + " largou o garfo da esquerda.");
                    }else {
                        System.out.println("O filósofo " + nome + " largou o garfo " + garfo.garfoDireita);
                    }
                } else {
                    try {
                        Pensar();
                    } catch(InterruptedException ex) {
                        System.out.println(ex);
                    }
                }
                if(garfo.garfoDireita == 4) {
                    System.out.println("O filósofo " + nome + " pegou o garfo " + garfo.garfoDireita);
                    if(garfo.garfoEsquerda == 5) {
                        System.out.println("O filósofo " + nome + " pegou o garfo" + garfo.garfoEsquerda);
                        System.out.println("O filósofo " + nome + " está comendo.");
                        System.out.println("O filósofo " + nome + " largou o garfo da direita.");
                        System.out.println("O filósofo " + nome + " largou o garfo da esquerda.");
                    }else {
                        System.out.println("O filósofo " + nome + " largou o garfo " + garfo.garfoDireita);
                    }
                } else {
                    try {
                        Pensar();
                    } catch(InterruptedException ex) {
                        System.out.println(ex);
                    }
                }
            }
        }
    }
    
        public void test() {
            Garfos g1 = new Garfos(1,5);
            Garfos g2 = new Garfos(2,1);
            Garfos g3 = new Garfos(3,2);
            Garfos g4 = new Garfos(4,3);
            Garfos g5 = new Garfos(5,4);
            
            Filosofo platao = new Filosofo("Platão", g1);
            Filosofo aristoteles = new Filosofo("Aristóteles", g2);
            Filosofo socrates = new Filosofo("Sócrates", g3);
            Filosofo descartes = new Filosofo("Descartes", g4);
            Filosofo sarthre = new Filosofo("Sarthre", g5);
            
            new Thread(platao).start();
            new Thread(aristoteles).start();
            new Thread(socrates).start();
            new Thread(descartes).start();
            new Thread(sarthre).start();                                                
        }
}
