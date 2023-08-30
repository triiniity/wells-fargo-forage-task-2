package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

// This is a Java class called `Advisor` that represents an entity in a database. 
@Entity
public class Advisor {
    
    // The `@Id` annotation is used to specify that the `advisorId` field is the primary key of the table and should be generated automatically.
    @Id
    @GeneratedValue()
    private long advisorId;
    
    // The class has six instance variables, which are annotated with `@Column` to specify that they should be mapped to columns in the database table. 
    
    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    protected Advisor() {

    }

    // The class has two constructors, one of which is protected and the other is public. 
    // The public constructor takes five parameters, which are used to initialize the instance variables. 
    // The protected constructor is empty and is used by the JPA provider to create instances of the class. (see above)

    public Advisor(String firstName, String lastName, String address, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    // The class has getter and setter methods for each of the instance variables, which are used to access and modify the values of the fields. 
    // The getter methods return the values of the fields, while the setter methods set the values of the fields to the specified values.

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

// Overall, this class represents an entity in a database table and provides methods to access and modify the values of the fields.