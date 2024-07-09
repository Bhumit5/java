package ArrayRearrange;

import java.util.ArrayList;
import java.util.Arrays;

public class hiddenElement {

    static int checkArr(int s, int e, int diff){
        ArrayList <ArrayList<Integer>> combs = new ArrayList<>();
        int mid = (int)(e - s)/2;
        for (int i = s + 1; i < s + 1 + mid; i++) {
            ArrayList <Integer> c = new ArrayList<>();
            c.add(i);
            c.add(diff - i);
            combs.add(c);
        }
        
        int min = 50;

        for (int i = 0; i < combs.size(); i++) {
            ArrayList<Integer> inner = combs.get(i);
            for (int j = 0; j < 2; j++) {
                if(inner.get(j) < min){
                    min = inner.get(j);
                }
            }
        }

        return 0;

    }

    static int findHiddenElement(int n, int []a) {
        // Write your code here.
        int prev = 0, curr = 0, next = 0, diff, j = 0, temp = 0;
        ArrayList <Integer> limit = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if(a[i] == -1){
                prev = a[i-1];
                curr = a[i];
                next = a[i+1];
                break;
            }
            limit.add(a[i] - temp);
            temp = a[i];
        }

        diff = next - prev;
        Arrays.sort(a);

        int start = limit.get(0);
        int end = limit.get(limit.size() - 1);

        // checkArr

        return 0;
    }
}