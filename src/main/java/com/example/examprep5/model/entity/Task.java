package com.example.examprep5.model.entity;

import com.example.examprep5.model.entity.enums.Progress;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tasks")
public class Task extends BaseEntity{
      private String Name;
      private String Description;
      private Progress progress;
      private LocalDate dueToDate;
      private Classification classification;
      private User user;

    @Column(name = "name", nullable = false)
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    @Column(name = "description")
    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
    @Column(name = "progress", nullable = false)
    @Enumerated(EnumType.STRING)
    public Progress getProgress() {
        return progress;
    }

    public void setProgress(Progress progress) {
        this.progress = progress;
    }
    @Column(name = "due-to-date")
    public LocalDate getDueToDate() {
        return dueToDate;
    }

    public void setDueToDate(LocalDate dueToDate) {
        this.dueToDate = dueToDate;
    }
    @ManyToOne
    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }
    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
