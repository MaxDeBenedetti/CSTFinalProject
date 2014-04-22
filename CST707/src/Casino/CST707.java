/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Casino;

import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * 
 */
public class CST707 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        Connector conn = new Connector();
        MenuPage mpf = new MenuPage(conn);
        mpf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mpf.setVisible(true);
    }
}
