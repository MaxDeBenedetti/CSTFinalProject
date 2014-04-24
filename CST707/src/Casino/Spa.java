/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Casino;

import java.awt.Color;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *The user can schedule date and time the Member would like to go to the spa.  
 * Several treatments can be selected simultaneously.
 * 
 * The Member name, Casino, and Member Level are prefilled from the Menu page.
 */
public class Spa extends javax.swing.JFrame {

    Connector conn;
    Integer memID;
    
    public Spa(Connector con, int memberID){
        conn = con;
        memID = memberID;
        initComponents();
    }
    /**
     */
    public Spa() {
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

        MonthInput = new javax.swing.JTextField();
        DayInput = new javax.swing.JTextField();
        YearInput = new javax.swing.JTextField();
        DateOfServiceField = new javax.swing.JLabel();
        TreatmentLabel = new javax.swing.JLabel();
        Facial = new javax.swing.JCheckBox();
        Haircut = new javax.swing.JCheckBox();
        Massage = new javax.swing.JCheckBox();
        Pedicure = new javax.swing.JCheckBox();
        ScheduleSession = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Spa"); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 250));
        setResizable(false);
        getContentPane().setLayout(null);

        MonthInput.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MonthInput.setForeground(new java.awt.Color(0, 0, 0));
        MonthInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MonthInput.setText("MM");
        MonthInput.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MonthInput.setOpaque(false);
        MonthInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthInputActionPerformed(evt);
            }
        });
        getContentPane().add(MonthInput);
        MonthInput.setBounds(170, 10, 40, 20);

        DayInput.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DayInput.setForeground(new java.awt.Color(0, 0, 0));
        DayInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DayInput.setText("DD");
        DayInput.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DayInput.setOpaque(false);
        DayInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DayInputActionPerformed(evt);
            }
        });
        getContentPane().add(DayInput);
        DayInput.setBounds(210, 10, 40, 20);

        YearInput.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        YearInput.setForeground(new java.awt.Color(0, 0, 0));
        YearInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        YearInput.setText("YYYY");
        YearInput.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        YearInput.setOpaque(false);
        YearInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearInputActionPerformed(evt);
            }
        });
        getContentPane().add(YearInput);
        YearInput.setBounds(250, 10, 40, 20);

        DateOfServiceField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DateOfServiceField.setText("Date Of Service");
        getContentPane().add(DateOfServiceField);
        DateOfServiceField.setBounds(70, 10, 100, 20);

        TreatmentLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TreatmentLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TreatmentLabel.setText("Treatment");
        getContentPane().add(TreatmentLabel);
        TreatmentLabel.setBounds(20, 50, 70, 20);

        Facial.setBackground(new java.awt.Color(0, 153, 0));
        Facial.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Facial.setText("Facial");
        Facial.setOpaque(false);
        getContentPane().add(Facial);
        Facial.setBounds(50, 70, 90, 25);

        Haircut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Haircut.setText("Haircut");
        Haircut.setOpaque(false);
        getContentPane().add(Haircut);
        Haircut.setBounds(70, 90, 100, 25);

        Massage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Massage.setText("Massage");
        Massage.setOpaque(false);
        getContentPane().add(Massage);
        Massage.setBounds(90, 110, 110, 25);

        Pedicure.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Pedicure.setText("Pedicure");
        Pedicure.setOpaque(false);
        getContentPane().add(Pedicure);
        Pedicure.setBounds(110, 130, 110, 25);

        ScheduleSession.setBackground(new java.awt.Color(0, 0, 0));
        ScheduleSession.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ScheduleSession.setForeground(new java.awt.Color(0, 0, 0));
        ScheduleSession.setText("Schedule Session");
        ScheduleSession.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ScheduleSession.setOpaque(false);
        ScheduleSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScheduleSessionActionPerformed(evt);
            }
        });
        getContentPane().add(ScheduleSession);
        ScheduleSession.setBounds(40, 190, 150, 30);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Casino/spa4resized.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 400, 230);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void YearInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YearInputActionPerformed

    private void DayInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DayInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DayInputActionPerformed

    private void MonthInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MonthInputActionPerformed

    private void ScheduleSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScheduleSessionActionPerformed
        // TODO add your handling code here:
        if(memID != null){
            int day, month, year;
            Boolean facial, haircut, massage,pedicure;

            try{
                day = Integer.parseInt(DayInput.getText());
                month = Integer.parseInt(MonthInput.getText());
                year = Integer.parseInt(YearInput.getText());


                Date date = new Date(year, month, day);

                String query = "insert into SPASERVICES (MEMBERID,DATEOFSERVICE,SERVICES)"
                        + "values ("+memID+", "+date+", ";
                if(Facial.isSelected()){
                    query += "'Facial' ";
                }
                if(Haircut.isSelected()){
                    query += "'Haircut' ";
                }
                if(Massage.isSelected()){
                    query += "'Massage' ";
                }
                if(Pedicure.isSelected()){
                    query += "'Pedicure' ";
                }
                conn.execUpdate(query);
            }
            catch(java.lang.NumberFormatException nfe){

            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_ScheduleSessionActionPerformed
   {
      setBackground (Color.cyan);
      setPreferredSize (new Dimension(500,500));
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
            java.util.logging.Logger.getLogger(Spa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Spa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Spa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Spa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Spa().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel DateOfServiceField;
    private javax.swing.JTextField DayInput;
    private javax.swing.JCheckBox Facial;
    private javax.swing.JCheckBox Haircut;
    private javax.swing.JCheckBox Massage;
    private javax.swing.JTextField MonthInput;
    private javax.swing.JCheckBox Pedicure;
    private javax.swing.JButton ScheduleSession;
    private javax.swing.JLabel TreatmentLabel;
    private javax.swing.JTextField YearInput;
    // End of variables declaration//GEN-END:variables
}
