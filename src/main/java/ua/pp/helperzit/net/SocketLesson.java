package ua.pp.helperzit.net;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class SocketLesson {

    public static void main(String[] args) throws IOException {

        try (Socket socket = new Socket()) {
            //socket.connect(new InetSocketAddress("india.colorado.edu", 13), 2000);
            socket.connect(new InetSocketAddress("localhost", 8191), 2000);

            Scanner scanner = new Scanner(socket.getInputStream());
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            while (scanner.hasNextLine()){
                String output = scanner.nextLine();
                System.out.println(output);
                writer.write(output);
            }
        }
    }
}
