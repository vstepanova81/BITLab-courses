package prvt.vstepanova.Module2.MiniProject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondPage extends JPanel {

    private MainFrame parent;

    private JLabel label3;
    private JTextArea area;
    private JButton back2;

        public SecondPage(MainFrame parent) {

            this.parent = parent;

            setSize(300, 300);
            setLayout(null);

            label3 = new JLabel("STUDENTS LIST:");
            label3.setSize(200, 30);
            label3.setLocation(10, 10);
            add(label3);

            area = new JTextArea();
            area.setSize(250,150);
            area.setLocation(20,40);
            add(area);


            back2 = new JButton("BACK");
            back2.setSize(100, 30);
            back2.setLocation(100, 200);
            add(back2);

            back2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    parent.getSecondPage().setVisible(false);
                    parent.getMainMenuPage().setVisible(true);
                    area.setText("");
                }
            });
        }
}