@SuppressWarnings("unchecked")
public class DynamicArray<T> implements Iterable<T> {

    private T[] arr;
    private int len = 0; // length user thinks array is
    private int capacity = 0; // Actual array size

    public DynamicArray() {
        this(16);
    }

    public DynamicArray(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("Illegal Capacity: " +  capacity);
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < len;
            }

            @Override
            public T next() {
                return arr[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
    
}