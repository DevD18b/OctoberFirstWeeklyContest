import java.util.*;

public class implementHashMap {

    static List<Pair>[] bucket;
    static int size = 10000;

    implementHashMap() {
        bucket = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            bucket[i] = new LinkedList<>();
        }
    }

    public static void put(int key, int value) {
        int index = key % size;
        List<Pair> chaining = bucket[index];
        for (Pair p : chaining) {
            if (p.key == key) {
                p.value = value;
                return;
            }
        }
        chaining.add(new Pair(key, value));
    }

    public static int get(int key) {
        int index = key % size;
        List<Pair> chaining = bucket[index];
        for (Pair p : chaining) {
            if (p.key == key) {

                return p.value;
            }
        }
        return -1;
    }

    public static void remove(int key) {

        int index = key % size;
        List<Pair> list = bucket[index];
        for (Pair p : list) {
            if (p.key == key) {
                list.remove(p.key);
            }
        }

    }

    static class Pair {
        int key;
        int value;

        Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

}
