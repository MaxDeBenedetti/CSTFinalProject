/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Casino;

/**
 * A text area that displays the gaming devices at a given casino
 * 
 * The Member name, Casino, and Member Level are prefilled from the Menu page.
 */
public class GamingDevice extends javax.swing.JFrame {

    /**
     */
    public GamingDevice() {
        initComponents();
        //Count the number of gaming devices the casino has grouped by type
        //Select distinct DeviceTypeID, count(*) from gamingdevices where CasinoID = CasinoID group by DeviceTypeID
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InfoLabel = new javax.swing.JLabel();
        textArea2 = new java.awt.TextArea();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("GamingDevice"); // NOI18N
        setPreferredSize(new java.awt.Dimension(395, 420));
        setResizable(false);
        getContentPane().setLayout(null);

        InfoLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        InfoLabel.setText("The gaming devices available at your destination casino are:");
        getContentPane().add(InfoLabel);
        InfoLabel.setBounds(10, 20, 370, 40);

        textArea2.setBackground(new java.awt.Color(153, 153, 255));
        textArea2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textArea2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(textArea2);
        textArea2.setBounds(20, 60, 350, 100);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Casino/gambling-dice.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 390, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamingDevice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GamingDevice().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel InfoLabel;
    private java.awt.TextArea textArea2;
    // End of variables declaration//GEN-END:variables
}
