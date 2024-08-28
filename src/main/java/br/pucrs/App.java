package br.pucrs;

import java.util.ArrayList;

public class App 
{

    public static int recursionCount = 0;    
    public static long time = 0;
    public static long startTime = 0;
    public static long endTime = 0;


    public static void main( String[] args )
    {
        ArrayUtils r = new ArrayUtils(1048576);
        long max = maxVal1(r.array, r.array.length);
        System.out.println();
        System.out.println("Maior: " + max);
        System.out.println("Iterações: " + recursionCount);
        System.out.println("Tempo: " + (double) time / 1_000_000_000);

        ArrayUtils a = new ArrayUtils(1048576);
        time = 0;
        recursionCount = 0;
        startTime = System.nanoTime();
        long max2 = maxVal2(a.array, 0, a.array.length -1);
        endTime = System.nanoTime();
        time = (endTime - startTime);

        System.out.println();
        System.out.println("Maior: " + max2);
        System.out.println("Iterações: " + recursionCount);
        System.out.println("Tempo: " + (double) time / 1_000_000_000);

    }
}
