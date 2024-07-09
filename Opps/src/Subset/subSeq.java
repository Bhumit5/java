import java.util.ArrayList;

public class subSeq {
    public static void main(String[] args) {
        System.out.println(subSeq("","abc"));
    }

//    static void subSeq(String p, String up){
//        if(up.isEmpty()){
//            if(!p.isEmpty())
//                System.out.print(p+", ");
//            return;
//        }
//
//        char ch = up.charAt(0);
//        subSeq(p + ch,up.substring(1));
//        subSeq(p ,up.substring(1));
//    }


    static ArrayList<String> subSeq(String p, String up){
        if(up.isEmpty()){
            if (!p.isEmpty()){
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subSeq(p + ch,up.substring(1));
        ArrayList<String> right = subSeq(p ,up.substring(1));

        left.addAll(right);
        return left;
    }
}
