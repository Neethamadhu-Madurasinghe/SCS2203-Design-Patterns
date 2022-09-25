package Iterator;

public class CustomDataCollection implements Container{
    private String names[] = { "Saman", "John", "Chithral", "Japan" };

    @Override
    public Iterator getIterator() {
        return new CustomDataCollectionIterator();
    }

    private class CustomDataCollectionIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length) return true;
            else return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
