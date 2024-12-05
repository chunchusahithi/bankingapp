//package net.javaguides.banking.entity;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//@Entity
//@Table(name="accounts")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//public class Account {
//    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
//    private Long id;
//    @Column(name="account_holder_name")
//    private String accountHolderName;
//    private double balance;
//}



package net.javaguides.banking.entity;

import jakarta.persistence.*;
// import lombok.*;

@Entity
@Table(name = "accounts")
// @Getter
// @Setter
// @NoArgsConstructor
// @AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "account_holder_name")
    private String accountHolderName;

    private double balance;

    // Default Constructor
    public Account() {
    }

    // Parameterized Constructor
    public Account(Long id, String accountHolderName, double balance) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}



