package ua.pp.helperzit.net;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ConnectHttp {

    public static void main(String[] args) throws IOException {

        URLConnection connection = new URL("http://www.google.com").openConnection();
        Scanner scanner = new Scanner(connection.getInputStream());
        scanner.useDelimiter("\\Z");
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

        Map<String, List<String>> headers = connection.getHeaderFields();
        for (Map.Entry<String, List<String>> entry: headers.entrySet()){
            System.out.println(entry.getKey() + " ---- " + entry.getValue());
        }
    }
}
