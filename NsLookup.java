import java.net.*;

class NsLookup {
    public static void main(String[] args) throws UnknownHostException {
        for (String host : args) {
            try {
                InetAddress[] addresses = InetAddress.getAllByName(host);
                for (InetAddress address : addresses) {
                    System.out.println(address);
                }
            } catch (UnknownHostException e) {
                System.out.println(host + " not found");
            }

        }
    }
}