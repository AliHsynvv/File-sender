package tcp;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception{
        byte[] b = new byte[20002];
        Socket s = new Socket("localhost", 3606);
        InputStream is = s.getInputStream();
        FileOutputStream fr = new FileOutputStream("C:\\Users\\gsynv\\OneDrive\\Masaüstü\\Client\\test2.txt");
        is.read(b, 0, b.length);
        fr.write(b, 0, b.length);

    }
}
