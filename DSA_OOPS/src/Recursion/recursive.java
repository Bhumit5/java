package Recursion;

import java.util.ArrayList;

public class recursive {
    public static void main(String[] args) {

        perm("", "abc");
        System.out.println(permStrings("","abc"));
    }


    static void perm(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String e = p.substring(i, p.length());
            perm(f + ch + e, up.substring(1));
        }
    }

    static ArrayList<String> permStrings(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> answers = new ArrayList<String>();
            answers.add(p);
            return answers;
        }

        char ch = up.charAt(0);

        ArrayList<String> subs = new ArrayList<String>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String e = p.substring(i, p.length());
            subs.addAll(permStrings(f + ch + e, up.substring(1)));
        }

        return subs;
    }
}