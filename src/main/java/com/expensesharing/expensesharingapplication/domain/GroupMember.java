package com.expensesharing.expensesharingapplication.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class GroupMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;
}
