package Strings;
import java.text.DecimalFormat;
import java.util.Random;
public class stringbuffer {
    public static void randomString(int length){
        Random ran = new Random();
        StringBuffer buffer = new StringBuffer(length);
        while(length != 0){
            char ch = (char)( 65 + ran.nextFloat()*57);
            buffer.append(ch);
            length--;
        }

        System.out.println(buffer);
    }

    public static void main(String[] args) {

        //* Constructor 1 - with empty string
        StringBuffer sb = new StringBuffer();
        System.out.println("Capacity : " + sb.capacity());
        sb.append("Cool");

        //* Constructor 2 - with string
        StringBuffer sb1 = new StringBuffer("Patel Bhumit");

        //* Constructor 3 - with capacity [ By default - 16 ]
        StringBuffer sb2 = new StringBuffer(30);


        System.out.println(sb);

        sb.append(" Car");
        sb.insert(4, " jazzy");

        String str = sb.toString();
        System.out.println(str);

        /* *
         * StringBuffer is mutable sequence of characters
         * Efficient
         * Thread safe - One thread at a time
         * By default capacity is 16 characters
         * */

        randomString(12);

        String st = "Hi    my   name is Bhumit  Patel";
//        st.replaceAll("\\s","");
        System.out.println(st.replaceAll("\s",""));

        DecimalFormat df = new DecimalFormat("0.00000");
        System.out.println(df.format(7.22));


    }
}
