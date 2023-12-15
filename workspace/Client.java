import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("192.168.0.108", 2020);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(clientSocket.getOutputStream());
            ObjectInputStream objectInputStream = new ObjectInputStream(clientSocket.getInputStream());

            Scanner in = new Scanner(System.in);
            String line = in.nextLine();
            objectOutputStream.writeObject(line);

            try {
                String msg = (String) objectInputStream.readObject();
                System.out.println(msg);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}