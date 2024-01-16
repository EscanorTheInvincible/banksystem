package com.bankofireland.banksystem.model;

public class Customer {

    private int customer_id;
    private String customer_name;
    private String address;
    private String password;

    public Customer(int customer_id, String customer_name, String address, String password) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.address = address;
        this.password = password;
    }
    
    public int getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
    public String getCustomer_name() {
        return customer_name;
    }
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "customer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", address=" + address
                + ", password=" + password + "]";
    }
    

}