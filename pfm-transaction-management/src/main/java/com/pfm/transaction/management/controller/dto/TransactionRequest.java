package com.pfm.transaction.management.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class TransactionRequest {
    private Date date;
    private double amount;
    private String description;
}
