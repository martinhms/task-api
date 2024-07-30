package org.task.domain.model.usecase;

import org.task.domain.model.TaskEntity;
import org.task.domain.model.repository.TaskRepository;

public class CreateTaskUseCase {
    private final TaskRepository taskRepository;

    public CreateTaskUseCase(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public TaskEntity createTask(TaskEntity task) {
        return taskRepository.save(task);
    }
}
