package MVC_SwingExample;

import MVC_SwingExample.controller.Controller;
import MVC_SwingExample.model.Model;
import MVC_SwingExample.view.UserView;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        Controller controller = new Controller(model);
        UserView view = new UserView(controller);
        SwingUtilities.invokeLater(() -> view.init());

    }
}