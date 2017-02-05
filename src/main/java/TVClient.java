import at.tripwire.samsung.remote.Client;

public class TVClient {

    public static final String TEST_IP = "192.168.1.71";

    public static final String TEST_MAC = "01-23-45-67-89-ad";

    public static final String TEST_NAME = "Manjaro";

    /**
     * @param args
     */
    public static void main(String[] args) {

        Client client = new Client("192.168.1.69", TEST_IP, TEST_MAC, TEST_NAME);
        client.sendCommand("KEY_" + args[0]);
    }
}
