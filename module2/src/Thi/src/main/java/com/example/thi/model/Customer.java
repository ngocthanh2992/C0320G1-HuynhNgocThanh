package com.example.thi.model;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.sql.Date;

@Entity
@Table(name = "customers")
public class Customer implements Validator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer")
    private Long id;

    @Column(name = "customer_code")
    @Pattern(regexp = "^KH-[0-9]{4}$",message = "Customer Code is not valid, ex:KH-XXXX")
    private String customerCode;

    @Column(name = "type_customer")
    @NotBlank(message = "Type Customer must not blank")
    @NotNull(message = "Type Customer must not null")
    @NotEmpty(message = "Type Customer must not empty")
    private String typeCustomer;

    @Column(name = "name_customer")
    @NotBlank(message = "Name Customer must not blank")
    @NotNull(message = "Name Customer must not null")
    @NotEmpty(message = "Name Customer must not empty")
    private String nameCustomer;

    @Column(name = "gender")
    private String gender;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "phone_number")
    @Pattern(regexp = "^[0-9]{4}\\.[0-9]{3}\\.[0-9]{3}$", message = "Phone number is not valid, ex:XXXX.XXX.XXX")
    private String phoneNumber;

    @Column(name = "email")
    @Pattern(regexp = "^([a-z0-9]+\\@[a-z0-9]+(\\.[a-z0-9]+)+)$", message = "Email is not valid, ex:abc@abc.abc")
    private String email;

    @Column(name = "isDelete")
    private boolean isDelete;

    @Column(name = "address")
    @NotBlank(message = "Address must not blank")
    @NotNull(message = "Address must not null")
    @NotEmpty(message = "Address must not empty")
    private String address;

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Customer.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
    Customer customer =(Customer) target;
        ValidationUtils.rejectIfEmpty(errors,"birthday","birthday.null");
    }
}
