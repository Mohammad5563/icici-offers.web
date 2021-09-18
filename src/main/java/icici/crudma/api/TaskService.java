package icici.crudma.api;

import io.tesler.source.services.data.WorkflowableTaskService;
import icici.model.workflow.entity.Task;
import icici.crudma.dto.TaskDTO;


public interface TaskService extends WorkflowableTaskService<TaskDTO, Task> {

}
