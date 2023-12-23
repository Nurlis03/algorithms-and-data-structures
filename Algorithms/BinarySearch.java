package Algorithms;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class BinarySearch {
    public boolean binarySearch(int arr[], int target) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;
            System.out.println(m);
            if (arr[m] > target) {
                r = m - 1;
            }
            else if (arr[m] < target) {
                l = m + 1;
            }
            else {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        int[] randomIntsArray = IntStream.generate(() -> new Random().nextInt(20)).limit(10).toArray();

        Arrays.sort(randomIntsArray);
        for (int i = 0; i < randomIntsArray.length; i++) {
            System.out.print(randomIntsArray[i] + " ");
        }
        System.out.println("\n\n");

        BinarySearch search = new BinarySearch();
        System.out.println(search.binarySearch(randomIntsArray, 0));
    }   
}
