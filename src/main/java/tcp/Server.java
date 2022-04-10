package tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void server(String location,int port) throws Exception{
        ServerSocket sr = new ServerSocket(port);
        System.out.println("Waiting...");
        Socket s = sr.accept();
        System.out.println("Successfully Sent");
        FileInputStream fr = new FileInputStream(location);
        byte b[] = new byte[20002];
        fr.read(b, 0, b.length);
        OutputStream os = s.getOutputStream();
        os.write(b, 0, b.length);
    }
}
