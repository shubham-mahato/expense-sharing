package com.expensesharing.expensesharingapplication.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data

public class ExpenseSplit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "expense_id")
    private Expense expense;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private BigDecimal amountOwed;
}
