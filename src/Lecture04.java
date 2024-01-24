/*
Lecture 04
London Paris
*/
import java.util.*;

public class Lecture04 {
    public static void printStrings(String s, int reps) {
        for (int print = 0; print < reps; print++) {
            System.out.print(s + " ");
        }
    }

    public static void printGrid(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(i + j * r + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Hello, world!");

        // SELF-CHECK PROBLEMS:
        // Note: you will need to put some of your answers inside a comments

        // Put your answer for #4 here:

        // NOTE: FIRST try to predict what the output will be WITHOUT actually running
        // the program
        // write down your answer here
        // 0
        // 2
        // 4

        // 0
        // 2
        // 4
        // 6
        // 8
        // 10
        // 12
        // 14

        // 0
        // 2
        // 4
        // 6
        // 8
        // 10
        // 12
        // 14
        // 16
        // 18
        // 20
        // 22
        // 24

        // NEXT run the program and see the results (you can copy-and-paste it here)
        // (I'm not including it in the starter project so that people don't just run
        // it as the first thing they do :) )
        // 1
        // 3
        // 5

        // 1
        // 3
        // 5
        // 7
        // 9
        // 11
        // 13
        // 15

        // 1
        // 3
        // 5
        // 7
        // 9
        // 11
        // 13
        // 15
        // 17
        // 19
        // 21
        // 23
        // 25

        // LASTLY compare the two results and if they're different go back and figure
        // out
        // why the computer's output is different from what you predicted.

        // I did my order of operations incorrectly by subtracting first.

        // Put your answer for #10 here:
        // NOTE: You'll need to write the method on, say, line 2
        // (i.e., outside of this main() method)
        // and then call that method right here
        printStrings("abc", 5);
        System.out.println();

        // Put your answer for #14 here:
        // (Do this like #4 - predict, write your prediction, run the code, then explain
        // any differences)

        // 4 0
        // 1 2 3
        // 1 2
        // 1 2 3
        // 3 1
        // 1 2 3

        // I found out that the mystery function modifies local variables

        // Put your answer for #22A here:
        // 34.50

        // Put your answer for #22B here:
        // 6.0

        // Put your answer for #22C here:
        // error

        // Put your answer for #22D here:
        // error

        // Put your answer for #22E here:
        // error

        // Put your answer for #22F here:
        // error

        // Put your answer for #22G here:
        // error

        // Put your answer for #22H here:
        // 645.0

        // Put your answer for #24 here:
        Scanner input = new Scanner(System.in);
        System.out.println("What is the high?");
        int high = input.nextInt();
        System.out.println("What is the low?");
        int low = input.nextInt();

        // EXERCISES:

        // Put your answer for #5 here:
        printGrid(4, 6);



        // UNIT TESTS:

        System.out.println("\n");
        System.out.println("Unit tests start here:");

        testPrintStringsHi3Times();
        testPrintStringsAbc5Times();
        testPrintStringsAbc10Times();

        testPrintGrid1x5();
        testPrintGrid4x5();
        testPrintGrid4x6();

    }

    // TEST METHODS:
    public static void testPrintStringsHi3Times() {
        System.out.println("START OF TEST: testPrintStringsHi3Times");
        printStrings("hi", 3);
        System.out.println("END OF TEST: testPrintStringsHi3Times");

        // Correct (expected) output:
        // hi hi hi
    }

    public static void testPrintStringsAbc5Times() {

        System.out.println("START OF TEST: testPrintStringsAbc5Times");
        printStrings("abc", 5);
        System.out.println("END OF TEST: testPrintStringsAbc5Times");

        // Correct (expected) output:
        // abc abc abc abc abc
    }

    public static void testPrintStringsAbc10Times() {
        System.out.println("START OF TEST: testPrintStringsAbc10Times");
        printStrings("abc", 10);
        System.out.println("END OF TEST: testPrintGrid4x5");

        // Correct (expected) output:
        // abc abc abc abc abc abc abc abc abc abc
    }

    public static void testPrintGrid1x5() {
        System.out.println("START OF TEST: testPrintGrid1x5");
        printGrid(1, 5);
        System.out.println("END OF TEST: testPrintGrid1x5");

        // Correct (expected) output:
        // 1 2 3 4 5
    }

    public static void testPrintGrid4x5() {
        System.out.println("START OF TEST: testPrintGrid4x5");
        printGrid(4, 5);
        System.out.println("END OF TEST: testPrintGrid4x5");

        // Correct (expected) output:
        // 1 5 9 13 17
        // 2 6 10 14 18
        // 3 7 11 15 19
        // 4 8 12 16 20
    }

    public static void testPrintGrid4x6() {
        System.out.println("START OF TEST: testPrintGrid4x6");
        printGrid(4, 6);
        System.out.println("END OF TEST: testPrintGrid4x6");

        // Correct (expected) output:
        // 1 5 9 13 17 21
        // 2 6 10 14 18 22
        // 3 7 11 15 19 23
        // 4 8 12 16 20 24
    }
}
