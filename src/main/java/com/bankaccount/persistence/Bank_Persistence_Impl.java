package com.bankaccount.persistence;

import com.bankaccount.model.Account;
import com.bankaccount.model.Branch;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class Bank_Persistence_Impl implements Bank_Persistence_I {

        @PersistenceContext
        private EntityManager entityManager;

    @Override
    public void account_create(Account account) {

        entityManager.persist(account);

    }//account_create()

    @Override
    public Branch branch_create(Branch branch) {
       entityManager.persist(branch);
       return branch;
    }//department_create()

    @Override
    public Account account_read_one(int id) {

            Object o = entityManager.find(Account.class, id);
            Account account = (Account) o;

        return account;
    }

    @Override
    public List account_list_read_all() 
    {
        Query qry = entityManager.createQuery("from Account m");
        List account_List = qry.getResultList();

//        Query qry = entityManager.findA("from Account_List m");
        
        return account_List;
    }

    @Override
    public void account_update(Account account)
    {

        entityManager.merge(account);
    }

    @Override
    public void branch_update(Branch branch) 
    {
        entityManager.merge(branch);
    }

    @Override
    public void account_removeFromBrnach(int braId, int accId) 
    {
        Account a = (Account) entityManager.find(Account.class, accId);
        Branch branch = (Branch) entityManager.find(Branch.class, braId);
        branch.getAcountList().remove(a);
//        entityManager.remove(a);
//        entityManager.merge(branch);
        
//        Account a = (Account) entityManager.find(Account.class, accId);
//        Branch branch = (Branch) entityManager.find(Branch.class, braId);
//        branch.getAcountList().remove(a);
//        entityManager.remove(a);
//        entityManager.merge(branch);
    }

    @Override
    public void branch_remove(int id) 
    {
        Object o = entityManager.find(Branch.class, id);
        Branch branch = (Branch) o;

        entityManager.remove(branch);

    }
    
    @Override
    public void account_remove(int accId)
    {
        entityManager.remove(entityManager.find(Account.class, accId));
    }

    @Override
    public void creatAccountWithBranch(int bID, Account account) 
    {
        entityManager.persist(account);

        Branch b = entityManager.find(Branch.class, bID);
        b.getAcountList().add(account);
        entityManager.merge(b);
        
    }//creatAccountWithBranch

    @Override
    public void creatAccountListWithBranch(int bID, List<Account> account_List)
    {
        Branch b = entityManager.find(Branch.class, bID);

        for (Iterator<Account> iterator = account_List.iterator(); iterator.hasNext();) 
        {
            Account nextAcc = iterator.next();
            entityManager.persist(nextAcc);
            b.getAcountList().add(nextAcc);
        }

        entityManager.merge(b);

    }//creatAccountWithBranch

}//class
