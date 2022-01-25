package MyHashMap;

public interface Interface<K,V>extends Iterable<V> {
    boolean put(K key,V value);
    boolean remove(K key);
    void clear();
    int size();
    V get(K key);
}
