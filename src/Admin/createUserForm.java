/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Admin;

import Config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author scc-college
 */
public class createUserForm extends javax.swing.JFrame {

    /** Creates new form addForm */
    public createUserForm() {
        initComponents();
    }
     public static String email, usname;
    public boolean duplicateCheck(){
    dbConnector dbc = new dbConnector();
    try{
    String query = "SELECT * FROM insur WHERE user = '" + user.getText() + "' OR email = '" + em.getText() + "'";
    ResultSet resultSet = dbc.getData(query);
    
        
  
    if (resultSet.next()){
             email = resultSet.getString("email");
            if(email.equals(em.getText())){
               JOptionPane.showMessageDialog(null, "Email is already used!");
               em.setText("");
            }
            usname = resultSet.getString("user");
             if(usname.equals(user.getText())){
               JOptionPane.showMessageDialog(null, "Username is already used!");
                user.setText("");
            }
          
        return true;
    }else{
        return false;
    }

    }catch(SQLException ex){
     System.out.println(""+ex);
    
        return false;
    }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        fn = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        ut = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        pass = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        us = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("INSURANCE TRACKER");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registration");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        user.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        user.setForeground(new java.awt.Color(153, 153, 153));
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.setText("USERNAME");
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
        });
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 250, 30));

        fn.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        fn.setForeground(new java.awt.Color(153, 153, 153));
        fn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fn.setText("FIRSTNAME");
        fn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fnMouseClicked(evt);
            }
        });
        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 250, 29));

        em.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        em.setForeground(new java.awt.Color(153, 153, 153));
        em.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        em.setText("EMAIL");
        em.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emMouseClicked(evt);
            }
        });
        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        jPanel1.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 250, 29));

        contact.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        contact.setForeground(new java.awt.Color(153, 153, 153));
        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contact.setText("CONTACT#");
        contact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactMouseClicked(evt);
            }
        });
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 250, 29));

        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "USER" }));
        ut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utActionPerformed(evt);
            }
        });
        jPanel1.add(ut, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 250, 33));

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 91, 30));

        pass.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        pass.setForeground(new java.awt.Color(153, 153, 153));
        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass.setText("PASSWORD");
        pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passMouseClicked(evt);
            }
        });
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 250, 29));

        ln.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        ln.setForeground(new java.awt.Color(153, 153, 153));
        ln.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ln.setText("LASTNAME");
        ln.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lnMouseClicked(evt);
            }
        });
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        jPanel1.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 250, 29));

        jTextField2.setBackground(new java.awt.Color(204, 204, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 153)));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 130, -1));

        us.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });
        jPanel1.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 250, 33));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        user.setText("");
    }//GEN-LAST:event_userMouseClicked

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void fnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fnMouseClicked
        fn.setText("");
    }//GEN-LAST:event_fnMouseClicked

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed

    }//GEN-LAST:event_fnActionPerformed

    private void emMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emMouseClicked
        em.setText("");
    }//GEN-LAST:event_emMouseClicked

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed

    }//GEN-LAST:event_emActionPerformed

    private void contactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactMouseClicked
        contact.setText("");
    }//GEN-LAST:event_contactMouseClicked

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed

    }//GEN-LAST:event_contactActionPerformed

    private void utActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(fn.getText().isEmpty()|| ln.getText().isEmpty()|| user.getText().isEmpty()|| em.getText().isEmpty()
            || pass.getText().isEmpty()|| contact.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if(pass.getText().length()<8){
            JOptionPane.showMessageDialog(null, " Password character should be 8 above!");
            pass.setText("");
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist");
        }else{
            dbConnector dbc = new dbConnector();

            if(dbc.insertData("INSERT INTO insur (name, lastname, user, email, pass, contact, type, status) "
                + "VALUES ('" + fn.getText() + "','" + ln.getText() + "','" + user.getText() + "','"
                + em.getText() + "','" + pass.getText() + "','" + contact.getText() + "','"
                + ut.getSelectedItem() + "','Pending')"))
        {
            JOptionPane.showMessageDialog(null, "Inserted Successfully!");
            setVisible(false);

            userForm usf = new userForm();
            usf.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Connection Error!");
        }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseClicked
        pass.setText("");
    }//GEN-LAST:event_passMouseClicked

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void lnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lnMouseClicked
        ln.setText("");
    }//GEN-LAST:event_lnMouseClicked

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usActionPerformed

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
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contact;
    private javax.swing.JTextField em;
    private javax.swing.JTextField fn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField ln;
    private javax.swing.JTextField pass;
    private javax.swing.JComboBox<String> us;
    private javax.swing.JTextField user;
    private javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables

}
