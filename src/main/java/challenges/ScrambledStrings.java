package challenges;

import java.nio.charset.Charset;
import java.util.Arrays;

public class ScrambledStrings {

    public static void main(String[] args) {

        String string1 = "hetllo";
        String string2 = "olephl";

        char[] charString1 = string1.toCharArray();
        char[] charString2 = string2.toCharArray();
        int count = 0;
        Arrays.sort(charString1);
        Arrays.sort(charString2);

        System.out.println(charString1);
        System.out.println(charString2);

        for(int i = 0; i < charString1.length; i++) {
            if(charString1[i] == charString2[i]) {
                count ++;
                continue;
            } else {
                System.out.println("Strings are not the same");
            }
        }

        if(count == charString1.length) {
            System.out.println("Strings are the same");
        }

    }
}
