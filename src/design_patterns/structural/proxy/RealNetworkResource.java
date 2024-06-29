package design_patterns.structural.proxy;

public class RealNetworkResource implements NetworkResource {
    private String ipAddress;

    public RealNetworkResource(String ipAddress) {
        this.ipAddress = ipAddress;
        connect(ipAddress); // Simulating connection establishment
    }

    @Override
    public void connect(String ipAddress) {
        System.out.println("Connecting to network resource at " + ipAddress);
    }

    @Override
    public void fetchData(String path) {
        System.out.println("Fetching data from path: " + path);
    }
}
