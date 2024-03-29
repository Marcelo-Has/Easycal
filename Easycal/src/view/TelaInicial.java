package view;

import java.text.DateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcelo
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        lblData = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menCadProd = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menCadMat = new javax.swing.JMenuItem();
        menCadCus = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menProcProd = new javax.swing.JMenuItem();
        menProcMat = new javax.swing.JMenuItem();
        menProcCus = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        desktop.setOpaque(false);
        desktop.setPreferredSize(new java.awt.Dimension(1080, 640));
        desktop.setRequestFocusEnabled(false);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        lblData.setText("Data:");

        menCadProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/page_add.png"))); // NOI18N
        menCadProd.setText("Cadastrar");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jMenuItem1.setText("Produtos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chamaCadProd(evt);
            }
        });
        menCadProd.add(jMenuItem1);

        menCadMat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        menCadMat.setText("Materiais");
        menCadMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chamaCadMat(evt);
            }
        });
        menCadProd.add(menCadMat);

        menCadCus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        menCadCus.setText("Custos");
        menCadProd.add(menCadCus);

        jMenuBar1.add(menCadProd);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/zoom.png"))); // NOI18N
        jMenu2.setText("Procurar");

        menProcProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/zoom.png"))); // NOI18N
        menProcProd.setText("Produtos");
        jMenu2.add(menProcProd);

        menProcMat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/zoom.png"))); // NOI18N
        menProcMat.setText("Materiais");
        jMenu2.add(menProcMat);

        menProcCus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/zoom.png"))); // NOI18N
        menProcCus.setText("Custos");
        jMenu2.add(menProcCus);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/information.png"))); // NOI18N
        jMenu3.setText("Ajuda");

        jMenuItem2.setText("Sobre");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chamaSobre(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1043, Short.MAX_VALUE)
                .addComponent(lblData)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chamaCadProd(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chamaCadProd
        // Chama Tela Cadastro Produtos
        TelaCadProd cadProduto = new TelaCadProd();
        cadProduto.setVisible(true);
        desktop.add(cadProduto);
        
    }//GEN-LAST:event_chamaCadProd

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Coloca a data atual do sistema ao inicializar
        Date data = new Date();
        DateFormat formatadorData = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formatadorData.format(data));
        
    }//GEN-LAST:event_formWindowActivated

    private void chamaSobre(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chamaSobre
        // Chamando Tela Sobre
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
        desktop.add(sobre);
    }//GEN-LAST:event_chamaSobre

    private void chamaCadMat(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chamaCadMat
        // Chama Tela Cadastro Materiais
        TelaCadMat cadMaterial = new TelaCadMat();
        cadMaterial.setVisible(true);
        desktop.add(cadMaterial);
    }//GEN-LAST:event_chamaCadMat

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblData;
    private javax.swing.JMenuItem menCadCus;
    private javax.swing.JMenuItem menCadMat;
    private javax.swing.JMenu menCadProd;
    private javax.swing.JMenuItem menProcCus;
    private javax.swing.JMenuItem menProcMat;
    private javax.swing.JMenuItem menProcProd;
    // End of variables declaration//GEN-END:variables
}
