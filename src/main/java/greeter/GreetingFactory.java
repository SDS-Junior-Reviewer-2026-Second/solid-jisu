package greeter;

public class GreetingFactory {
    public Greeting getGreeting(){
        return new NormalGreeting();
    }
    public Greeting getGreeting(String formality){
        switch(formality){
            case "formal":
                return new FormalGreeting();
            case "casual":
                return new CasualGreeting();
            case "intimate":
                return new IntimateGreeting();
            default:
                return new NormalGreeting();
        }
    }
}
