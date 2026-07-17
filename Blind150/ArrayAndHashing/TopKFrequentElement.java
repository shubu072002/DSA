package Blind75.ArrayAndHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElement {
    static class Number implements Comparable<Number>{
        int element;
        int freq;

        public Number(int element, int freq){
            this.element = element;
            this.freq = freq;
        }
        @Override
        public int compareTo(Number that) {
            //min Heap
            return this.freq - that.freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Number> pq = new PriorityQueue<>();
        for(int element: nums){
            map.put(element, map.getOrDefault(element,0)+1);
        }
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            Number number = new Number(e.getKey(), e.getValue());
            pq.offer(number);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int res[] = new int[k];
        int index = 0;
        while(index<k){
            Number number = pq.poll();
            res[index] = number.element;
            index++;
        }

      return res;
    }
}
