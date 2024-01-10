package temporal.training;

import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;

@WorkflowInterface
public interface HelloWorkflow {
    @WorkflowMethod
    String greetSomeone(final String someone);
}
