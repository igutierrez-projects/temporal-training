package temporal.training;

public class HelloWorkflowImpl implements HelloWorkflow {
    @Override
    public String greetSomeone(final String someone) {
        return String.format("Hello, %s!", someone);
    }
}
