package com.pfm.transaction.management.controller;

import com.pfm.transaction.management.controller.dto.TransactionRequest;
import com.pfm.transaction.management.service.TransactionManagementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/transaction-management")
public class TransactionManagementController {
    /**
     * TODO
     *
     * This class should implement CRUD operations for transactions
     * */

    private final TransactionManagementService transactionManagementService;

    @PostMapping
    public long createTransaction(@RequestBody TransactionRequest transaction){
        return transactionManagementService.insertTransaction(transaction);
    }

}
