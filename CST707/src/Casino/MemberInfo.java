/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Casino;

/**
 *
 * @author hillman
 */
public class MemberInfo extends javax.swing.JFrame {

    /**
     * Creates new form MemberInfo
     */
    public MemberInfo() {
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

        FirstNameLabel = new javax.swing.JTextField();
        FirstNameField = new javax.swing.JTextField();
        LastNameLabel = new javax.swing.JTextField();
        LastNameField = new javax.swing.JTextField();
        PhoneLabel = new javax.swing.JTextField();
        PhoneField = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        StreetLabel = new javax.swing.JTextField();
        StreetNameField = new javax.swing.JTextField();
        CityLabel = new javax.swing.JTextField();
        CityField = new javax.swing.JTextField();
        StateLabel = new javax.swing.JTextField();
        StateField = new javax.swing.JTextField();
        ZipCodeLabel = new javax.swing.JTextField();
        ZipCodeField = new javax.swing.JTextField();
        CountryField = new javax.swing.JTextField();
        CountryLabel = new javax.swing.JTextField();
        DateOfBirthLabel = new javax.swing.JTextField();
        MonthInput = new javax.swing.JTextField();
        DayInput = new javax.swing.JTextField();
        YearInput = new javax.swing.JTextField();
        MemberIDField = new javax.swing.JTextField();
        MemberIDButton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(425, 475));
        getContentPane().setLayout(null);

        FirstNameLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        FirstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        FirstNameLabel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        FirstNameLabel.setText("First Name");
        FirstNameLabel.setBorder(null);
        FirstNameLabel.setOpaque(false);
        FirstNameLabel.setPreferredSize(new java.awt.Dimension(61, 215));
        getContentPane().add(FirstNameLabel);
        FirstNameLabel.setBounds(130, 30, 70, 20);

        FirstNameField.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        FirstNameField.setForeground(new java.awt.Color(153, 153, 153));
        FirstNameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        FirstNameField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FirstNameField.setOpaque(false);
        getContentPane().add(FirstNameField);
        FirstNameField.setBounds(200, 30, 120, 20);

        LastNameLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        LastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        LastNameLabel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        LastNameLabel.setText("Last Name");
        LastNameLabel.setBorder(null);
        LastNameLabel.setOpaque(false);
        LastNameLabel.setPreferredSize(new java.awt.Dimension(120, 20));
        getContentPane().add(LastNameLabel);
        LastNameLabel.setBounds(130, 50, 70, 20);

        LastNameField.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        LastNameField.setForeground(new java.awt.Color(153, 153, 153));
        LastNameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        LastNameField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LastNameField.setOpaque(false);
        getContentPane().add(LastNameField);
        LastNameField.setBounds(200, 50, 120, 20);

        PhoneLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        PhoneLabel.setForeground(new java.awt.Color(255, 255, 255));
        PhoneLabel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        PhoneLabel.setText("Phone ");
        PhoneLabel.setBorder(null);
        PhoneLabel.setOpaque(false);
        getContentPane().add(PhoneLabel);
        PhoneLabel.setBounds(140, 70, 60, 20);

        PhoneField.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        PhoneField.setForeground(new java.awt.Color(153, 153, 153));
        PhoneField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        PhoneField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PhoneField.setOpaque(false);
        getContentPane().add(PhoneField);
        PhoneField.setBounds(200, 70, 120, 20);

        EmailLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        EmailLabel.setText("Email ");
        EmailLabel.setBorder(null);
        EmailLabel.setOpaque(false);
        getContentPane().add(EmailLabel);
        EmailLabel.setBounds(150, 90, 50, 15);

        EmailField.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        EmailField.setForeground(new java.awt.Color(153, 153, 153));
        EmailField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        EmailField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EmailField.setOpaque(false);
        getContentPane().add(EmailField);
        EmailField.setBounds(200, 90, 120, 20);

        StreetLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        StreetLabel.setForeground(new java.awt.Color(255, 255, 255));
        StreetLabel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        StreetLabel.setText("Street");
        StreetLabel.setBorder(null);
        StreetLabel.setOpaque(false);
        StreetLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StreetLabelActionPerformed(evt);
            }
        });
        getContentPane().add(StreetLabel);
        StreetLabel.setBounds(150, 110, 50, 20);

        StreetNameField.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        StreetNameField.setForeground(new java.awt.Color(153, 153, 153));
        StreetNameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        StreetNameField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        StreetNameField.setOpaque(false);
        getContentPane().add(StreetNameField);
        StreetNameField.setBounds(200, 110, 120, 20);

        CityLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        CityLabel.setForeground(new java.awt.Color(255, 255, 255));
        CityLabel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        CityLabel.setText("City");
        CityLabel.setBorder(null);
        CityLabel.setOpaque(false);
        CityLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityLabelActionPerformed(evt);
            }
        });
        getContentPane().add(CityLabel);
        CityLabel.setBounds(160, 130, 40, 15);

        CityField.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        CityField.setForeground(new java.awt.Color(153, 153, 153));
        CityField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CityField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CityField.setOpaque(false);
        getContentPane().add(CityField);
        CityField.setBounds(200, 130, 120, 20);

        StateLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        StateLabel.setForeground(new java.awt.Color(255, 255, 255));
        StateLabel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        StateLabel.setText("State");
        StateLabel.setBorder(null);
        StateLabel.setOpaque(false);
        StateLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StateLabelActionPerformed(evt);
            }
        });
        getContentPane().add(StateLabel);
        StateLabel.setBounds(150, 150, 50, 20);

        StateField.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        StateField.setForeground(new java.awt.Color(153, 153, 153));
        StateField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        StateField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        StateField.setOpaque(false);
        getContentPane().add(StateField);
        StateField.setBounds(200, 150, 120, 20);

        ZipCodeLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        ZipCodeLabel.setForeground(new java.awt.Color(255, 255, 255));
        ZipCodeLabel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ZipCodeLabel.setText("Zip Code");
        ZipCodeLabel.setBorder(null);
        ZipCodeLabel.setOpaque(false);
        getContentPane().add(ZipCodeLabel);
        ZipCodeLabel.setBounds(140, 170, 60, 20);

        ZipCodeField.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        ZipCodeField.setForeground(new java.awt.Color(153, 153, 153));
        ZipCodeField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ZipCodeField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ZipCodeField.setOpaque(false);
        getContentPane().add(ZipCodeField);
        ZipCodeField.setBounds(200, 170, 120, 20);

        CountryField.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        CountryField.setForeground(new java.awt.Color(153, 153, 153));
        CountryField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CountryField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CountryField.setOpaque(false);
        getContentPane().add(CountryField);
        CountryField.setBounds(200, 190, 120, 20);

        CountryLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        CountryLabel.setForeground(new java.awt.Color(255, 255, 255));
        CountryLabel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        CountryLabel.setText("Country");
        CountryLabel.setBorder(null);
        CountryLabel.setOpaque(false);
        getContentPane().add(CountryLabel);
        CountryLabel.setBounds(140, 190, 60, 20);

        DateOfBirthLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        DateOfBirthLabel.setForeground(new java.awt.Color(255, 255, 255));
        DateOfBirthLabel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        DateOfBirthLabel.setText("Date Of Birth");
        DateOfBirthLabel.setBorder(null);
        DateOfBirthLabel.setOpaque(false);
        getContentPane().add(DateOfBirthLabel);
        DateOfBirthLabel.setBounds(120, 210, 80, 20);

        MonthInput.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        MonthInput.setForeground(new java.awt.Color(255, 255, 255));
        MonthInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MonthInput.setText("MM");
        MonthInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MonthInput.setOpaque(false);
        getContentPane().add(MonthInput);
        MonthInput.setBounds(200, 210, 50, 20);

        DayInput.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        DayInput.setForeground(new java.awt.Color(255, 255, 255));
        DayInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DayInput.setText("DD");
        DayInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        DayInput.setOpaque(false);
        getContentPane().add(DayInput);
        DayInput.setBounds(250, 210, 50, 20);

        YearInput.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        YearInput.setForeground(new java.awt.Color(255, 255, 255));
        YearInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        YearInput.setText("YYYY");
        YearInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        YearInput.setOpaque(false);
        getContentPane().add(YearInput);
        YearInput.setBounds(300, 210, 50, 20);

        MemberIDField.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        MemberIDField.setForeground(new java.awt.Color(153, 153, 153));
        MemberIDField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        MemberIDField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MemberIDField.setOpaque(false);
        getContentPane().add(MemberIDField);
        MemberIDField.setBounds(230, 310, 160, 20);

        MemberIDButton.setBackground(new java.awt.Color(0, 0, 0));
        MemberIDButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MemberIDButton.setText("Get New Member ID");
        getContentPane().add(MemberIDButton);
        MemberIDButton.setBounds(230, 280, 160, 23);

        Background.setForeground(new java.awt.Color(204, 204, 204));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Casino/cards black edited.jpg"))); // NOI18N
        Background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Background);
        Background.setBounds(0, 0, 410, 452);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StreetLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StreetLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StreetLabelActionPerformed

    private void CityLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityLabelActionPerformed

    private void StateLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StateLabelActionPerformed

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
            java.util.logging.Logger.getLogger(MemberInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberInfo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JTextField CityField;
    private javax.swing.JTextField CityLabel;
    private javax.swing.JTextField CountryField;
    private javax.swing.JTextField CountryLabel;
    private javax.swing.JTextField DateOfBirthLabel;
    private javax.swing.JTextField DayInput;
    private javax.swing.JTextField EmailField;
    private javax.swing.JTextField EmailLabel;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JTextField FirstNameLabel;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JTextField LastNameLabel;
    private javax.swing.JButton MemberIDButton;
    private javax.swing.JTextField MemberIDField;
    private javax.swing.JTextField MonthInput;
    private javax.swing.JTextField PhoneField;
    private javax.swing.JTextField PhoneLabel;
    private javax.swing.JTextField StateField;
    private javax.swing.JTextField StateLabel;
    private javax.swing.JTextField StreetLabel;
    private javax.swing.JTextField StreetNameField;
    private javax.swing.JTextField YearInput;
    private javax.swing.JTextField ZipCodeField;
    private javax.swing.JTextField ZipCodeLabel;
    // End of variables declaration//GEN-END:variables
}
