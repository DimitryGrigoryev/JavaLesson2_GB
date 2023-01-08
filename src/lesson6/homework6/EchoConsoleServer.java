package lesson6.homework6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoConsoleServer {
        public static final String END_COMMAND = "/end";
    private static String msgInputField;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

            Socket clientSocket = null;
            ServerSocket serverSocket = null;
            try {
                serverSocket = new ServerSocket(8188, 1);
                System.out.println("Сервер запущен, ожидаем подключения...");
//            boolean flag = true;
//            while (flag) {
                clientSocket = serverSocket.accept();
                System.out.println("Клиент подключился");
//            }
                DataInputStream in = new DataInputStream(clientSocket.getInputStream());
                DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
                while (true) {
                    String message = in.readUTF();
                    System.out.println("From client: " + message);
                    if (message.equals(END_COMMAND)) {
                        break;
                    }
                    msgInputField = String.valueOf(scanner.nextInt());
                    out.writeUTF("Эхо: " + msgInputField);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (serverSocket != null) serverSocket.close();
                if (clientSocket != null) clientSocket.close();
            }
        }

}
