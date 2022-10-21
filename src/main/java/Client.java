import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {

        String host = "127.0.0.1";
        int port = 10000;

        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            out.println("Evgenii ");
            String resp = in.readLine();
            System.out.println(resp);
        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }
}