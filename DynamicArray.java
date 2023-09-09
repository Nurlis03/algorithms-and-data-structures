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

    public int size() {
        return len;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public T get(int index) {
        return arr[index];
    }

    public void set(int index, T elem) {
        arr[index] = elem;
    }

    public void clear() {
        for (int i = 0; i < len; i++) arr[i] = null;
        len = 0;
    }

    public void add(T elem) {
        // Time to resize!
        if (len + 1 >= capacity) {
            if (capacity == 0) capacity = 1;
            else capacity *= 2; // double the size
            T[] new_arr = (T[]) new Object[capacity];
            for (int i = 0; i < len; i++) new_arr[i] = arr[i];
            arr = new_arr; // arr has extra nulls padded
        }

        arr[len++] = elem;
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