//package net.javaguides.banking.dto;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;
//
//@Data
//@AllArgsConstructor
//
//public class AccountDto {
//    private Long id;
//    private String accountHolderName;
//    private double balance;
//}




package net.javaguides.banking.dto;

public class AccountDto {
    private Long id;
    private String accountHolderName;
    private Double balance;

    // Constructors
    public AccountDto() {}

    public AccountDto(Long id, String accountHolderName, Double balance) {
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

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
