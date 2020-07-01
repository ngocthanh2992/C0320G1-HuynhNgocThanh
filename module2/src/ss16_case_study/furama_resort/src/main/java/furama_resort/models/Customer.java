package furama_resort.models;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

import java.sql.Date;
import java.util.Set;

@Entity
@Table(name="customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer")
    private Long id;

    @Column(name = "type_customer")
    private String typeCustomer;

    @Column(name = "name")
    private String name;

    @Column(name = "birthday")
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    private Date birthday;

    @Column(name = "gender")
    private String gender;

    @Column(name = "id_card")
    @Pattern(regexp = "^([\\d]{9}|[\\d]{12})$",message = "Id Card is not valid")
    private String idCard;

    @Column(name = "phone_number")
    @Pattern(regexp = "^(090|091|\\+8491|\\+8490)([0-9]{7})\\b$",message = "Phone is not valid")
    private String phoneNumber;

    @Column(name = "email")
    @Pattern(regexp = "^([a-zA-Z0-9]+\\@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)+)$", message = "Email is not valid")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "isDelete")
    private boolean isDelete;

    @OneToMany(mappedBy = "customer")
    private Set<Contract> contracts;

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }
}
