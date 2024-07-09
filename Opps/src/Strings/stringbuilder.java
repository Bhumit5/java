package Strings;

public class stringbuilder {

    public static void main(String[] args) {

        //* It is mutable
        //* It is not thread safe

        StringBuilder series = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i); //? Everytime it will not create new object, it will modify the original string
            series.append(ch + " ");
        }

        System.out.print(series.toString());
    }
}
