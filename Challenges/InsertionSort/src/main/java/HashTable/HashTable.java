package HashTable;

import java.util.ArrayList;
import java.util.Objects;

public class HashTable<K,V> {

    // bucket of hashnodes used to store linked list of
    // hashnodes in each bucket when collisions occur
    private ArrayList<HashNode<K, V>> bucketArray;

    // will hold the current size of our bucketArray
    private int numBuckets;

    // will hold the total number of hashnodes in the bucket array
    private int size;

    public HashTable() {
        bucketArray = new ArrayList<>();
        numBuckets = 30;
        size = 0;

        // create bucket array
        for (int index = 0; index < numBuckets; index++) {
            bucketArray.add(null);
        }
    }

    /**
     * hashes the key using the built in java hash function,
     * however you can build your own
     *
     * @param key any object
     * @return hashcode of the key
     */
    private int hashCode(K key) {
        return Objects.hashCode(key);
    }

    /**
     * Gets the index of where the value is located in the bucket array
     *
     * @param key any object
     * @return bucket index
     */
    private int getBucketIndex(K key) {
        int hashCode = hashCode(key);

        // this is to ensure the index is with in the bounds of the bucket array
        int index = hashCode % numBuckets;

        // hashCode can be negative (key.hashCode() can be -ve (negative))
        // so we need to make it positive
        index = index < 0 ? index * -1 : index;

        return index;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    /**
     *
     * @param key
     * @param value
     */
    public void add(K key, V value) {

        // gets the head of a linked list for a given key
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);

        // check if key present
        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                head.value = value;
                return;
            }

            head = head.next;
        }

        // insert the value in to the position
        size++;
        head = bucketArray.get(bucketIndex);
        HashNode<K, V> newNode = new HashNode<>(key, value, hashCode);
        newNode.next = head;
        bucketArray.set(bucketIndex, newNode);

        // if the load factor (number of hasnnodes) goes beyond the threshold
        // double the hashtble aka the bucket array
        if ((1.0 * size) / numBuckets >= 0.7) {
            ArrayList<HashNode<K, V>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            numBuckets = 2 * numBuckets;
            size = 0;

            for (int index = 0; index < numBuckets; index++) {
                bucketArray.add(null);
            }

            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }

    /**
     *
     * @param key
     * @return
     */
    public V remove(K key) {
        // Apply hash function to find index for given key
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
        // Get head of chain
        HashNode<K, V> head = bucketArray.get(bucketIndex);

        // Search for key in its linked list
        HashNode<K, V> prev = null;
        while (head != null) {
            // If Key found
            if (head.key.equals(key) && hashCode == head.hashCode)
                break;

            // Else keep moving in chain
            prev = head;
            head = head.next;
        }

        // If key was not there
        if (head == null)
            return null;

        // Reduce size
        size--;

        // Remove key
        if (prev != null)
            prev.next = head.next;
        else
            bucketArray.set(bucketIndex, head.next);

        return head.value;
    }

    /**
     *
     * @param key
     * @return
     */
    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);

        // search the linnked list
        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                return head.value;
            }

            head = head.next;
        }

        // key not found
        return null;
    }
    public String repeatedWord(String target){
        String repeatedResult = "";

        String[] splitTarget = target.split(" ",-2);


        for (int i = 0; i < splitTarget.length; i++) {

            if(get((K) splitTarget[i]) != null || get((K) ((K) splitTarget[i]+",")) != null ){
                repeatedResult = splitTarget[i];
                break;
            }
            add(((K)splitTarget[i]), (V) splitTarget[i]);
        }
        return repeatedResult;
    }
    //
}
