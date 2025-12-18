package com.expensesharing.expensesharingapplication.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "expense_groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
}
