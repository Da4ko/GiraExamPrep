package com.example.examprep5.service.Impl;

import com.example.examprep5.model.entity.Classification;
import com.example.examprep5.model.entity.enums.ClassificationName;
import com.example.examprep5.repository.ClassificationRepository;
import com.example.examprep5.service.ClassificationService;
import jdk.jfr.Category;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ClassificationServiceImpl implements ClassificationService {
    private final ClassificationRepository classificationRepository;

    public ClassificationServiceImpl(ClassificationRepository classificationRepository) {
        this.classificationRepository = classificationRepository;
    }

    @Override
    public void initClassifications() {
        if(classificationRepository.count() == 0) {
            Arrays.stream(ClassificationName.values())
                    .forEach(classificationName -> {
                        Classification classification = new Classification(classificationName,
                                "Description for " + classificationName.name());

                        classificationRepository.save(classification);
                    });
        }
    }
}
