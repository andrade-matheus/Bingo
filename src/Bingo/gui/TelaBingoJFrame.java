/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bingo.gui;

import Bingo.persistencia.BingoPersistenciaImplArquivo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author matheus
 */
public class TelaBingoJFrame extends javax.swing.JFrame {

    /**
     * Creates new form TelaBingoJFrame
     */
    public TelaBingoJFrame() {
        initComponents();
//        reiniciar();
        load();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelConteudo = new javax.swing.JPanel();
        jButtonSortear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jButtonReiniciar = new javax.swing.JButton();
        jTextFieldContador = new javax.swing.JTextField();
        jLabelContador = new javax.swing.JLabel();
        jLabelSorteado = new javax.swing.JLabel();
        jTextFieldSorteado = new javax.swing.JTextField();
        jLabelIntervalo = new javax.swing.JLabel();
        jFormattedTextFieldIntervalo = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCrono = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelConteudo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSortear.setText("Sortear");
        jButtonSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSortearActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Crescente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        jButtonReiniciar.setText("Reiniciar");
        jButtonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReiniciarActionPerformed(evt);
            }
        });

        jTextFieldContador.setEditable(false);
        jTextFieldContador.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jTextFieldContador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldContador.setText("0");

        jLabelContador.setText("Contador:");

        jLabelSorteado.setText("Número Sorteado:");

        jTextFieldSorteado.setEditable(false);
        jTextFieldSorteado.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jTextFieldSorteado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldSorteado.setText("0");

        jLabelIntervalo.setText("Nº Final:");

        try {
            jFormattedTextFieldIntervalo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldIntervalo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldIntervalo.setText("90");
        jFormattedTextFieldIntervalo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N

        tabelaCrono.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sorteados"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaCrono);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSortear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldContador)
                    .addComponent(jLabelContador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldSorteado)
                    .addComponent(jLabelSorteado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelIntervalo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jFormattedTextFieldIntervalo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSortear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelSorteado)
                                .addGap(4, 4, 4)
                                .addComponent(jTextFieldSorteado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelIntervalo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldIntervalo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelContador)
                                .addGap(4, 4, 4)
                                .addComponent(jTextFieldContador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSortearActionPerformed

        Integer limite;
        limite = Integer.valueOf(jFormattedTextFieldIntervalo.getText()) + 1;
        jFormattedTextFieldIntervalo.setEditable(false);

        BingoPersistenciaImplArquivo persistencia = new BingoPersistenciaImplArquivo();
        Random rand = new Random();
        Integer numero = rand.nextInt(limite);
        List<Integer> sorteados = persistencia.listar();

        if (sorteados.size() < limite) {
            while (sorteados.contains(numero)) {
                numero = rand.nextInt(limite);
            }
            sorteados.add(numero);

            persistencia.put(numero);
        }else{
            JOptionPane.showMessageDialog(this,"Todos valores já sorteados, reinicie o Bingo!");
        }

        jTextFieldSorteado.setText(String.valueOf(numero));

        load();
    }//GEN-LAST:event_jButtonSortearActionPerformed

    private void jButtonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReiniciarActionPerformed
        reiniciar();
    }//GEN-LAST:event_jButtonReiniciarActionPerformed

    public void reiniciar() {
        BingoPersistenciaImplArquivo persistencia = new BingoPersistenciaImplArquivo();

        List<Integer> sorteados = persistencia.listar();

        for (Integer sorteado : sorteados) {
            persistencia.delete(sorteado);
        }
        jTextFieldSorteado.setText("0");
        jFormattedTextFieldIntervalo.setEditable(true);
        load();
    }

    public void load() {
        BingoPersistenciaImplArquivo persistencia = new BingoPersistenciaImplArquivo();
        
        
        DefaultTableModel dfm = (DefaultTableModel) tabela.getModel();
        List<Integer> sorteados = persistencia.listar();
        int linhas = dfm.getRowCount();
        for (int i = 0; i < linhas; i++) {
            dfm.removeRow(0);
        }
        
        DefaultTableModel dfmCrono = (DefaultTableModel) tabelaCrono.getModel();
        int linhasCrono = dfmCrono.getRowCount();
        for (int i = 0; i < linhas; i++) {
            dfmCrono.removeRow(0);
        }
        
        
        
        //OrdemCronologica
        
        for (Integer sorteado : sorteados) {
            Object[] linhaCrono = new Object[1];
            linhaCrono[0] = sorteado;
            dfmCrono.addRow(linhaCrono);
        }
        
        //OrdemCrescente
        
        Collections.sort(sorteados);
        
        for (Integer sorteado : sorteados) {
            Object[] linha = new Object[1];
            linha[0] = sorteado;
            dfm.addRow(linha);
        }
        
        jTextFieldContador.setText(String.valueOf(sorteados.size()));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaBingoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBingoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBingoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBingoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBingoJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonReiniciar;
    private javax.swing.JButton jButtonSortear;
    private javax.swing.JFormattedTextField jFormattedTextFieldIntervalo;
    private javax.swing.JLabel jLabelContador;
    private javax.swing.JLabel jLabelIntervalo;
    private javax.swing.JLabel jLabelSorteado;
    private javax.swing.JPanel jPanelConteudo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldContador;
    private javax.swing.JTextField jTextFieldSorteado;
    private javax.swing.JTable tabela;
    private javax.swing.JTable tabelaCrono;
    // End of variables declaration//GEN-END:variables
}
