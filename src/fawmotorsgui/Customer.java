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
public class Customer {
    int id;
    String CNIC;
    String name;
    String address;
    String filerStatus;
    String contactNumber;

    public Customer(int id, String CNIC, String name, String address, String filerStatus, String contactNumber) {
        this.id = id;
        this.CNIC = CNIC;
        this.name = name;
        this.address = address;
        this.filerStatus = filerStatus;
        this.contactNumber = contactNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCNIC() {
        return CNIC;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFilerStatus() {
        return filerStatus;
    }

    public void setFilerStatus(String filerStatus) {
        this.filerStatus = filerStatus;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    
    
}
