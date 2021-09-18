package icici.config;

import io.tesler.engine.workflow.WorkflowSettings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import icici.model.workflow.entity.Task;
import icici.crudma.dto.TaskDTO;

@Configuration
public class WorkflowConfig {

	@Bean
	public WorkflowSettings workflowSettings() {
		return WorkflowSettings.builder(Task.class, TaskDTO.class).build();
	}

}
