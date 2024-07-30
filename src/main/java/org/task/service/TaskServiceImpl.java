package org.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.task.domain.model.TaskEntity;
import org.task.domain.model.TaskModel;
import org.task.domain.model.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<TaskModel> getAllTasks() {
        List<TaskEntity> taskEntities = taskRepository.findAll();
        return taskEntities.stream()
                .map(this::convertToModel)
                .collect(Collectors.toList());
    }

    private TaskModel convertToModel(TaskEntity entity) {
        TaskModel model = new TaskModel();
        model.setId(entity.getId());
        model.setTitle(entity.getTitle());
        model.setDescription(entity.getDescription());
        model.setCompleted(entity.isCompleted());
        return model;
    }
}


