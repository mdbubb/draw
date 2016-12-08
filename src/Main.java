import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by mb977 on 11/29/16.
 */
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.magenta);
        JPanel panel = new JPanel();
        panel.setBackground(Color.cyan);
        panel.setSize(300, 300);
        JLabel label = new JLabel();
        label.setSize(100, 100);
        label.setText("This is a label");
        label.setLocation(250, 200);
        JButton button = new JButton();
        button.setText("Don't click this button");
        button.addActionListener(new ActionListener() {
            int clicks=0;
            public void actionPerformed(ActionEvent e) {
                button.setText(Integer.toString(clicks));
                clicks++;
            }
        });
        button.setVisible(true);
        button.setSize(250, 180);
        button.setLocation(175, 280);
        frame.add(button);
        frame.add(label);
        frame.add(panel);


    }

}
