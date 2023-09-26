package com.example.examprep5.repository;

import com.example.examprep5.model.entity.Classification;
import com.example.examprep5.model.entity.enums.ClassificationName;
import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClassificationRepository extends JpaRepository<Classification, String> {
    Optional<Classification> findByClassificationName(ClassificationName name);
}
