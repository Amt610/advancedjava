package collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;

public class arrayListVslinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long start = System.nanoTime();
        for(int i=0; i<100000; i++) arrayList.add(i);
        long end = System.nanoTime();
        System.out.println("ArrayList Insertion: " + (end-start) + " ns");

        start = System.nanoTime();
        for(int i=0; i<100000; i++) linkedList.add(i);
        end = System.nanoTime();
        System.out.println("LinkedList Insertion: " + (end-start) + " ns");
    }
}
