package HashTable;

import java.util.Objects;

// A node of chains
class HashNode<K, V> {
    K key;
    V value;
    final int hashCode;

    // Reference to next node
    HashNode<K, V> next;

    public HashNode(K key, V value, int hashCode) {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
    }
}

class Map<K, V> {
    // bucketArrat is used to store array of chains
    private ArrayList<HashNode<K, V>> bucketArray;

    // Current capacity of array list
    private int numBuckets;

    // Current size of array list
    private int size;

    // Constructor (Initializes capacity, size and empty chains)
    public Map() {
        bucketArray = new ArrayList<>();
        numBuckets = 10;
        size = 0;

        // Create empty chains
        for (int i = 0; i < numBuckets; i++) {
            bucketArray.add(null);
        }
    }

    public int size() { return size; }
    public boolean isEmpty() { return size() == 0; }

    private final int hashCode (K key) {
        return Objects.hashCode(key);
    }

    private int getBucketIndex(K key) {
        int hashCode = hashCode(key);
        int index = hashCode % numBuckets;
        index = index < 0 ? index * -1 : index;
        return index;
    }
}