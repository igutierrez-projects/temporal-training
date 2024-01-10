


Starting the Temporal Server:
```
temporal server start-dev
```
- The Temporal Server will be available on [localhost:7233](http://localhost:7233).
- The Temporal Web UI will be available at [http://localhost:8233](http://localhost:8233).
Changing the Web UI port:
```
temporal server start-dev --ui-port 8080
```


Starting the worker:
```
mvn exec:java -Dexec.mainClass="temporal.training.HelloWorkflowWorker"
```



Strating a workflow by command line:
```
$ temporal workflow start \
    --type HelloWorkflow \
    --task-queue greeting-tasks \
    --workflow-id my-first-workflow \
    --input '"Mason"'
```


Showing the result of a Workflow Execution:
```
temporal workflow show --workflow-id my-first-workflow
```
