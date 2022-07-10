package MVC_SwingExample.model;

import java.util.concurrent.TimeUnit;

public class Model {

    private int pin = 1234;

    public int getPin() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
