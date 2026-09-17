package greeter;

public class NormalGreeting implements Greeting{
    @Override
    public String getMessage(){
        return "Hello.";
    }
}
