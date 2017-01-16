package ru.Voloshinskiy.Java2.Lesson6.Client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Alexander V on 14.01.2017.
 */
public class Connection {
    Socket socket = null;
    Scanner message = new Scanner(System.in);
    public Connection(String host, int port) throws IOException {
        socket = new Socket(host, port);
    }

    public String input() throws IOException {
        Scanner in = new Scanner(socket.getInputStream());
        String message = in.nextLine();
        in.close();
        return "Message from server: " + message;
    }
    public void output() throws IOException {
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        out.println(message.nextLine());
        out.flush();
        out.close();
        System.out.println("message to server send");
    }
    public void close() throws IOException {
        socket.close();

    }

    public boolean isClosed(){
        return socket.isClosed();
    }



}
