package maptest;

import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;

public class SelfDefinedHashMap {
    static class Node<K,V> implements Map.Entry<K,V>{
        final int hash;
        final K key;
        volatile V value;
        volatile Node<K,V> next;

        Node(int hash, K key, V value, Node<K,V> next){
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public final K getKey(){ return key; }

        public final V getValue(){ return value; }

        public int hashCode(){ return key.hashCode() ^ value.hashCode(); }

        public final String toString() { return key + "=" + value; }

        public final V setValue(V value){ throw  new UnsupportedOperationException(); }

        public final boolean equals(Object o){
            Object k, v, u; Map.Entry<?,?> e;

            return (
                    (o instanceof Map.Entry) &&
                    ((k = (e = (Map.Entry<?,?>) o).getKey()) != null) &&
                    ((v = e.getValue()) != null) &&
                    (k == key || k.equals(key)) &&
                    (v == (u = value) || v.equals(u))
                    );
        }

        Node<K,V> find(int h, Object k){
            Node<K,V> e = this;
            if (k != null){
                do {
                    K ek;
                    if (
                        (e.hash == h) &&
                        (
                                ((ek = e.key) == k ) ||
                                (ek != null && ek.equals(k))
                        )
                        ) {
                        return e; }
                }while ((e = e.next) != null);
            }
            return null;
        }

        
    }
}
