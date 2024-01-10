package temporal.training;

import io.temporal.api.workflowservice.v1.WorkflowServiceGrpc;
import io.temporal.client.WorkflowClient;
import io.temporal.serviceclient.WorkflowServiceStubs;
import io.temporal.worker.Worker;
import io.temporal.worker.WorkerFactory;

/**
 * Hello world!
 *
 */
public class HelloWorkflowWorker
{
    public static void main( String[] args )
    {
        //It represents a gRPC connetion to the Temporal Cluster.
        final WorkflowServiceStubs service = WorkflowServiceStubs.newLocalServiceStubs();
        //It creates a Temporal client, which the worker will use to communicate with the Temporal Cluster.
        final WorkflowClient client = WorkflowClient.newInstance(service);
        //It creates a worker factory, which will be used to create a worker.
        final WorkerFactory factory = WorkerFactory.newInstance(client);
        //When creating the worker, call the factory's newWorker, specifying the task queue name on the temporal cluster.
        final Worker worker = factory.newWorker("greeting-tasks");

        // Specify which Workflow implementations this Worker will support
        worker.registerWorkflowImplementationTypes(HelloWorkflowImpl.class);

        // Begin running the Worker
        factory.start();
    }
}
