package lesson4.homeWork2_4;

import javax.swing.*;

public class Chat1 {
    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new MyWindow();
//            }
//        });
//        SwingUtilities.invokeLater(() -> new MyWindow());
        SwingUtilities.invokeLater(ChatWindow::new);
        System.out.println("Bye main!");
    }
}

class ChatWindow extends JFrame {
    ChatWindow() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 600, 600);
        setVisible(true);
    }

}
