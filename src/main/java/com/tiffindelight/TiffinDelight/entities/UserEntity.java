package com.tiffindelight.TiffinDelight.entities;

import jakarta.persistence.*;

@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "FirstName")
    private String firstname;

    @Column(name = "LastName")
    private String lastname;

    @Column(name = "Email")
    private String email;

    @Column(name = "PhoneNumber")
    private long phonenumber;

    @Column(name = "Password")
    private String password;

    //Getters
    public Integer getId(){
        return id;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public String getEmail(){
        return email;
    }
    public long getPhonenumber(){
        return phonenumber;
    }
    public String getPassword(){
        return password;
    }
    //Setters
    public void setId(Integer id){
        this.id = id;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhonenumber(long phonenumber){
        this.phonenumber = phonenumber;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public void display(){
        System.out.println("Id : "+ id);
        System.out.println("Firstname" + firstname);
        System.out.println("Lastname" + lastname);
        System.out.println("Email : " + email);
        System.out.println("Phone Number : " + phonenumber);
    }

}
