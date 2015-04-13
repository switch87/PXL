package Switch87.CompleteJava2Certification.Swing.OrdinaryComponents;

import java.awt.*;
import javax.swing.*;
/**
 * Created by gp on 7/04/15.
 */
public class LabelDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Label Demo");
        f.setSize(350, 250);
        Container cont = f.getContentPane();
        cont.setLayout(new FlowLayout());
        cont.add(new Label("This is a JLabel"));
        f.setVisible(true);
    }
}
