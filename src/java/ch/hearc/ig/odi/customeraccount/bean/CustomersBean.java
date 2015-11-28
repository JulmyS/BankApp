/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.bean;

import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.service.Services;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

@ManagedBean(name = "customerData")
@SessionScoped

/**
 *
 * @author JulmyS
 */
public class CustomersBean implements Serializable{
    
    @Inject Services services;
    
    private List<Customer> customers;
    
    public CustomersBean(){
        
    }
    
    public List<Customer> getCustomers(){
        List<Customer> listCust = services.getCustomersList();
        return listCust;
    }
}
