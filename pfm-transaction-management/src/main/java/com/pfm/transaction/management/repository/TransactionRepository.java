package com.pfm.transaction.management.repository;

import com.pfm.transaction.management.repository.dto.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {
}
