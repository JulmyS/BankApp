/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.bean;

import ch.hearc.ig.odi.customeraccount.service.Services;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author JulmyS
 */
@ManagedBean(name = "accountCreate")
@SessionScoped

public class AccountCreateBean {

    private String number;
    private String name;
    private double balance;
    private double rate;
    
    @Inject
    Services services;

    public AccountCreateBean() {
    }
    
    /**
     * Méthode qui ajoute un nouveau compte à l'utilisateur passé en paramètre.
     * 
     * @param customerNbr
     * @return la page qui devra être redirigé 
     */
    public String saveAcc(int customerNbr){
        services.saveAccount(number, name, balance, rate, services.getCustomer(customerNbr));
        return "createAccountOk";
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    
}
