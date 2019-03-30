/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modal.bean.Material;
import model.dao.MaterialDao;

/**
 *
 * @author Marcelo
 */
public class TelaCadMat extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadProd
     */
    public TelaCadMat() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tbCadMat.getModel();
        tbCadMat.setRowSorter(new TableRowSorter(modelo));
    }
    
    public void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) tbCadMat.getModel();
        modelo.setNumRows(0);

        MaterialDao mdao = new MaterialDao();

        for (Material m : mdao.read()) {

            modelo.addRow(new Object[]{
                m.getId(),
                m.getDescricao(),
                m.getPreco(),
                m.getTipo()
            });

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMatDesc = new javax.swing.JTextField();
        txtMatPreco = new javax.swing.JTextField();
        cboMatTipo = new javax.swing.JComboBox<>();
        btnMatCad = new javax.swing.JButton();
        btnMatAlt = new javax.swing.JButton();
        btnMatExc = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCadMat = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Produtos");
        setPreferredSize(new java.awt.Dimension(1080, 640));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do Material"));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Descrição: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Preço:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Tipo:");

        cboMatTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unidade", "Metro" }));

        btnMatCad.setText("Cadastrar");
        btnMatCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarMat(evt);
            }
        });

        btnMatAlt.setText("Atualizar");
        btnMatAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarMat(evt);
            }
        });

        btnMatExc.setText("Excluir");
        btnMatExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirMat(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnMatCad)
                        .addGap(35, 35, 35)
                        .addComponent(btnMatAlt)
                        .addGap(35, 35, 35)
                        .addComponent(btnMatExc))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtMatDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtMatPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboMatTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnMatAlt, btnMatCad, btnMatExc});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboMatTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMatCad)
                    .addComponent(btnMatAlt)
                    .addComponent(btnMatExc))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnMatAlt, btnMatCad, btnMatExc});

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Materiais"));

        tbCadMat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição", "Preço", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCadMat.setRequestFocusEnabled(false);
        tbCadMat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCadMatMouseClicked(evt);
            }
        });
        tbCadMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbCadMatKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbCadMat);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.getAccessibleContext().setAccessibleName("Informações do Material");

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        setBounds(0, 0, 1080, 640);
    }// </editor-fold>//GEN-END:initComponents

    private void tbCadMatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCadMatMouseClicked
        // TODO add your handling code here:
        
        if (tbCadMat.getSelectedRow() != -1) {
            txtMatDesc.setText(tbCadMat.getValueAt(tbCadMat.getSelectedRow(), 1).toString());
            txtMatPreco.setText(tbCadMat.getValueAt(tbCadMat.getSelectedRow(), 2).toString());
            cboMatTipo.setSelectedItem(tbCadMat.getValueAt(tbCadMat.getSelectedRow(), 3));
        }
    }//GEN-LAST:event_tbCadMatMouseClicked

    private void tbCadMatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbCadMatKeyReleased
        // TODO add your handling code here:
        
        if (tbCadMat.getSelectedRow() != -1) {
            txtMatDesc.setText(tbCadMat.getValueAt(tbCadMat.getSelectedRow(), 1).toString());
            txtMatPreco.setText(tbCadMat.getValueAt(tbCadMat.getSelectedRow(), 2).toString());
            cboMatTipo.setSelectedItem(tbCadMat.getValueAt(tbCadMat.getSelectedRow(), 3));
        }
    }//GEN-LAST:event_tbCadMatKeyReleased

    private void CadastrarMat(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarMat
        // Cadastras os Materiais:
        
        Material m = new Material();
        MaterialDao dao = new MaterialDao();
        
        m.setDescricao(txtMatDesc.getText());
        m.setPreco(Float.parseFloat(txtMatPreco.getText()));
        m.setTipo(cboMatTipo.getSelectedItem().toString());
        dao.create(m);

        txtMatDesc.setText("");
        txtMatPreco.setText("");

        readJTable();
    }//GEN-LAST:event_CadastrarMat

    private void AtualizarMat(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarMat
        // Atualiza os Materiais:
        
        if (tbCadMat.getSelectedRow() != -1) {

            Material m = new Material();
            MaterialDao dao = new MaterialDao();
            
            m.setId((int)tbCadMat.getValueAt(tbCadMat.getSelectedRow(), 0));
            m.setDescricao(txtMatDesc.getText());
            m.setPreco(Float.parseFloat(txtMatPreco.getText()));
            m.setTipo(cboMatTipo.getSelectedItem().toString());
            dao.update(m);

            txtMatDesc.setText("");
            txtMatPreco.setText("");

            readJTable();
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione um material para atualizar.");
        }
    }//GEN-LAST:event_AtualizarMat

    private void ExcluirMat(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirMat
        // Exclui os Materiais:
        
        if (tbCadMat.getSelectedRow() != -1) {
            
            Material m = new Material();
            MaterialDao dao = new MaterialDao();

            m.setId((int)tbCadMat.getValueAt(tbCadMat.getSelectedRow(), 0));
            dao.delete(m);

            txtMatDesc.setText("");
            txtMatPreco.setText("");

            readJTable();
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione um material para excluir.");
        }
        
    }//GEN-LAST:event_ExcluirMat


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMatAlt;
    private javax.swing.JButton btnMatCad;
    private javax.swing.JButton btnMatExc;
    private javax.swing.JComboBox<String> cboMatTipo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbCadMat;
    private javax.swing.JTextField txtMatDesc;
    private javax.swing.JTextField txtMatPreco;
    // End of variables declaration//GEN-END:variables
}