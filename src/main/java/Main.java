import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();

        Integer[] numbers = new Integer[100];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100000);
        }

        System.out.println("Before " );//Arrays.toString(numbers));

        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("After " ); //Arrays.toString(numbers));
    }

    public static void selectionSort(Integer[] intArray) {
        //Selection sort
        for(int i = 0; i < intArray.length - 1; i++) {
            int smallest = intArray[i];
            int smallestIndex = i;
            for(int j = i + 1; j < intArray.length; j++) {

                smallest = intArray[j];
                if(intArray[j] < intArray[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            int temp = intArray[i];
            intArray[i] = intArray[smallestIndex];
            intArray[smallestIndex] = temp;
        }

    }

    public static int binarySearch(Integer[] arr, int val)  {

        //binary search
        //integers round down automatically
        int minIndex = 0;
        int maxIndex = arr.length;

        while(minIndex <= maxIndex) {

            int midIndex = (minIndex + maxIndex) /2;

            System.out.println("Searching mid index " + midIndex + "(" + arr[midIndex] + ")");
            if(arr[midIndex] == val) {
                return midIndex;
            } else if (arr[midIndex] > val) {
                //the number must be less than arr midIndex - so we search for everything between max and mid
                maxIndex = midIndex - 1;

            } else if (arr[midIndex] < val) {
                //the number must be greater than arr midIndex - so we search for everything between min and mid
                minIndex = midIndex + 1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(Integer[] arr, int val) {
        return binarySearchRecursiveHelper(arr, val, 0, arr.length);
    }

    public static int binarySearchRecursiveHelper(Integer[] arr, int val, int minIndex, int maxIndex) {
        int midIndex = (minIndex + maxIndex) / 2;
        if(arr[midIndex] == val) {
            return midIndex;
        } else if (minIndex > maxIndex) {
            return -1;
        } else if (arr[midIndex] > val) {
            maxIndex = midIndex - 1;
        } else if ( arr[midIndex] < val) {
            minIndex = midIndex + 1;
        }
        System.out.println("Calling a new recursion: min " + maxIndex + " max " + maxIndex);
        return binarySearchRecursiveHelper(arr, val, minIndex, maxIndex);
    }

    public static void mergeSort(Integer[] inputArray) { //O(log(n))
        int inputLength = inputArray.length;

        if(inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;
        Integer[] leftHalf = new Integer[midIndex];
        Integer[] rightHalf = new Integer[inputLength - midIndex];

        for(int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }

        for(int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(inputArray, leftHalf, rightHalf);
    }

    private static void merge(Integer[] inputArray, Integer[] leftHalf, Integer[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while(i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        while(j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }

    }
    public static void bubbleSort(Integer[] intArray) { //O(n^2)
        boolean swappedSomething = true;

        while(swappedSomething) {

            swappedSomething = false;
            for (int i = 0; i < intArray.length - 1; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swappedSomething = true;
                    int temp = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = temp;
                }
            }
        }
    }

    private static void quickSort(Integer[] numbers) { //O(n log(n))
        quickSort(numbers, 0, numbers.length - 1);
    }

    public static void quickSort(Integer[] numbers, int lowIndex, int highIndex){

        //choose a pivot
        //move all lower to the left then all higher to the right -- partitioning
        //recursive for the left and right subarrays

        if(lowIndex >= highIndex) {
            return;
        }

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = numbers[pivotIndex];
        swap(numbers, pivotIndex, highIndex);

        int leftPointer = partition(numbers, lowIndex, highIndex, pivot);

        quickSort(numbers, lowIndex, leftPointer - 1);
        quickSort(numbers, leftPointer + 1, highIndex);

    }

    private static void swap(Integer[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static int partition(Integer[] numbers, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer) {

            while(numbers[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while(numbers[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(numbers, leftPointer, rightPointer);
        }
        swap(numbers, leftPointer, highIndex);
        return leftPointer;
    }

    public void traverse() {

    }

}
