import java.io.BufferedReader;
import java.io.*;
import java.net.*;

class HttpCat{
    public static void main(String[] args) throws IOException  {
        URL url = new URL(args[0]);
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        int c;
        while((c=br.read())!=-1){
            System.out.print((char)c);
        }
        

    }
}