package questions.stackandqueue.stack;

import java.util.ArrayList;
import java.util.List;

public class LRUCache {
    int[] keys = null;
    int[] values = null;
    int[] timestamps = null;
    int timeStamp = 0;
    int capacity = -1;
    int index =0;
    public LRUCache(int capacity){
        keys = new int[capacity];
        values = new int[capacity];
        timestamps = new int[capacity];
    }


    public void put(int key,int num){

        if(keys.length==capacity){
             int ind = -1;
            int minmumTimestamp = Integer.MAX_VALUE;
          for(int i=0;i<timestamps.length;i++){
              if(timestamps[i]<minmumTimestamp){
                  minmumTimestamp = timeStamp;
                  ind = i;
              }
          }
          keys[ind]=key;
          values[ind] = num;
          timestamps[ind] = timeStamp++;
        }
        else{
            keys[index]= key;
            values[index] = num;
            timeStamp++;
            timestamps[index] = timeStamp;
        }

    }
    public int get(int key){
       int index = -1;
       int element  = -1;
        if(keys!=null){

            for(int i=0;i<keys.length;i++){
                if(keys[i]==key){
                    index = i;
                    break;
                }
            }
            if(index==-1){
                return -1;
            }
            //send value as element
        element = values[index];
            //update timestamp
            timestamps[index] = timeStamp++;
        }
        return element;
    }






    public static void main(String[] args) {

        List<List<Integer>> nums = List.of(List.of(1, 1, 1), List.of(1, 2, 2), List.of(2, 1), List.of(1, 3, 3), List.of(2, 2), List.of(1, 4, 4), List.of(2, 3));
        int capacity = 2;
        LRUCache lruCache = new LRUCache(capacity);
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            List<Integer> currentOperation = nums.get(i);

            int resElement = -1;
            if (currentOperation.size() == 2) {

                if(currentOperation.get(0)==1){
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
