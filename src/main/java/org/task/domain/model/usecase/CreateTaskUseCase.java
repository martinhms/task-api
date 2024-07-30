package org.task.domain.model.usecase;

import org.task.domain.model.Task;
import org.task.domain.model.repository.TaskRepository;

public class CreateTaskUseCase {
    private final TaskRepository taskRepository;

    public CreateTaskUseCase(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }
}
