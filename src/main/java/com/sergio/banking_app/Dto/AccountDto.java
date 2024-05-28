package com.sergio.banking_app.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AccountDto {

    private Long id;
    private String accountHolderName;
    private double balance;

}
