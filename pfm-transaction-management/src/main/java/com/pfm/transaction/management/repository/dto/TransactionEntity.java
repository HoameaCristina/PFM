package com.pfm.transaction.management.repository.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = TransactionEntity.TRANSACTION_ENTITY)
public class TransactionEntity {

    public static final String TRANSACTION_ENTITY = "PFM_TRX";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    private double amount;
    private String description;
    private long parentId;
    private long keywordId;
    private long categoryId;

}
