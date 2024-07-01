package design_patterns.behavioral.template_method;

public class XMLDataProcessor extends DataProcessor {

    @Override
    protected void readData() {
        System.out.println("Reading data from XML file.");
    }

    @Override
    protected void processData() {
        System.out.println("Processing XML data.");
    }

    @Override
    protected void writeData() {
        System.out.println("Writing processed data to XML file.");
    }
}
