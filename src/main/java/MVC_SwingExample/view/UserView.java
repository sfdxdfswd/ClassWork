package MVC_SwingExample.view;
import MVC_SwingExample.controller.Controller;
import javax.swing.*;
import java.awt.*;

public class UserView extends JFrame {

    private JTextArea text;
    private JButton button;
    private JLabel info;
    private final Controller controller;

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
            String textPin = this.text.getText();
            text.setText("");
            //TODO перенести в контроллер
            try {
                pin = Integer.parseInt(textPin);
                info.setText("Got it: " + pin + " Waiting...");

                Thread thread = new Thread(() -> {
                    button.setEnabled(false);
                    boolean result;
                    result = controller.checkPin(pin);
                    String resultMessage;
                    if (result) {
                        resultMessage = "Right";
                    } else {
                        resultMessage = "Wrong, try again";
                    }

                    info.setText(resultMessage);
                    button.setEnabled(true);
                });
                thread.start();
            } catch (NumberFormatException e1) {
                info.setText("Only numbers allowed.");
            }
        });

        SwingUtilities.invokeLater(() -> setVisible(true));

    }
}
