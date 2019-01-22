package com.codeclan.wk13day2HW.annotatingRelationships.repositories;

import com.codeclan.wk13day2HW.annotatingRelationships.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
