package design_patterns.behavioral.iterator;

public class StringIterator implements Iterator<String> {
    private String[] stringList;
    private int position;

    public StringIterator(String[] stringList) {
        this.stringList = stringList;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < stringList.length && stringList[position] != null;
    }

    @Override
    public String next() {
        return stringList[position++];
    }
}
