package design_patterns.behavioral.template_method;

public abstract class DataProcessor {
    // Template method
    public final void process() {
        readData();
        processData();
        writeData();
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void readData();
    protected abstract void processData();
    protected abstract void writeData();
}
