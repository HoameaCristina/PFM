package com.pfm.transaction.management.service;

import com.pfm.transaction.management.controller.dto.TransactionRequest;
import com.pfm.transaction.management.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TransactionManagementService {

    private final TransactionRepository transactionRepository;

    public long insertTransaction(TransactionRequest transaction) {
        /**
         * TODO:
         * - logic for keyword identification
         * - logic for category identification
         * */
        return 1L;
    }
}
