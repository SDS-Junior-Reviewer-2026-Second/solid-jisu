package weather;

import java.util.ArrayList;
import java.util.List;

public class Notifier {

    private final List<String> weatherToNotify = new ArrayList<>();

    public List<String> getWeatherToNotify() {
        return weatherToNotify;
    }

    public void addWeatherToNotify(String weather){
        weatherToNotify.add(weather);
    }

    public String generateWeatherAlert(String weatherDescription) {
        return "It is " + weatherDescription;
    }

    public void alert(String weatherDescription){
        if (getWeatherToNotify().contains(weatherDescription)){
            System.out.print(generateWeatherAlert(weatherDescription));
        }
    }
}
