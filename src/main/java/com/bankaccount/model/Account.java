package com.bankaccount.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "account")
public class Account
{
   @Id
   @GeneratedValue( strategy= GenerationType.AUTO ) 	
    private int aId;
   
    private String aName;
    private String aAddress;
    private float aAmount;

    public Account(int id)
    {
        this.aId = id;
    }
    
    public Account(String aName, String aAddress, float aAmount) 
    {
        this.aName = aName;
        this.aAddress = aAddress;
        this.aAmount = aAmount;
    }
    
    public Account(int bId, String aName, String aAddress, float aAmount) 
    {
        super( );
        this.aId = bId;
        this.aName = aName;
        this.aAddress = aAddress;
        this.aAmount = aAmount;
    }
     
    public Account() 
    {
        super( );
    }

    public int getbId() 
    {
        return aId;
    }

    public void setbId(int bId)
    {
        this.aId = bId;
    }

    public String getaName() 
    {
        return aName;
    }

    public void setaName(String aName)
    {
        this.aName = aName;
    }

    public String getaAddress() 
    {
        return aAddress;
    }

    public void setaAddress(String aAddress) 
    {
        this.aAddress = aAddress;
    }

    public float getaAmount() 
    {
        return aAmount;
    }

    public void setaAmount(float aAmount)
    {
        this.aAmount = aAmount;
    }

    @Override
    public String toString() 
    {
        return "Account_List{" + "bId=" + aId +
                             ", aName=" + aName + 
                             ", aAddress=" + aAddress + 
                             ", aAmount=" + aAmount + 
                           '}';
    }
    
    
    
}
