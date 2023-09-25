package com.example.examprep5.model.entity;

import com.example.examprep5.model.entity.enums.ClassificationName;
import jakarta.persistence.*;

@Entity
@Table(name = "classifications")
public class Classification extends BaseEntity{

    private ClassificationName classificationName;
    private String description;

    public Classification() {
    }

    public Classification(ClassificationName classificationName, String description) {
        this.classificationName = classificationName;
        this.description = description;
    }

    @Enumerated(EnumType.STRING)
    public ClassificationName getClassificationName() {
        return classificationName;
    }

    public void setClassificationName(ClassificationName classificationName) {
        this.classificationName = classificationName;
    }

    @Column(name = "description", columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
