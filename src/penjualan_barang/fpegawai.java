/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan_barang;

/**
 *
 * @author Administrator
 */

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class fpegawai extends javax.swing.JFrame {

    /**
     * Creates new form fpegawai
     */
    
    Connection cn = koneksi.getKoneksi();
    
    private DefaultTableModel model;

    public fpegawai() {
        initComponents();
        model = new DefaultTableModel();
        tabel.setModel(model);
        model.addColumn("username");
        model.addColumn("password");
        model.addColumn("jenis_kelamin");
        model.addColumn("email");
        model.addColumn("no_telp");
        model.addColumn("agama");
        model.addColumn("alamat");
        loadData();
        
    }
    
    public final void loadData() {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try {
            Connection c = koneksi.getKoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM tbl_login";
            ResultSet r = s.executeQuery(sql);
            while (r.next()) {
                Object[] o = new Object[7];
                o[0] = r.getString("username");
                o[1] = r.getString("password");
                o[2] = r.getString("jenis_kelamin");
                o[3] = r.getString("email");
                o[4] = r.getInt("no_telp");
                o[5] = r.getString("agama");
                o[6] = r.getString("alamat");

                model.addRow(o);
            }
            r.close();
            s.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Error Load Data");
            System.out.println(e.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tf_password = new javax.swing.JTextField();
        tf_retype = new javax.swing.JTextField();
        tf_email = new javax.swing.JTextField();
        laki = new javax.swing.JRadioButton();
        perempuan = new javax.swing.JRadioButton();
        tf_username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pilihAgama = new javax.swing.JComboBox<>();
        tf_notelp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_alamat = new javax.swing.JTextArea();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(33, 156, 144));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pengolahan Data Pegawai");

        jButton1.setText("Kembali");
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
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel6))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(238, 78, 78));

        tf_retype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_retypeActionPerformed(evt);
            }
        });

        laki.setText("Laki-Laki");

        perempuan.setText("Perempuan");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Retype");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jenis Kelamin");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("No. Telp");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Agama");

        pilihAgama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Kristen", "Budha", "Hindu" }));
        pilihAgama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihAgamaActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Alamat");

        tf_alamat.setColumns(20);
        tf_alamat.setRows(5);
        jScrollPane1.setViewportView(tf_alamat);

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Password", "Jenis Kelamin", "Email", "No Telp", "Agama", "Alamat"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_retype, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_notelp, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(pilihAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(laki)
                        .addGap(18, 18, 18)
                        .addComponent(perempuan))
                    .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnTambah)
                        .addGap(67, 67, 67)
                        .addComponent(btnHapus)
                        .addGap(77, 77, 77)
                        .addComponent(btnUbah)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(tf_notelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(pilihAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_retype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(laki)
                            .addComponent(perempuan)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnHapus)
                    .addComponent(btnUbah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_retypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_retypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_retypeActionPerformed

    private void pilihAgamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihAgamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pilihAgamaActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        String jenisKelamin;
        if (laki.isSelected()) {
            jenisKelamin = laki.getText();
        } else {
            jenisKelamin = perempuan.getText();
        }

        String agama = pilihAgama.getSelectedItem().toString();

        if (!tf_password.getText().equals(tf_retype.getText())) {
            JOptionPane.showMessageDialog(null, "Password dan Retype Password harus sama!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (tf_username.getText().equals("") || tf_password.getText().equals("") 
                || tf_retype.getText().equals("") || jenisKelamin.equals("")
                || tf_email.getText().equals("") || tf_notelp.getText().equals("") || agama.equals("")
                || tf_alamat.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "LENGKAPI DATA!", "Data Pegawai Harus Diisi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int i = tabel.getSelectedRow();
            if (i == -1) {
                return;
            }

            String sendUsername = tf_username.getText();
            String sendPassword = tf_password.getText();
            String sendJenisKelamin = jenisKelamin;
            String sendEmail = tf_email.getText();
            String sendNotelp = tf_notelp.getText();
            String sendAgama = agama;
            String sendAlamat = tf_alamat.getText();

            try {
                Connection c = koneksi.getKoneksi();
                String sql = "UPDATE tbl_login SET username = ?, password = ?, jenis_kelamin = ?, email = ?, no_telp = ?, agama = ?, alamat = ? WHERE username = ?";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, sendUsername);
                p.setString(2, sendPassword);
                p.setString(3, sendJenisKelamin);
                p.setString(4, sendEmail);
                p.setString(5, sendNotelp);
                p.setString(6, sendAgama);
                p.setString(7, sendAlamat);
                p.setString(8, sendUsername);

                p.executeUpdate();
                p.close();
            } catch (SQLException e) {
                System.out.println("Terjadi Error: " + e.getMessage());
            } finally {
                loadData();
                tf_username.setText("");
                tf_password.setText("");
                tf_retype.setText("");
                //jenis kelamin
                tf_email.setText("");
                tf_notelp.setText("");
                pilihAgama.setSelectedItem("");
                tf_alamat.setText("");
                btnTambah.setEnabled(true);
                JOptionPane.showMessageDialog(null, "Data berhasil diubah", "Data Pegawai", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        String jenisKelamin;
        if(laki.isSelected()){
            jenisKelamin = laki.getText();
        }else{
            jenisKelamin = perempuan.getText();
        }
        
        String agama;
        agama = pilihAgama.getSelectedItem().toString();
        
        if (!tf_password.getText().equals(tf_retype.getText())) {
            JOptionPane.showMessageDialog(null, "Password dan Retype Password harus sama!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(tf_username.getText().equals("") || tf_password.getText().equals("") 
                || tf_retype.getText().equals("") || jenisKelamin.equals("")
                || tf_email.getText().equals("") || tf_notelp.getText().equals("") || agama.equals("")
                || tf_alamat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "LENGKAPI DATA !", "Data Pegawai Harus Diisi",
            JOptionPane.INFORMATION_MESSAGE);
        }else{
            String sendUsername = tf_username.getText();
            String sendPassword = tf_password.getText();
            String sendJenisKelamin = jenisKelamin;
            String sendEmail = tf_email.getText();
            String sendNotelp = tf_notelp.getText();
            String sendAgama = agama;
            String sendAlamat = tf_alamat.getText();
            
            try{
                Connection c = koneksi.getKoneksi();
                
               String sql = "INSERT INTO tbl_login (username, password, jenis_kelamin, email, no_telp, agama, alamat, id_login) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";


               PreparedStatement p = c.prepareStatement(sql);
               p.setString(1, sendUsername);
               p.setString(2, sendPassword);
               p.setString(3, sendJenisKelamin);
               p.setString(4, sendEmail);
               p.setString(5, sendNotelp);
               p.setString(6, sendAgama);
               p.setString(7, sendAlamat);
               p.setString(8, null);

               p.executeUpdate();
               p.close();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }finally{
                tf_username.setText("");
                tf_password.setText("");
                tf_retype.setText("");
                //jenis kelamin
                tf_email.setText("");
                tf_notelp.setText("");
                pilihAgama.setSelectedItem("");
                tf_alamat.setText("");
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Data Pegawai",
                JOptionPane.INFORMATION_MESSAGE);
                
                loadData();
                
            }
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        try {
            String sql ="delete from tbl_login where username='"+tf_username.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.getKoneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "berhasil di hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        loadData();
        tf_username.setText("");
        tf_password.setText("");
        tf_retype.setText("");
        //jenis kelamin
        tf_email.setText("");
        tf_notelp.setText("");
        pilihAgama.setSelectedItem("");
        tf_alamat.setText("");
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        btnTambah.setEnabled(false);
        btnUbah.setEnabled(true);
        btnHapus.setEnabled(true);
        int i = tabel.getSelectedRow();
        if (i == -1) {
        return;
        }
        
        String username = (String) model.getValueAt(i, 0);
        tf_username.setText(username);
        
        String password = (String) model.getValueAt(i, 1);
        tf_password.setText(password);
        String retype = (String) model.getValueAt(i, 1);
        tf_retype.setText(retype);
        
        String jenis_kelamin = (String) model.getValueAt(i, 2);
        if(jenis_kelamin.equalsIgnoreCase("Laki-Laki")){
            laki.setSelected(true);
            perempuan.setSelected(false);
        }else{
            perempuan.setSelected(true);
            laki.setSelected(false);
        }
        
        String email = (String) model.getValueAt(i, 3);
        tf_email.setText(email);
        
        int no_telp = (int) model.getValueAt(i, 4);
        tf_notelp.setText(String.valueOf(no_telp));
        
        String agama = (String) model.getValueAt(i, 5);
        pilihAgama.setSelectedItem(agama);
        
        String alamat = (String) model.getValueAt(i, 6);
        tf_alamat.setText(alamat);
    }//GEN-LAST:event_tabelMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        fmenu2 fm = new fmenu2();
        fm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(fpegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fpegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fpegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fpegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fpegawai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton laki;
    private javax.swing.JRadioButton perempuan;
    private javax.swing.JComboBox<String> pilihAgama;
    private javax.swing.JTable tabel;
    private javax.swing.JTextArea tf_alamat;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_notelp;
    private javax.swing.JTextField tf_password;
    private javax.swing.JTextField tf_retype;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables
}
