/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasibukualamat;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class BukuAlamat extends javax.swing.JFrame {
    
   int r = 0;
    /**
     * Creates new form BukuAlamat
     */
    public BukuAlamat() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dAlamat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dNomor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelAlamat = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("BUKU ALAMAT");

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Tambah Data");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel3.setText("Nama");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 51, -1, -1));
        jPanel2.add(dNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 48, 291, -1));

        jLabel4.setText("Alamat");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 99, -1, -1));
        jPanel2.add(dAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 96, 292, -1));

        jLabel5.setText("No Hp");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 148, -1, -1));
        jPanel2.add(dNomor, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 145, 292, -1));

        jLabel6.setText("Email");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 191, -1, -1));
        jPanel2.add(dEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 188, 292, -1));

        tabelAlamat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama", "Alamat", "No Hp", "Email"
            }
        ));
        tabelAlamat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelAlamatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelAlamat);
        if (tabelAlamat.getColumnModel().getColumnCount() > 0) {
            tabelAlamat.getColumnModel().getColumn(1).setResizable(false);
        }

        btnTambah.setText("Add");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setText("Delete");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnEdit.setText("Update");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnReset.setText("Clear");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnHapus)
                    .addComponent(btnEdit)
                    .addComponent(btnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();//untuk menutup aplikasi

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
      tabelAlamat.setValueAt(dNama.getText(), r , 0);
      dNama.setText("");
      tabelAlamat.setValueAt(dAlamat.getText(), r , 1);
      dAlamat.setText("");
      tabelAlamat.setValueAt(dNomor.getText(), r , 2);
      dNomor.setText("");
      tabelAlamat.setValueAt(dEmail.getText(), r , 3);
      dEmail.setText(""); //dalam koding ini adalah untuk menambahkan data ke dalam tabel alamat setelah user input semuanya
      
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        dNama.setText("");
        dAlamat.setText("");
        dNomor.setText(""); //dalam koding ini digunakan untuk mengosong seluruh field yang telah diinput oleh user
        dEmail.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
         DefaultTableModel alamat = (DefaultTableModel) tabelAlamat.getModel();
         if (tabelAlamat.getSelectedRowCount()==1){
             alamat.removeRow(tabelAlamat.getSelectedRow());
             JOptionPane.showMessageDialog(this,"Data Berhasil Dihapus");
         }else{
             if(tabelAlamat.getRowCount()==0){
                 //ketika tidak ada data didalam tabel 
                 JOptionPane.showMessageDialog(this,"Tidak ada data");
             }else{
                 JOptionPane.showMessageDialog(this,"Pilih data yang ingin dihapus");
             }
         }
// TODO add your handling code here:
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tabelAlamatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelAlamatMouseClicked
        
       DefaultTableModel alamat = (DefaultTableModel) tabelAlamat.getModel();
        dNama.setText(alamat.getValueAt(tabelAlamat.getSelectedRow(),0).toString());
        dAlamat.setText(alamat.getValueAt(tabelAlamat.getSelectedRow(),1).toString());
        dNomor.setText(alamat.getValueAt(tabelAlamat.getSelectedRow(),2).toString());
        dEmail.setText(alamat.getValueAt(tabelAlamat.getSelectedRow(),3).toString());
        // koding ini berisi tentang ketika tabel diklik makan akan langsung mengisi field untuk  diedit dengan klik tombol edit
    }//GEN-LAST:event_tabelAlamatMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
     DefaultTableModel alamat = (DefaultTableModel) tabelAlamat.getModel();
        if(tabelAlamat.getSelectedRowCount()== 1){ 
          alamat.setValueAt(dNama.getText(), tabelAlamat.getSelectedRow(),0);
          alamat.setValueAt(dAlamat.getText(), tabelAlamat.getSelectedRow(),1); 
          alamat.setValueAt(dNomor.getText(), tabelAlamat.getSelectedRow(),2);
          alamat.setValueAt(dEmail.getText(), tabelAlamat.getSelectedRow(),3);
          //ketika update dan iklik update maka akan langsung berubah data yang diinginkan user
        }else{
            JOptionPane.showMessageDialog(this,"Pilih data yang ingin di edit!!");
        }
    }//GEN-LAST:event_btnEditActionPerformed

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
            java.util.logging.Logger.getLogger(BukuAlamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BukuAlamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BukuAlamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BukuAlamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BukuAlamat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTambah;
    private javax.swing.JTextField dAlamat;
    private javax.swing.JTextField dEmail;
    private javax.swing.JTextField dNama;
    private javax.swing.JTextField dNomor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelAlamat;
    // End of variables declaration//GEN-END:variables
}
