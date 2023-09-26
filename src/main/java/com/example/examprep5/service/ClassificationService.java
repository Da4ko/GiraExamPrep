package com.example.examprep5.service;

import com.example.examprep5.model.entity.Classification;
import com.example.examprep5.model.entity.enums.ClassificationName;


public interface ClassificationService {

    void initClassifications();

    Classification findByName(ClassificationName classificationName);
}
