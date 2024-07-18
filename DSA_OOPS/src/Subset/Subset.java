import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
//        List<List<Integer>> ans = subset(arr);
//        System.out.print("[ ");
//        for(List<Integer> ls : ans){
//            System.out.print(ls+" ");
//        }
//        System.out.print("]");
//
        List<List<Integer>> ans = subsetDistinct(arr);
        System.out.print("[ ");
        for(List<Integer> ls : ans){
            System.out.print(ls+" ");
        }
        System.out.print("]");
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num:arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

    static List<List<Integer>> subsetDistinct(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;
        for (int j = 0; j < arr.length; j++) {
            start = 0;
            if (j>0 && arr[j] == arr[j-1]){
                start = end + 1;
            }

            end = outer.size() - 1;
            int n = outer.size();

            for (int i = start; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(arr[j]);
                outer.add(inner);
            }

        }
        return outer;
    }
}
