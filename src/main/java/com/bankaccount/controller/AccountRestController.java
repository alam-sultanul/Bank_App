package com.bankaccount.controller;

import com.bankaccount.model.Account;
import com.bankaccount.model.Branch;
import com.bankaccount.persistence.Bank_Persistence_I;
import com.bankaccount.service.Bank_Service_I;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/**
 *
 * @author Sajib
 */
@RestController
public class AccountRestController 
{
    @Autowired
    private Bank_Service_I bank_Service_I;
    
//    @Autowired
//    private Bank_Persistence_I bank_Persistence_I;
    
    @RequestMapping(value = "/AccountCreate", method = RequestMethod.POST)
    public void accountCreate(@RequestBody Account account) 
    {
           bank_Service_I.account_create(account);
    } 
    
    @RequestMapping(value = "/AccountUpdate", method = RequestMethod.POST)
    public void accountUpdate(@RequestBody Account account)
    {
        bank_Service_I.account_update(account);
        
    }
    
    @RequestMapping(value = "/BranchCreate", method = RequestMethod.POST)
    public void branch_create(@RequestBody Branch branch) 
    {
        bank_Service_I.branch_create(branch);
        
    }
    
    @RequestMapping(value = "/AccountRead", method = RequestMethod.GET )
    public Account account_read_one(@RequestParam int id)
    {
        return bank_Service_I.account_read_one(id);
    }
    
    @RequestMapping(value = "/AccountReadAll", method = RequestMethod.GET )
    public List account_list_read_all()
    {
        return bank_Service_I.account_list_read_all();
    }
    
    @RequestMapping(value = "/BranchUpdate", method = RequestMethod.PUT)
    public void branch_update(@RequestBody Branch branch)
    {
        System.out.println("Update........!"+branch.toString());
        bank_Service_I.branch_update(branch);
    }

    @RequestMapping(value = "/account_removeFromBrnach", method = RequestMethod.DELETE)
    public void account_removeFromBrnach(@RequestParam int braId,@RequestParam int accId)
    {
        bank_Service_I.account_removeFromBrnach(braId, accId);
    }
    
    @RequestMapping(value = "/branch_remove", method = RequestMethod.DELETE)
    public void branch_remove(@RequestParam int id)
    {
        bank_Service_I.branch_remove(id);
    } 
    
    @RequestMapping(value = "/account_remove", method = RequestMethod.DELETE)
    public void account_remove(@RequestParam int accId)
    {
        bank_Service_I.account_remove(accId);
    }
    
    @RequestMapping(value = "/creatAccountWithBranch", method = RequestMethod.POST)
    public void creatAccountWithBranch(@RequestParam int bID, @RequestBody Account account)
    {
        bank_Service_I.creatAccountWithBranch(bID, account);
    }
    
    @RequestMapping(value = "/creatAccountListWithBranch", method = RequestMethod.POST)
    public String creatAccountListWithBranch(@RequestParam int bID,@RequestBody List<Account> account_List)
    {
        bank_Service_I.creatAccountListWithBranch(bID, account_List);
        return "case successfully";
    }

    
}//class
