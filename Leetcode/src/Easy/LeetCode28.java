package Easy;

public class LeetCode28 {

    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
    }

    static int strStr(String haystack, String needle) {
        return getIndex(haystack, needle, 0);
    }

    static int getIndex(String line, String word, int index){
        if(line.length()-1 < word.length()-1){
            return -1;
        }

        if(line.startsWith(word)){
            return index;
        }
        return getIndex(line.substring(1),word,index+1);
    }
}
