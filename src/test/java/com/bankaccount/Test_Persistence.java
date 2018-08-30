//package com.bankaccount;
//
//import com.bankaccount.model.Account;
//import com.bankaccount.model.Branch;
//import com.bankaccount.persistence.Bank_Persistence_I;
//import java.util.ArrayList;
//import java.util.List;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class Test_Persistence {
//
//    @Autowired
//    Bank_Persistence_I bank_Persistence_I ;
//
////    public Test_Persistence() {
////
////    }
////
//////    @Test
////    public void test_account_create()
////    {
////       Account account= new Account("mahin", "Kawla,Dhaka-1230", 60000);
////        bank_Persistence_I.account_create(account);
////    }
//    
////
////    @Test
////    public void test_creatAccountWithBranch() {
////        Account account = new Account("pasta", "rampura,Dhaka-1230", 67000);
////        bank_Persistence_I.creatAccountWithBranch(22,account);
////    }
//   @Test
//    public void test_account_removeFromBranh() 
//    {
//        bank_Persistence_I.account_removeFromBrnach(7,11);
//    }
//    
//    
////    @Test
//    public void test_creatAccountWithzManyBranch() {
//        Branch branch = new Branch("rampura");
//       int bID = bank_Persistence_I.branch_create(branch).getaId();
////     s  int bID = 2;
//        
//        Account account1 = new Account("salam", "Kawla,Dhaka-230", 100);
//        Account account2 = new Account("rafiq", "Kawla,Dhaka-1230", 200);
//        Account account3 = new Account("jabbar", "Kawla,Dhaka-130", 300);
//        Account account4 = new Account("ami", "Kawla,Dhaka-10", 6060);
//        Account account5 = new Account("tumi", "Kawla,Dhaka-10", 060);
//        
//        List<Account> listAccount = new ArrayList();
//        listAccount.add(account1);
//        listAccount.add(account2);
//        listAccount.add(account3);
//        listAccount.add(account4);
//        listAccount.add(account5);
//        
//        bank_Persistence_I.creatAccountListWithBranch(bID,listAccount);
//
//    }// test_account_create()
//
////   @Test
//    public void test_branch_create() 
//    {
//        Branch branch = new Branch("rampura");
//        bank_Persistence_I.branch_create(branch);
//    }
////
//////    @Test
////    public void test_read_one() 
////    {
////        System.out.println(bank_Persistence_I.account_read_one(15).toString());
////    }
//////    @Test
////    public void test_account_list_read_all() 
////    {
////        System.out.println(bank_Persistence_I.account_list_read_all().toString());
////    }
//
////    
//////    @Test
////    public void test_account_remove() 
////    {
//            
////        bank_Persistence_I.account_remove(5);
////
////    }
////
//////    @Test
////    public void test_branch_remove() 
////    {
////        bank_Persistence_I.branch_remove(5);
////
////    }
////    
////    @Test
////    public void test_branch_update()
////    {
////        Branch branch = new Branch(20,"ami lolo lo99999999999lo");
////        bank_Persistence_I.branch_update(branch);
////    }
////
//}//class
