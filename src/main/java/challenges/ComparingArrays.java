package challenges;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparingArrays {

    public static void main(String[] args) {

        int[] arrayA = {4, 8 , 6, 7, 9};
        int[] arrayB = {4, 3, 2, 8, 10};
        List<Integer> notInBoth = new ArrayList<>();
        // questions to consider:
        // Are the arrays the same size?
        for(int i = 0; i < arrayA.length; i++) {
            notInBoth.add(arrayA[i]);
            notInBoth.add(arrayB[i]);
        }
        for(int j = 0; j < notInBoth.size() - 1; j++) {
            Collections.sort(notInBoth);
            System.out.println(notInBoth);
            if(notInBoth.get(j) == notInBoth.get(j + 1)) {
                notInBoth.remove(j + 1);
                notInBoth.remove(j);
            }
        }
        Integer[] lastArray = new Integer[notInBoth.size()];
        lastArray = notInBoth.toArray(lastArray);
        System.out.println(notInBoth);
        System.out.println(Arrays.toString(lastArray));

        //messing with pointers
        int[] arrayC = {4, 8 , 6, 7, 9};
        int[] arrayD = {4, 3, 2, 8, 10};
        List<Integer> notInBoth2 = new ArrayList<>();

        int pointerC = 0;
        int pointerD = arrayD.length -1;

    }
}
