import java.net.*;
import java.io.*;

public class WhoIs{
    public static void main(String[] args) throws Exception {
        int c;
        Socket s = new Socket("internic.net",43);
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();

        String str = (args[0]);
        byte buf[] = str.getBytes();
        out.write(buf);
        while((c = in.read()) !=-1){
            System.out.print((char)c);
        }
        s.close();
    }
}