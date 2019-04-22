package JavaLevel1.Lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EditWindow extends JFrame {

    public EditWindow(MainWindow mainWindow) {

        setTitle("Введите данные");
        setSize(350, 350);
        setLocationRelativeTo(null);

        JPanel panelTop = new JPanel(new GridLayout(6, 1));
        JPanel panelButton = new JPanel(new GridLayout(1, 2, 15, 15));

        panelTop.add(new JLabel("Введите имя: "));
        JTextField jTextField1 = new JTextField();
        panelTop.add(jTextField1);
        panelTop.add(new JLabel("Введите отчество: "));
        JTextField jTextField2 = new JTextField();
        panelTop.add(jTextField2);
        panelTop.add(new JLabel("Введите фамилию: "));
        JTextField jTextField3 = new JTextField();
        panelTop.add(jTextField3);
        panelTop.add(new JLabel("Введите дату рождения: "));
        JTextField jTextField4 = new JTextField();
        panelTop.add(jTextField4);

        JButton jbtOk = new JButton("Принять");
        JButton jbtCancel = new JButton("Отмена");

        panelButton.add(jbtOk);
        panelButton.add(jbtCancel);

        add(panelTop, BorderLayout.NORTH);
        add(panelButton, BorderLayout.SOUTH);

        setVisible(true);

        jbtOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainWindow.setFirstName(jTextField1.getText());
                mainWindow.setMidleName(jTextField2.getText());
                mainWindow.setSurName(jTextField3.getText());
                mainWindow.setAge(jTextField4.getText());
                Object o = e.getSource();
                if (o instanceof JComponent) {
                    JComponent component = (JComponent) o;
                    Window win = SwingUtilities.getWindowAncestor(component);
                    win.dispose();
                }
            }
        });
        jbtCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object o = e.getSource();
                if (o instanceof JComponent) {
                    JComponent component = (JComponent) o;
                    Window win = SwingUtilities.getWindowAncestor(component);
                    win.dispose();
                }
            }
        });
    }
}
