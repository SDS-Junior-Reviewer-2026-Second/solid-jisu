package greeter;

public class Greeter {

    private Greeting greeting;
    private final GreetingFactory greetingFactory;

    public Greeter(){
        greetingFactory = new GreetingFactory();
        this.greeting = greetingFactory.getGreeting();
    }

    public String greet() {
        return greeting.getMessage();
    }

    public void setFormality(String formality) {
        this.greeting = greetingFactory.getGreeting(formality);
    }
}