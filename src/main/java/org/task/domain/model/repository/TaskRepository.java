package org.task.domain.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.task.domain.model.TaskEntity;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity,Long> {
}
