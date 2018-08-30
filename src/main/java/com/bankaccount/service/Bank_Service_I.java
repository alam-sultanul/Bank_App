package com.bankaccount.service;

import com.bankaccount.model.Account;
import com.bankaccount.model.Branch;
import java.util.List;

public interface Bank_Service_I 
{
    public void account_create(Account account_List);
    public Branch branch_create(Branch branch);
    public Account account_read_one(int id);
    public List account_list_read_all();
    public void account_update(Account account_List);
    public void branch_update(Branch branch);
    public void account_removeFromBrnach(int braId,int accId);
    public void branch_remove(int id);
    public void account_remove(int accId);
    public void creatAccountWithBranch(int bID, Account account_List);
    public void creatAccountListWithBranch(int bID, List<Account> account_List);
}
