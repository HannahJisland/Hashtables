import java.util.*;

public class HashTable<K,V> {
    // Nod för seperate chaining
    private class Node {
        K key;
        V value;
        Node next;

        public Node(K key, V value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
    // Själva tabellen (array av listor)
    private Node[] table;
    private int size; // antal element

    public HashTable() {
        table = ((Node[]) new HashTable.Node[4]);

        size = 0;
    }

    public int hash(K key) {
        int h = key.hashCode();
        if (h < 0) {
            h = -h;
        }
        return h % table.length;
    }

    public void put(K key, V value) {
        int index = hash(key);
        Node current = table[index];

        // Kollar först om nyckeln redan finns
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }

            current = current.next;
        }

        // Annars lägger vi till först i listan
        Node newNode = new Node(key, value, table[index]);
        table[index] = newNode;
        size++;

        // Vid resize
        if ((double) size / table.length > 0.75) {
            resize(table.length * 2);
        }
    }

    // Hämta värde
    public V get(K key) {
        int index = hash(key);
        Node current = table[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            } else {
                current = current.next;
            }
        }

        return null;
    }

    // Kollar om nyckeln finns
    public boolean containsKey(K key) {
        return get(key) != null;
    }
    
    // Ta bort
    public void remove(K key) {
        int index = hash(key);
        Node current = table[index];
        Node previous = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (previous == null) {
                    table[index] = current.next;
                } else {
                    previous.next = current.next;
                }

                size--;

                if (table.length > 1 && (double) size / table.length < 0.25) {
                    resize(table.length / 2);
                }

                return;
            }

            previous = current;
            current = current.next;
        }
    }

    public Iterable<K> keySet() {
        List<K> list = new ArrayList<>();

        for (int i = 0; i < table.length; i++) {
            Node current = table[i];
            while (current != null) {
                list.add(current.key); 
                current = current.next;
            }
        }
        return list;
    }

    // Resizea tabellen
    public void resize(int newSize) {
        Node[] oldTable = table;

        // Skapa ny array
        table = ((Node[]) new HashTable.Node[newSize]);
        size = 0;

        // Gå igenom gamla tabellen
        for (int i = 0; i < oldTable.length; i++) {
            Node current = oldTable[i];
            
            while (current != null) {
                put(current.key, current.value);
                current = current.next;
            }
        }
    }
}
