package design_patterns.structural.proxy;

public class NetworkResourceProxy implements NetworkResource {
    private String ipAddress;
    private RealNetworkResource realResource;

    public NetworkResourceProxy(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public void connect(String ipAddress) {
        if (realResource == null) {
            realResource = new RealNetworkResource(ipAddress);
        }
        realResource.connect(ipAddress);
    }

    @Override
    public void fetchData(String path) {
        if (realResource == null) {
            realResource = new RealNetworkResource(ipAddress);
        }
        realResource.fetchData(path);
    }
}
