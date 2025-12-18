package com.expensesharing.expensesharingapplication.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "payer_id")
    private User payer;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

}
