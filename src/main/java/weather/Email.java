package weather;

import java.util.ArrayList;
import java.util.List;

public class Email extends Notifier {

    public Email() {
        super();
        addWeatherToNotify("sunny");
    }
}