package com.codeclan.wk13day2HW.annotatingRelationships.repositories;

import com.codeclan.wk13day2HW.annotatingRelationships.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
