/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.bean;

import ch.hearc.ig.odi.customeraccount.business.Account;
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
@ManagedBean(name = "accountDetail")
@SessionScoped

public class AccountDetailBean {
    
    @Inject
    Services services;
    
    private Account account;
    
    public String saveDetailsOfAccount(String number){
        this.account = this.services.getAccount(number);
        return "accountDetail";
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
}
