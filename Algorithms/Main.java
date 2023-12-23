package Algorithms;

import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String args[]) {
        int[] randomIntsArray = IntStream.generate(() -> new Random().nextInt(10000)).limit(2000).toArray();
        for (int i = 0; i < 50; i++) {
            System.out.println(randomIntsArray[i]);
        }
        // BinarySearch.binarySearch(randomIntsArray, 50);
    }    
}
