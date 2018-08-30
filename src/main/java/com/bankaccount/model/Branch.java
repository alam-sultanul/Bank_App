package com.bankaccount.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Branch
{
    @Id 
    @GeneratedValue( strategy=GenerationType.AUTO )
    private int bId;
    
    private String bName;
    
    @OneToMany( cascade=CascadeType.REMOVE)
    private List<Account> acountList;

    public Branch() {
    }

    public Branch(int aId, String bName) {
        this.bId = aId;
        this.bName = bName;
    }
    
       public Branch(String bName, List acountList) {
       
        this.bName = bName;
        this.acountList = acountList;
    }
    
    public Branch(int aId, String bName, List acountList) {
        this.bId = aId;
        this.bName = bName;
        this.acountList = acountList;
    }
    
    
    
    public Branch(String bName) 
    {
        this.bName = bName;
    }

    public int getaId() 
    {
        return bId;
    }

    public void setaId(int aId) 
    {
        this.bId = aId;
    }

    public String getbName() 
    {
        return bName;
    }

    public void setbName(String bName) 
    {
        this.bName = bName;
    }

    public List getAcountList() 
    {
        return acountList;
    }

    public void setAcountList(List acountList) 
    {
        this.acountList = acountList;
    }

    @Override
    public String toString() 
    {
        return "Branch{" + "aId=" + bId + 
                       ", bName=" + bName + 
                       ", acountList=" + acountList + 
                       '}';
    }
    
    
}
