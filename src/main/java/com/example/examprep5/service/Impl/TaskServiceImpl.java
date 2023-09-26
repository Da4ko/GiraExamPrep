package com.example.examprep5.service.Impl;

import com.example.examprep5.model.entity.Task;
import com.example.examprep5.model.entity.enums.Progress;
import com.example.examprep5.model.service.TaskServiceModel;
import com.example.examprep5.repository.TaskRepository;
import com.example.examprep5.service.ClassificationService;
import com.example.examprep5.service.TaskService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    private final ClassificationService classificationService;
    private final TaskRepository taskRepository;
    private final ModelMapper modelMapper;

    public TaskServiceImpl(ClassificationService classificationService, TaskRepository taskRepository, ModelMapper modelMapper) {
        this.classificationService = classificationService;
        this.taskRepository = taskRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void add(TaskServiceModel taskServiceModel) {
        Task task = modelMapper.map(taskServiceModel, Task.class);
        task.setClassification(classificationService.findByName(taskServiceModel.getClassificationName()));
        task.setProgress(Progress.OPEN);
        taskRepository.save(task);
    }
}
