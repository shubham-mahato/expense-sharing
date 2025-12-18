package com.expensesharing.expensesharingapplication.repository;

import com.expensesharing.expensesharingapplication.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
