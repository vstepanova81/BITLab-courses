package prvt.vstepanova.Module2.MiniProject;
import javax.swing.*;

public class MainFrame extends JFrame {

    private MainMenu mainMenuPage; // Меню с кнопками добавления студентов, ввода списка и выхода
    private FirstPage firstPage; //Страница с полями для ввода ФИО и возратста + кнопки ADD и BACK
    private SecondPage secondPage; //Страница вывода списка студентов

    public MainFrame() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("STUDENTS Application");
        setSize(300, 300);
        setLayout(null);

        mainMenuPage = new MainMenu(this);
        mainMenuPage.setVisible(true);
        add(mainMenuPage);

        firstPage = new FirstPage(this);
        firstPage.setVisible(false);
        add(firstPage);

        secondPage = new SecondPage(this);
        secondPage.setVisible(false);
        add(secondPage);
    }

    public MainMenu getMainMenuPage() {
        return mainMenuPage;
    }

    public FirstPage getFirstPage() {
        return firstPage;
    }

    public SecondPage getSecondPage() {
        return secondPage;
    }
}
