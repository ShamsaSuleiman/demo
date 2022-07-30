package com.example.tourisim.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
@Data
@Entity
public class Touristorder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="customerid",referencedColumnName="id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name="packageid",referencedColumnName = "id")
    private Tourismpackages packageid;
    public Touristorder(Long id, Customer customer, Tourismpackages packageid) {
        this.id = id;
        this.customer = customer;
        this.packageid = packageid;
    }
    public Touristorder() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Tourismpackages getPackageid() {
        return packageid;
    }
    public void setPackageid(Tourismpackages packageid) {
        this.packageid = packageid;
    }

    
    
    


}
   