package com.example.examprep5.model.service;

import com.example.examprep5.model.entity.Classification;
import com.example.examprep5.model.entity.User;
import com.example.examprep5.model.entity.enums.ClassificationName;
import com.example.examprep5.model.entity.enums.Progress;

import java.time.LocalDate;

public class TaskServiceModel {
    private String id;
    private String Name;
    private String Description;
    private Progress progress;
    private LocalDate dueToDate;
    private ClassificationName classificationName;
    private User user;

    public TaskServiceModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Progress getProgress() {
        return progress;
    }

    public void setProgress(Progress progress) {
        this.progress = progress;
    }

    public LocalDate getDueToDate() {
        return dueToDate;
    }

    public void setDueToDate(LocalDate dueToDate) {
        this.dueToDate = dueToDate;
    }

    public ClassificationName getClassificationName() {
        return classificationName;
    }

    public void setClassificationName(ClassificationName classificationName) {
        this.classificationName = classificationName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
