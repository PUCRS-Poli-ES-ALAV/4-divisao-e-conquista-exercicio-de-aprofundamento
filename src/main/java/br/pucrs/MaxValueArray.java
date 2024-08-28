package br.pucrs;

public class MaxValueArray {
    public static long maxVal1(long A[], long n) {
        long startTime = System.nanoTime();
        long max = A[0];
        for (int i = 1; i < n; i++) {  
            recursionCount++;
            if( A[i] > max ) 
            max = A[i];
        }

        long endTime = System.nanoTime();

        time += (endTime - startTime);
        return max;
    }

    public static long maxVal2(long A[], int init, int end) {
        recursionCount++;

        if (end - init <= 1)
            return Math.max(A[init], A[end]);
        else {
            long m = (init + end)/2;
            long v1 = maxVal2(A,init,(int)m);
            long v2 = maxVal2(A,(int)m+1,end);
            return Math.max(v1,v2);
        }
    }
}
