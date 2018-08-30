package com.bankaccount.service;

import com.bankaccount.model.Account;
import com.bankaccount.model.Branch;
import com.bankaccount.persistence.Bank_Persistence_I;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bank_Service_Impl implements Bank_Service_I
{
    @Autowired
    private Bank_Persistence_I bpi;

    
    @Override
    public void account_create(Account account_List) 
    {
        bpi.account_create(account_List);
    }

    @Override
    public Branch branch_create(Branch branch) 
    {
       return bpi.branch_create(branch);
    }

    @Override
    public Account account_read_one(int id) 
    {
        Account account = bpi.account_read_one(id);
        return account;
    }

    @Override
    public List account_list_read_all() 
    {
        return bpi.account_list_read_all();
    }

    @Override
    public void account_update(Account account_List) 
    {
        bpi.account_update(account_List);
    }
 
    @Override
    public void branch_update(Branch branch) 
    {
        bpi.branch_update(branch);
    }

    @Override
    public void account_removeFromBrnach(int braId, int accId)
    {
        bpi.account_removeFromBrnach(braId, accId);
    }

    @Override
    public void branch_remove(int id) 
    {
        bpi.branch_remove(id);
    }
    
    @Override
    public void account_remove(int accId)
    {
        bpi.account_remove(accId);
    }

    @Override
    public void creatAccountWithBranch(int bID, Account account_List) 
    {
        bpi.creatAccountWithBranch(bID, account_List);
    }//creatAccountWithBranch
    
    @Override
    public void creatAccountListWithBranch(int bID, List<Account> account_List)
    {
       bpi.creatAccountListWithBranch(bID, account_List);
    }//creatAccountWithBranch
   
}
