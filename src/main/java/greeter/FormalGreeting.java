package greeter;

public class FormalGreeting implements Greeting {
    @Override
    public String getMessage() {
        return "Good evening, sir.";
    }
}
