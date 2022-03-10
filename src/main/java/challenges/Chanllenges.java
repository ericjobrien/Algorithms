package challenges;

public class Chanllenges {

    public static void main(String[] args) {

        //print an unsorted array in a 2d array
        Integer[] myArr = {0, 3, 2, 1, 8, 5, 6, 7, 4, 9, 10, 11};
        Integer[][] myArrSquared = new Integer[3][4]; //this is stipulating 3 X 4 numbers - 3 arrays, 4 numbers each

        for(int i = 0; i < myArr.length; i++) {
            myArrSquared [ i / 4 ] [ i % 4] = myArr[i];
        }
        for(int i = 0; i < myArrSquared.length; i++) {
            for(int j = 0; j < myArrSquared[i].length; j++) {
                //you may have seen this before, but we have print and println
                //meaning println adds a new line character
                System.out.print(myArrSquared[i][j]);
            }
            System.out.print("\n");
        }

        // String Manipulation
        /*
        best string methods:
        charAt(integer of index)

        find index of character:
        remember that chars use single quotes - indexOf(char ' ')

        with substrings: the first index is inclusive and 0 indexed
        and the last index is exclusive
        str=substring(integer of last index)
        str=substring(integer of first index, integer of last index)

        split: turns a string into an array of strings using some string
        (usually space) to separate the string
        split(string to split with, usually " "

        str= str.toUpperCase()
        str= str.toLowerCase()
         */

        String aString = "abc123";
        System.out.println("char at index 1 of " + aString + ": " + aString.charAt(1));
        System.out.println("index of '1': " + aString.indexOf('1'));
        System.out.println("substring starting at index 4: " + aString.substring(4));
        System.out.println("substring index 3 to 5: " + aString.substring(3, 5));
        String[] aStringSplit = aString.split("c");
        for(int i =0; i < aStringSplit.length; i++){
            System.out.println(aStringSplit[i]);
        }

        /*
        Primitive Variable Manipulations, especially chars
         */

        int a = 0;
        double b = 2.2;
        //what will casting do in this situation?
        //it will actually truncate (round down) the double b
        //especially in cases where whole numbers are expected, but you have a double
        a = (int) b;
        System.out.println(Math.floor(2.2));
        System.out.println(Math.ceil(2.2));
        System.out.println(Math.round(2.2));

        /*
        CHARS:
        chars, even though they appear as characters, they are actually numbers
        meaning, we can modify chars numerically
         */
        System.out.println("Printing a as int " + (int) 'a');
        System.out.println("Printing a + 5 as int " + (char) ('a' + 5));

        /*
        Math functions:
        POW, Floor, Ceil, Round, Max, Min, SQRT, Abs, Random (with no args, random returns a random double 0-1, and you can
        multiply this by x amount to get random number 0-x)

        ARRAYS:
        sort, AsList() (convert to collections list), toArray

        STREAMS:
        toStream(), filter(), map(), collect() -> asList()
         */

        /*
        Usually, file reading code is provided for you
        in which case, you can, depending on the type of file reader,
        iterate through it using
        a while loop with the condition (line = fileReader.nextLine());
        To convert a String that should be an int to int:
        int a = Integer.parseInt("5");
        otherwise you will get an error if you try a = "5";

        autoboxing/autounboxing happens automatically (as per the name)
        for converting Integer to int and vice versa for all primitive types
         */

        /*
        For general coding challenge advice:
        If a problem seems hard, always turn pseudocode - write out the steps to solving the problem
            kind of like how we may think of sorting or searching before we learned those algorithms
        and printing out the current state of whatever variable/array
        you are working on in any iteration of your logic

        As always, even if you can't solve the problem, submit *something* before the time is up
         */



    }
}
