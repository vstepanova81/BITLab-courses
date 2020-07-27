package prvt.vstepanova.Module2.MiniProject;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstPage extends JPanel {

    private MainFrame parent;

    private JLabel label, label1, label2;
    private JTextField textField, textField1, textField2;
    private JComboBox facultyBox;
    private JButton back;
    private JButton newstd;

    public FirstPage(MainFrame parent) {

        this.parent = parent;

        setSize(300, 300);
        setLayout(null);

        label = new JLabel("NAME:");
        label.setSize(50, 30);
        label.setLocation(50, 50);
        add(label);

        textField = new JTextField("");
        textField.setSize(150, 30);
        textField.setLocation(100, 50);
        add(textField);

        label1 = new JLabel("SURNAME:");
        label1.setSize(80, 30);
        label1.setLocation(25, 100);
        add(label1);

        textField1 = new JTextField("");
        textField1 .setSize(150, 30);
        textField1 .setLocation(100, 100);
        add(textField1 );

        label2 = new JLabel("AGE:");
        label2.setSize(50, 30);
        label2.setLocation(50, 150);
        add(label2);

        textField2  = new JTextField("");
        textField2.setSize(150, 30);
        textField2.setLocation(100, 150);
        add(textField2);

        newstd = new JButton("ADD");
        newstd.setSize(70, 30);
        newstd.setLocation(100, 200);
        add(newstd);

                newstd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (actionEvent.getActionCommand().equals("ADD")) {


                    parent.getFirstPage().setVisible(true);
                    textField.setText("");
                    textField1.setText("");
                    textField2.setText("");
                }
            }


        });


        back = new JButton("BACK");
        back.setSize(70, 30);
        back.setLocation(180, 200);
        add(back);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getFirstPage().setVisible(false);
                parent.getMainMenuPage().setVisible(true);

                textField.setText("");
                textField1.setText("");
                textField2.setText("");

            }
        });
    }
}
