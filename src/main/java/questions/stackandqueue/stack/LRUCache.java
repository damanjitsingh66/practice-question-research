package questions.stackandqueue.stack;

import java.util.ArrayList;
import java.util.List;

public class LRUCache {
    int[] keys = null;
    int[] values = null;
    int[] timestamps = null;
    int timeStamp = 0;
    int capacity;
    int size = 0;

    public LRUCache(int capacity){
        keys = new int[capacity];
        values = new int[capacity];
        timestamps = new int[capacity];
        this.capacity=capacity;
    }


    public void put(int key, int num) {

        if (capacity <= 0) {
            return;
        }

        // 1. Check if key already exists
        for (int i = 0; i < size; i++) {

            if (keys[i] == key) {

                values[i] = num;

                timeStamp++;
                timestamps[i] = timeStamp;

                return;
            }
        }

        // 2. Cache has space
        if (size < capacity) {

            keys[size] = key;
            values[size] = num;

            timeStamp++;
            timestamps[size] = timeStamp;

            size++;

            return;
        }

        // 3. Cache is full -> find LRU
        int lruIndex = 0;
        int minimumTimestamp = timestamps[0];

        for (int i = 1; i < size; i++) {

            if (timestamps[i] < minimumTimestamp) {

                minimumTimestamp = timestamps[i];
                lruIndex = i;
            }
        }

        // 4. Replace LRU entry
        keys[lruIndex] = key;
        values[lruIndex] = num;

        timeStamp++;
        timestamps[lruIndex] = timeStamp;
    }

    public int get(int key) {

        for (int i = 0; i < size; i++) {

            if (keys[i] == key) {

                // Update access time
                timeStamp++;
                timestamps[i] = timeStamp;

                return values[i];
            }
        }

        return -1;
    }





    public static void main(String[] args) {

        List<List<Integer>> nums = List.of(List.of(1, 1, 1), List.of(1, 2, 2), List.of(2, 1), List.of(1, 3, 3), List.of(2, 2), List.of(1, 4, 4), List.of(2, 1), List.of(2, 3),List.of(2, 4));
        int capacity = 2;
        LRUCache lruCache = new LRUCache(capacity);
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            List<Integer> currentOperation = nums.get(i);

            Integer resElement = null;
            if (currentOperation.size() == 2) {

                if(currentOperation.get(0)==2){
                    resElement = lruCache.get(currentOperation.get(1));
                }
            } else {
                if(currentOperation.get(0)==1){
                    lruCache.put(currentOperation.get(1),currentOperation.get(2));
                }
            }
           res.add(resElement);
        }
        res.forEach(System.out::println);
    }
}
