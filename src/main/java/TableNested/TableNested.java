package TableNested;

import Table.Entry;

import java.util.ArrayList;
import java.util.List;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
    public class TableNested<K, V> {

    private ArrayList<Table.Entry> entries;



    public TableNested() {
        entries = new ArrayList<>();
    }


    public V get(K foo) {
        for(Table.Entry e: entries)
        {
            if(e.getKey().equals(foo))
                return (V) e.getValue();
        }
        return null;
    }

    public void put(K foo, V i) {
        remove(foo);
        entries.add(new Table.Entry(foo, i));
        System.out.println(entries.size());
    }

    public void remove(K foo) {
        for(Table.Entry e: entries) {
            if (e.getKey().equals(foo))
                entries.remove(e);
            break;
        }

    }
    private class Entry {
        private K key;
        private V value;
        private List<Entry> entryList;

        public Entry()
        {
            entryList = new ArrayList<Entry>();
        }


        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }


        public V getValue() {
            return value;
        }

    }

}
