package design_patterns.structural.proxy;

public interface NetworkResource {
    void connect(String ipAddress);
    void fetchData(String path);
}
