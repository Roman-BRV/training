package ua.pp.helperzit.net;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketServerLesson {

    public static void main(String[] args) throws IOException {

        try (ServerSocket serverSocket = new ServerSocket(8191)){
            while (true){
                Socket socket = serverSocket.accept();
                new Thread(new MyServer(socket)).start();
            }
        }
    }
}

class MyServer implements Runnable{

    Socket socket;

    MyServer(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try (Scanner scanner = new Scanner(socket.getInputStream());
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)){
            //writer.println("Hello World!");
            while (scanner.hasNextLine()){
                String input = scanner.nextLine();
                writer.println("You have sent: " + input);
                System.out.println(input);
//                if (input.equals("exit")){
//                    break;
//                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
