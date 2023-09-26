package com.example.examprep5.model.binding;

import com.example.examprep5.model.entity.Classification;
import com.example.examprep5.model.entity.enums.ClassificationName;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class TaskAddBindingModel {
    private String name;
    private String description;
    private LocalDate dueToDate;
    private ClassificationName classification;

    public TaskAddBindingModel() {
    }
    @NotBlank(message = "Name cannot be empty String")
    @Size(min = 3, max = 20, message = "Name must be between 3 and 20 characters" )
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @NotBlank(message = "Description cannot be empty String")
    @Size(min = 5, message = "Description must be at least 5 characters" )
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @FutureOrPresent
    public LocalDate getDueToDate() {
        return dueToDate;
    }

    public void setDueToDate(LocalDate dueToDate) {
        this.dueToDate = dueToDate;
    }
    @NotNull(message = "You must select classification")
    public ClassificationName getClassification() {
        return classification;
    }

    public void setClassification(ClassificationName classification) {
        this.classification = classification;
    }
}
