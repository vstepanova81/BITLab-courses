package prvt.vstepanova.Module2.MiniProject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JPanel {

    private MainFrame parent;

    private JButton firstPageButton;
    private JButton secondPageButton;
    private JButton exitButton;

    public MainMenu(MainFrame parent) {

        this.parent = parent;

        setSize(300,300);
        setLayout(null);

        firstPageButton = new JButton("ADD STUDENT");
        firstPageButton.setSize(130,30);
        firstPageButton.setLocation(75,50);
        add(firstPageButton);
        firstPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getMainMenuPage().setVisible(false);
                parent.getFirstPage().setVisible(true);
                }
        });

        secondPageButton = new JButton("LIST STUDENTS");
        secondPageButton.setSize(130,30);
        secondPageButton.setLocation(75,100);
        add(secondPageButton);
        secondPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getMainMenuPage().setVisible(false);
                parent.getSecondPage().setVisible(true);

                if (actionEvent.getActionCommand().equals("LIST STUDENT")) {


                }
            }
        });


        exitButton = new JButton("EXIT");
        exitButton.setSize(130,30);
        exitButton.setLocation(75,150);
        add(exitButton);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }
}

