package HashMap.HashMap_implementation;

import java.util.*;

public class Map<K, V> {
    ArrayList<MapNode<K, V>> buckets;
    int count;
    int numBuckets;

    public Map() {
        buckets = new ArrayList<>();
        numBuckets = 20;
        for (int i = 0; i < numBuckets; i++) {
            buckets.add(null);
        }
    }

    private int getBucketIndex(K key) {
        int hc = key.hashCode();
        int index = hc % numBuckets;
        return index;
    }

    public void insert(K key, V value) {
        int bucketIndex = getBucketIndex(key);

        MapNode<K, V> head = buckets.get(bucketIndex);

        while (head != null) {
            if (head.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        head = buckets.get(bucketIndex);
        MapNode<K, V> newNode = new MapNode<K, V>(key, value);
        newNode.next = head;
        buckets.set(bucketIndex, newNode);
        count++;

    }
}
