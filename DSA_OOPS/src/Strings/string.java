package Strings;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class string {
    /* *
    * String objects will store in String Pool
    * So different variables having similar values will point to same object
    * Pool is separate area for storing values inside it - Provide more optimization
    * Immutable We can't Change / Modify the value
    * */

    public static void main(String[] args) {
        String name = "Bhumit";
        System.out.println(name); //? Print : Bhumit

        name = "Patel";
        //* It will create a new object and reference to it and the old one will be discarded by garbage collector
        System.out.println(name); //? Print : Patel

        //* Both will point to same object
        String a = "Hero";
        String b = "Hero";

        /* *
         * == operator is called comparator
         * It will compare the reference and outputs the answer
         *
         * obj1.equals(obj2) It will check only values
         * */

        System.out.println(a == b); //? Print : true
        System.out.println(a.equals(b)); //? Print : true


        //* Both will point to different object    =>  Create objects in heap
        String aa = new String("Hero");
        String bb = new String("Hero");

        System.out.println(aa == bb); //? Print : false
        System.out.println(aa.equals(bb)); //? Print : true


        //* When we print anything using System.out.println it prints the String

        System.out.println(Arrays.toString(new int[]{1, 2, 1, 3, 1, 5}));


        float num = 15.456321f;
        //* printf - print formatted
        System.out.printf("The formatted number is %.3f", num); //? Print : 15.456

        String series = "";
        for (int i = 0; i < 26; i++) {
            series += (char)('a' + i) + " "; //! Everytime it creates new object, which is waste of memory
        }

        System.out.print("\n" + series);

    }
}