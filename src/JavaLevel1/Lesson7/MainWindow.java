package JavaLevel1.Lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MainWindow extends JFrame {
    private String firstName;
    private String midleName;
    private String surName;
    private String Age;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        jLabel1.setText("Имя: " + firstName);
    }

    public void setMidleName(String midleName) {
        this.midleName = midleName;
        jLabel2.setText("Отчество: " + midleName);
    }

    public void setSurName(String surName) {
        this.surName = surName;
        jLabel3.setText("Фамилия: " + surName);
    }
    public void setAge(String Age) {
        this.Age = Age;
        jLabel4.setText("Дата рождения: " + Age);
    }

    public MainWindow() {

        setTitle("Анкета");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(640, 480);
        setLocationRelativeTo(null);

        JPanel panelTop = new JPanel(new GridLayout(4, 1, 15, 15));
        JPanel panelButton = new JPanel(new GridLayout(1, 2, 15, 15));

        jLabel1 = new JLabel("Имя: ");
        jLabel2 = new JLabel("Отчество: ");
        jLabel3 = new JLabel("Фамилия: ");
        jLabel4 = new JLabel("Дата рождения: ");

        JButton jbt1 = new JButton("Ввод данных");

        panelTop.add(jLabel1);
        panelTop.add(jLabel2);
        panelTop.add(jLabel3);
        panelTop.add(jLabel4);

        panelButton.add(jbt1);

        add(panelTop, BorderLayout.NORTH);
        add(panelButton, BorderLayout.SOUTH);

        setVisible(true);

        jbt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainWindow mainWindow = (MainWindow) SwingUtilities.getRoot((JButton) e.getSource());
                new EditWindow(mainWindow);
            }
        });
    }
}
