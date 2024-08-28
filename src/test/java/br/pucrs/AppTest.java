package br.pucrs;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest {

    @Test
    public void testMergeSortWithRandomNumbers() {
        // ArrayList<Integer> array32 = generateRandomList(32);
        // ArrayList<Integer> sArray32 = App.mergeSort(array32);
        // System.out.println(App.recursionCount);
        // System.out.println(App.time);
        // assertTrue(isSorted(sArray32));

        // ArrayList<Integer> array2048 = generateRandomList(2048);
        // ArrayList<Integer> sArray2048 = App.mergeSort(array2048);
        // System.out.println(App.recursionCount);
        // System.out.println(App.time);
        // assertTrue(isSorted(sArray2048));

        // ArrayList<Integer> array1m = generateRandomList(1048576);
        // ArrayList<Integer> sArray1m = App.mergeSort(array1m);
        // System.out.println(App.recursionCount);
        // System.out.println(App.time);
        // assertTrue(isSorted(sArray1m));
    }

    @Test
    public void testMaxValueArray(){
        // ArrayUtils r = new ArrayUtils(32);
        // long max = App.maxVal1(r.array, r.array.length);
        // System.out.println();
        // System.out.println(max);
        // System.out.println("Iterações: " + App.recursionCount);
        // System.out.println("Tempo: " + App.time);
    }

    private ArrayList<Integer> generateRandomList(Integer size) {
        ArrayList<Integer> list = new ArrayList<>(size);
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(10000));
        }
        return list;
    }

    private boolean isSorted(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) > list.get(i)) {
                return false;
            }
        }
        return true;
    }
}
