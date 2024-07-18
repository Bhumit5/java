package ArrayRearrange;

import java.util.* ;
import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        int len = arr.size() - 1;
        int end = (int)((len - m)/2 + m);
//        int end = ;
        System.out.println(end);
        System.out.println("heelo");
        int j = 0;
        for (int i = m + 1; i <= end; i++) {
            int temp = arr.get(i);
            arr.set(i, arr.get(len - j));
            arr.set(len - j, temp);
            j++;
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(6);
        arr.add(7);
        arr.add(7);
        reverseArray(arr,3);
    }
}
