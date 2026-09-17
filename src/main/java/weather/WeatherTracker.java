package weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherTracker {
    String currentConditions;
    List<Notifier> notifiers;

    public WeatherTracker() {
        notifiers = new ArrayList<>();
        notifiers.add(new Phone()); // 강사님의 의도와 다른 것을 알았지만 이미 너무 늦었습니다..
        notifiers.add(new Email()); // 이것도 그냥 외부에서 주입받는다고 가정해 주시면 안될까요
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        for (Notifier notifier: notifiers){
            notifier.alert(weatherDescription);
        }
    }
}