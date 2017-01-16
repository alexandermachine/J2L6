package ru.Voloshinskiy.Java2.Lesson6.EchoServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Alexander V on 14.01.2017.
 */
public class EchoServer {

    public static void main(String[] args){
        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
            serverSocket = new ServerSocket(8189);
            System.out.println("server is started");
            socket = serverSocket.accept();
            System.out.println("client conected");

            Scanner in = new Scanner(socket.getInputStream());
            String message = in.nextLine();
            System.out.println("Message from client: " + message);

            PrintWriter out = new PrintWriter(socket.getOutputStream());
            out.println("Hi All client");
            out.flush();
            System.out.println("Message to client send");

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (serverSocket != null) serverSocket.close();
                System.out.println("server is closed");
                if (socket != null) socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
