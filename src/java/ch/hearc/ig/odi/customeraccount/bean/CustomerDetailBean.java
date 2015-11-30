/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.bean;

import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.service.Services;
import javax.ejb.Stateful;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author JulmyS
 */

@Stateful
@ManagedBean(name = "customerDetail")
@SessionScoped

public class CustomerDetailBean {

    @Inject
    Services services;
    
    private Customer customer;
    
    /**
     * Méthode qui enregistre en mémoire le détail des clients afin de l'afficher dans la page de détail
     * @param number
     * @return 
     */
    public String saveDetailsOfCustomer(int number){
        this.customer = this.services.getCustomer(number);
        return "detailClient";
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customers) {
        this.customer = customers;
    }
    
}
