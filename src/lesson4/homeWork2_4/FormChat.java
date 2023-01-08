package lesson4.homeWork2_4;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FormChat {
    private JPanel panel1;
    private JList<String> listItems;
    private JTextField customInputText;
    private JButton myButton;
    private JLabel label;

    public FormChat() {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listItems.setModel(listModel);
        listItems.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
//                int firstIndex = e.getFirstIndex();
//                String selectedValue = listModel.get(firstIndex);
                String selectedValue = listItems.getSelectedValue();
                label.setText(selectedValue);
            }
        });


        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.addElement(customInputText.getText());
                customInputText.setText("");
            }
        });

        customInputText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.addElement(customInputText.getText());
                customInputText.setText("");
            }
        });
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("FormChat");
        frame.setContentPane(new FormChat().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");


        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Bye from menu!");
                frame.dispose();
            }
        });

        menu.add(exitMenuItem);

        menuBar.add(menu);

        frame.setJMenuBar(menuBar);


        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Bye!");
            }
        });

        frame.pack();
        frame.setVisible(true);
    }
}
