package com.example.examprep5.init;

import com.example.examprep5.service.ClassificationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataBaseInitializer implements CommandLineRunner {
    private final ClassificationService classificationService;

    public DataBaseInitializer(ClassificationService classificationService) {
        this.classificationService = classificationService;
    }

    @Override
    public void run(String... args) throws Exception {
        classificationService.initClassifications();
    }
}
