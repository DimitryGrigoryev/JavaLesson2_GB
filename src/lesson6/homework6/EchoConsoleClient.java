package lesson6.homework6;

import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class EchoConsoleClient {
    private static Scanner scanner = new Scanner(System.in);
    private final String SERVER_ADDR = "localhost";
    private final int SERVER_PORT = 8188;
    private Socket socket;
    private Object msgInputField;
    private DataInputStream in;
    private DataOutputStream out;

    public EchoConsoleClient() {
        try {
            openConnection();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        prepareScanner();
    }

    public void openConnection() throws IOException {
        socket = new Socket(SERVER_ADDR, SERVER_PORT);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        new Thread(() -> {
            try {
                while (true) {
                    String strFromServer = in.readUTF();
                    if (strFromServer.equalsIgnoreCase("/end")) {
                        break;
                    }
                    String message = in.readUTF();
                    System.out.println("From server: " + message);
//                    chatArea.append(strFromServer);
//                    chatArea.append("\n");
                }
            } catch (Exception e) {
                System.out.println("Connection has been closed!");
            }
        }).start();

    }

    public void closeConnection() {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage() {
        if (!(msgInputField == null)) { //!msgInputField.getText().trim().isEmpty()
            try {
                out.writeUTF(String.valueOf(msgInputField));
//                msgInputField.setText("");
//                msgInputField.grabFocus();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Ошибка отправки сообщения");
//                JOptionPane.showMessageDialog(null, "Ошибка отправки сообщения");
            }
        }
    }

    public void prepareScanner() {
        new Thread(() -> {
            try {
                msgInputField = scanner.nextInt();
                sendMessage();
            } catch (Exception e) {
                System.out.println("Connection has been closed!");
            }
        }).start();
    }
    //String strFromServer = in.readUTF();
// chatArea.append(strFromServer);
// chatArea.append("\n");
    //String strFromServer = in.readUTF();
    // chatArea.append(strFromServer);
    // chatArea.append("\n");

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EchoConsoleClient();
            }
        });
    }


}
