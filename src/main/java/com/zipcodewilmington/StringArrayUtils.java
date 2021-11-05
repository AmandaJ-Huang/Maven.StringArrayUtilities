package com.zipcodewilmington;

import java.util.ArrayList;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverse = new String[array.length];
        int counter = 0;

        for (int i = 1; i <= array.length; i++) {
            reverse[counter] = array[array.length-i];
            counter++;
        }
        return reverse;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        for (int i = 0; i < array.length/2; i++) {
            if (array[i] != array[array.length-i-1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        //I want to compare each letter in the String array to the alphabet
        //Does the String array need to be converted to a char array?
        //while the current character in the alphabet array is not equal to the current char in the current string array index,
        //move onto the next alphabet letter (counter),
        //when a match is found, move onto the next character (2nd counter) in the current string index

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for(int i = 0; i < alphabet.length-1; i++) {
            int counter = 0;
            int charCounter = 0;
            for (int j = 0; j < array[j].length()-1; j++) {
                charCounter++;
                while(alphabet[counter] != array[j].toLowerCase().charAt(charCounter)) {
                    counter++;
                }
                return true;
            }
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        //if value matches the string in the current index of the array
        //increase the occurrences counter, move onto the next index
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                counter ++;
            } else if (array[i] != value) {
                continue;
            }
        }
        return counter;
    }

    /**
     * @param array array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] newArray = new String[array.length-1];
        int newArrayIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != valueToRemove) {
                newArray[newArrayIndex] = array[i];
                newArrayIndex++;
            } else if (array[i] == valueToRemove) {
                continue;
            }
            //loop 1 --> i=0, array[0] = "The" == "The", continues
            //loop 2 --> i=1, array[1] = "quick" != "The"
                // newArray[0] = "quick", newArrayIndex = 1;
            //loop 3 --> i=2, array[2] = "brown" != "The"
                // newArray[1] = "brown", newArrayIndex = 2;
            //etcetera
        }
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int counter = 0;
        int newArrayCounter = 0;

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == array[i+1]) {
                counter++;
            }
        }
        String[] newArray = new String[array.length-counter];

        for (int i = 0; i < array.length-1; i++) {
            if(array[i] != array[i+1]) {
                newArray[newArrayCounter] = array[i];
                newArrayCounter++;
            }
            newArray[newArrayCounter] = array[array.length-1];
        }
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        String[] newArray;
        String concat = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i-1]) {
                concat += array[i]; //"" + "a" = "a"
            } else {
                concat += " " + array[i];
            }
        }
        newArray = concat.split(" ");

        return newArray;
    }






//        for (int i = 0; i < array.length-1; i++) {
//            if (array[i] == array[i+1]) {
//                counter++;
//            }
//        }
//        for (int i = 0; i < array.length-1; i++) {
//            if(array[i] != array[i+1]) {
//                newArray[newArrayCounter] = array[i];
//                newArrayCounter++;
//            } else {
//                concat += array[i] + array[i+1];
//                newArray[newArrayCounter] = concat;
//            }
//if array[i] = array[i+1]
//then concat array[i] + array[i+1]
//if array[i] != array[i+1]
//newArray[index] = array[i]

}
