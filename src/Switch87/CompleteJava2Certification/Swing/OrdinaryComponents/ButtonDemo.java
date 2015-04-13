package Switch87.CompleteJava2Certification.Swing.OrdinaryComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gp on 7/04/15.
 */
public class ButtonDemo extends JFrame{
    private JButton helloBtn, goodbyeBtn;

    public static void main(String[] args) {
        (new ButtonDemo()).setVisible(true);
    }

    ButtonDemo(){
        super("Button Demo");
        setSize(350, 250);
        Container cont = getContentPane();
        cont.setLayout(new FlowLayout());
        helloBtn = new JButton("Hello");
        goodbyeBtn = new JButton("Goodbye");
        cont.add(helloBtn);
        cont.add(goodbyeBtn);
        ButtonListener listener = new ButtonListener();
        helloBtn.addActionListener(listener);
        goodbyeBtn.addActionListener(listener);
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            if (e.getSource() == helloBtn)
                System.out.println("Hello");
            else
                System.out.println("Goodbye");
        }
    }
}
