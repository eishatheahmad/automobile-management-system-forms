/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fawmotorsgui;

/**
 *
 * @author Eisha Ahmad
 */
public class FawMotorsGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        dbConnection db= new dbConnection();
        LoginPage lp = new LoginPage();
        lp.setVisible(true);
        
    }
    
}
