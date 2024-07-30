package org.task.service;

import org.task.domain.model.TaskModel;

import java.util.List;

public interface TaskService {
    List<TaskModel> getAllTasks();
}
