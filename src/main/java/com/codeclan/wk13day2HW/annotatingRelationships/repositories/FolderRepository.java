package com.codeclan.wk13day2HW.annotatingRelationships.repositories;

import com.codeclan.wk13day2HW.annotatingRelationships.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
