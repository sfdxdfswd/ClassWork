package MVC_SwingExample.controller;
import MVC_SwingExample.model.Model;

public class Controller {

    private Model model;

    public Controller(Model model) {
        this.model = model;
    }
    public boolean checkPin(int pin) {

        return model.getPin() == pin;
    }
}
