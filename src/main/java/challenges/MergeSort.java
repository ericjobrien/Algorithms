package challenges;

import java.util.Arrays;

public class MergeSort {

    /*
    Functionality to merge sorted arrays:
    if(myArray.length == 1) {
        return;
    }
        leftHalf = MergeSort (left half of myArray)
        rightHalf = MergeSort (right half of myArray)

        resultArray = Sort both halves {
            2 cursors
            for each new element, add the smallest cursor element to the result array, and iterate
            the used cursor, until one of the halves has been fully used
            Once one side of the merge has been expended,
            we iterate through the remaining half and add all the elements



     */
    public static int[] mergeSort(int[] arr){
        if(arr.length == 1) {
            return arr;
        }
        int[] leftHalf = new int[arr.length/2];
        int[] rightHalf = new int[arr.length - (arr.length /2)];
        for(int i = 0; i < arr.length/2; i++) {
            //copy left half over
            leftHalf[i] = arr[i];
        }
        for(int j = arr.length/2; j < arr.length; j++){
            //copy right half over
            rightHalf[j - arr.length/2] = arr[j];

        }
        System.out.println("Starting merge Left " + Arrays.toString(leftHalf));
        leftHalf = mergeSort(leftHalf);
        System.out.println("Starting merge Right " + Arrays.toString(rightHalf));
        rightHalf = mergeSort(rightHalf);

        arr = combineArrays(leftHalf, rightHalf);
        return arr;
    }

    public static int[] combineArrays(int[] a, int[] b) {
        int[] newArr = new int[a.length + b.length];

        int cursorA = 0;
        int cursorB = 0;

        while(cursorA < a.length && cursorB < b.length) {
            if(a[cursorA] < b[cursorB]) {
                newArr[cursorA + cursorB] = a[cursorA];
                System.out.println("Adding " + a[cursorA] + " from left array");
                cursorA ++;

            } else {
                newArr[cursorA + cursorB] = b[cursorB];
                System.out.println("Adding " + b[cursorB] + " from right array");
                cursorB ++;
            }

        }

        while(cursorA < a.length) {
            newArr[cursorA + cursorB] = a[cursorA];
            System.out.println("Adding " +a[cursorA] + " from left array");
            cursorA ++;
        }

        while(cursorB < b.length) {
            newArr[cursorA + cursorB] = b[cursorB];
            System.out.println("Adding " + b[cursorB] + " from right array");
            cursorB ++;
        }

        return newArr;
    }

    public static void printIntArr(int[] arr) {
        for(int i =0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] a = {0, 2, 4, 9, 8};
        int[] b = {1, 3, 5, 7, 6};
//        int[] result = combineArrays(a, b);
        int[] c = {9, 2, 7, 8, 6, 10, 3, 2, 1, 8, 4};
        System.out.print("C array: ");
        printIntArr(c);
        int[] result = mergeSort(c);
        System.out.print("Result: ");
        printIntArr(result);
    }

}
