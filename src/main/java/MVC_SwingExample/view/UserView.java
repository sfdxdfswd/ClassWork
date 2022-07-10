package MVC_SwingExample.view;
import MVC_SwingExample.controller.Controller;
import javax.swing.*;
import java.awt.*;

public class UserView extends JFrame {

    private JTextArea text;
    private JButton button;
    private JLabel info;
    private Controller controller;

    public UserView(Controller controller) {
        this.controller = controller;
    }
    public void init() {

        setSize(600, 400);

        text = new JTextArea();
        button = new JButton("click");
        info = new JLabel("info");

        add(text, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
        add(info, BorderLayout.NORTH);

        button.addActionListener(e -> {
            int pin;
            String texPin = this.text.getText();
            pin = Integer.parseInt(texPin);
            info.setText("Arrrrgghhh!!!");
            controller.checkPin(pin);
        });

        SwingUtilities.invokeLater(() -> setVisible(true));

    }
}
