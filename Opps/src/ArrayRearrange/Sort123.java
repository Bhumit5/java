package ArrayRearrange;

import java.util.* ;
import java.io.*;

public class Sort123 {

    public static void set(int[] arr, int ind, int i, int j, int k){
        if(arr[ind] == 0){
            if(i == j){
                arr[i++] = 0;
                j++;
                System.out.println("i -> " + i);
                System.out.println("j -> " + j);
            }else{
                System.out.println("i -> " + i);
                arr[i++] = 0;
                arr[j++] = 1;
            }
        }

        if(arr[ind] == 1){
            arr[j++] = 1;
        }

        if(arr[ind] == 2){
            arr[k--] = 2;
        }
    }

    public static void sort012(int[] arr)
    {
        //Write your code here
        int len = arr.length;
        int i = 0, j = 0, k = len-1;

        for(int ind = 0; ind < len; ind++){
            System.out.println("element at " + ind + " is " +arr[ind]);
            System.out.println("k -> " + k);

        }
    }

    public static void main(String[] args) {

        int[] arr = {0,1,2,2,1,0};
        sort012(arr);

        for(int n:arr){
            System.out.print(n + "-");
        }
    }
}
