package jantarfilosofos;

import java.awt.Color;


public class mesaJantar extends javax.swing.JFrame {

    public mesaJantar() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mesaJantar = new javax.swing.JLabel();
        status_aristoteles = new javax.swing.JTextField();
        status_platao = new javax.swing.JTextField();
        leg_conversando = new javax.swing.JTextField();
        status_descartes = new javax.swing.JTextField();
        status_sarthre = new javax.swing.JTextField();
        botao_start = new javax.swing.JButton();
        status_socrates = new javax.swing.JTextField();
        leg_comendo = new javax.swing.JTextField();
        leg_pensando = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mesaJantar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jantarfilosofos/background.png"))); // NOI18N

        status_aristoteles.setEditable(false);
        status_aristoteles.setBackground(new java.awt.Color(255, 51, 51));
        status_aristoteles.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        status_aristoteles.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        status_aristoteles.setText("Aristóteles");

        status_platao.setEditable(false);
        status_platao.setBackground(new java.awt.Color(255, 51, 51));
        status_platao.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        status_platao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        status_platao.setText("Platão");

        leg_conversando.setEditable(false);
        leg_conversando.setBackground(new java.awt.Color(255, 51, 51));
        leg_conversando.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        leg_conversando.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        leg_conversando.setText("Conversando");

        status_descartes.setEditable(false);
        status_descartes.setBackground(new java.awt.Color(255, 51, 51));
        status_descartes.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        status_descartes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        status_descartes.setText("Descartes");

        status_sarthre.setEditable(false);
        status_sarthre.setBackground(new java.awt.Color(255, 51, 51));
        status_sarthre.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        status_sarthre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        status_sarthre.setText("Sarthre");

        botao_start.setText("Iniciar");
        botao_start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_startMouseClicked(evt);
            }
        });

        status_socrates.setEditable(false);
        status_socrates.setBackground(new java.awt.Color(255, 51, 51));
        status_socrates.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        status_socrates.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        status_socrates.setText("Sócrates");

        leg_comendo.setEditable(false);
        leg_comendo.setBackground(new java.awt.Color(0, 204, 0));
        leg_comendo.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        leg_comendo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        leg_comendo.setText("Comendo");

        leg_pensando.setEditable(false);
        leg_pensando.setBackground(java.awt.Color.cyan);
        leg_pensando.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        leg_pensando.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        leg_pensando.setText("Pensando");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mesaJantar)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(leg_conversando)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(leg_comendo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(leg_pensando, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botao_start, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(status_sarthre, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(status_aristoteles, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(status_platao, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(20, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(status_descartes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(status_socrates, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(status_platao, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status_aristoteles, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status_socrates, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status_descartes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(status_sarthre, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mesaJantar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(leg_conversando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(leg_comendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(leg_pensando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_start, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_startMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_startMouseClicked
        Filosofos jantar = new Filosofos();
        jantar.test();
    }//GEN-LAST:event_botao_startMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botao_start;
    public javax.swing.JTextField leg_comendo;
    public javax.swing.JTextField leg_conversando;
    public javax.swing.JTextField leg_pensando;
    private javax.swing.JLabel mesaJantar;
    public javax.swing.JTextField status_aristoteles;
    public javax.swing.JTextField status_descartes;
    public javax.swing.JTextField status_platao;
    public javax.swing.JTextField status_sarthre;
    public javax.swing.JTextField status_socrates;
    // End of variables declaration//GEN-END:variables

    //1 - comendo.
    //2 - pensando.
    //3 - conversando.
    public void status_filosofos(){
       this.status_sarthre.setBackground(Color.CYAN);
    }
}
