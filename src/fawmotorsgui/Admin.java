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
public class Admin extends User{
    
    String passcode; 

    public Admin(String passcode, String username, String password, String status) {
        super(username, password, status);
        this.passcode = passcode;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    
    public Admin(String username, String password, String status) {
        super(username, password, status);
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    /**
     *
     * @return
     */
    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
