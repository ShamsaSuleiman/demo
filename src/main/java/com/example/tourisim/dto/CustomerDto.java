package com.example.tourisim.dto;

import lombok.Data;

@Data
public class CustomerDto {
    private String firstname;
    private String lastname;
    private String mobile_no;
    private String password;
    private String email;


    public CustomerDto(String firstname,String lastname,String mobile_no,String password,String email){
        this.firstname=firstname;
        this.lastname=lastname;
        this.mobile_no=mobile_no;
        this.password=password;
        this.email=email;
    }


    public String getFirstname() {
        return firstname;
    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public String getLastname() {
        return lastname;
    }


    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public String getMobile_no() {
        return mobile_no;
    }


    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
