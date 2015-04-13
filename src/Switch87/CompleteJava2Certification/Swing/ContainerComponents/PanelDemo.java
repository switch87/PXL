package Switch87.CompleteJava2Certification.Swing.ContainerComponents;

import java.awt.*;
import javax.swing.*;

/**
 * Created by gp on 6/04/15.
 */
public class PanelDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Content Pane Demo");
        f.setSize(350, 250);
        Container cont = f.getContentPane();
        cont.setLayout(new GridLayout(2,1));
        for (int i = 0; i < 2; i++) {
            JPanel pan = new JPanel();
            pan.setBackground(i == 0 ? Color.lightGray : Color.white);
            for (int j = 0; j < 3; j++) {
                pan.add(new JButton("Button"));
            }
            cont.add(pan);
        }
        f.setVisible(true);
    }
}
