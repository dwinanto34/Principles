package design_patterns.behavioral.observer;

public class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("Investor " + name + " notified. " + stockName + " is now $" + stockPrice);
    }
}
