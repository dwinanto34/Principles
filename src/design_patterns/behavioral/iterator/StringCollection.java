package design_patterns.behavioral.iterator;

public class StringCollection implements Aggregate<String> {
    private String[] stringList;
    private int index;

    public StringCollection(int size) {
        stringList = new String[size];
    }

    public void addBook(String book) {
        if (index < stringList.length) {
            stringList[index++] = book;
        }
    }

    @Override
    public Iterator<String> createIterator() {
        return new StringIterator(stringList);
    }
}
