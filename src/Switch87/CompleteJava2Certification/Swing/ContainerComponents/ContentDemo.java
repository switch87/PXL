package Switch87.CompleteJava2Certification.Swing.ContainerComponents;

import java.awt.*;
import javax.swing.*;
/**
 * Created by gp on 6/04/15.
 */
public class ContentDemo {
    public static void main(String[] args){
        JFrame f = new JFrame("Content Pane Demo");
        f.setSize(350, 250);
        Container cont = f.getContentPane();
        cont.setLayout(new FlowLayout());
        for (int i = 1; i <=3 ; i++) {
            cont.add(new JButton("Button #"+i));
        }
        f.setVisible(true);
    }
}
