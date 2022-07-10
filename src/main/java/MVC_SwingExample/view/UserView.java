package MVC_SwingExample;
import javax.swing.*;
import java.awt.*;

public class UserView extends JFrame {
    private JTextArea text;
    private JButton button;
    private JLabel info;

    public void init() {
        setSize(400, 300);

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
        });

        SwingUtilities.invokeLater(() -> setVisible(true));
    }
}
