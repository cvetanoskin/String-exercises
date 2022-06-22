package com.example.javaexercise.exercise;

import java.util.*;

public class StringExercise {
    private String originalString;

    public StringExercise() {}
    public StringExercise(String originalString) {
        this.originalString = originalString;
    }

    public String getOriginalString() {
        return this.originalString;
    }

    public void setOriginalString(String originalString) {
        this.originalString = originalString;
    }

    public String reverse(String originalString) {
        StringBuilder reverseString = new StringBuilder();
        char[] originalStringAsChar = originalString.toCharArray();
        for (int i = originalStringAsChar.length - 1; i >= 0; i--) {
            reverseString.append(originalStringAsChar[i]);
        }
        return reverseString.toString();
    }

    public boolean isPalindrome(String originalString) {
//        StringBuilder palindrome = new StringBuilder();
//        char[] originalStringAsChar = originalString.toCharArray();
//        for (int i = 0; i < originalStringAsChar.length / 2; i++) {
//            if (originalStringAsChar[i] != originalStringAsChar[originalStringAsChar.length - i - 1]) {
//                return false;
//            }
//        }
//        return true;

        //or
        StringBuilder sb = new StringBuilder(originalString);
        sb.reverse();
        return sb.toString().equals(originalString);
    }

    public String capitalizeFirstWord(String str) {
        String[] strSplit = str.split(" ");
        StringBuilder resultString = new StringBuilder();
//        for (int i = 0; i < strSplit.length; i++) {
//            char firstLetter = strSplit[i].charAt(0);
//            resultString.append(Character.toString(firstLetter).toUpperCase()).append(strSplit[i].substring(1)).append(" ");
//        }
//        return resultString.toString();

        for (String s : strSplit) {
            String firstLetter = s.substring(0, 1);
            String lettersAfterFirst = s.substring(1);
            resultString.append(firstLetter.toUpperCase()).append(lettersAfterFirst).append(" ");
        }
        return resultString.toString();
    }

    public String reverseEachWord(String str) {
        String[] strSplit = str.split(" ");
        StringBuilder resultString = new StringBuilder();
        for (String s : strSplit) {
            StringBuilder word = new StringBuilder(s);
            resultString.append(word.reverse()).append(" ");
        }
        return resultString.toString();
    }

    public String toggle(String str) {
        String[] strSplit = str.split(" ");
        StringBuilder resultString = new StringBuilder();
        for (String s : strSplit) {
            String firstLetter = s.substring(0, 1);
            String lettersAfterFirst = s.substring(1);
            resultString.append(firstLetter.toLowerCase()).append(lettersAfterFirst.toUpperCase()).append(" ");
        }
        return resultString.toString();
    }

    public String reverseToggle(String str) {
        String[] strSplit = str.split(" ");
        StringBuilder resultString = new StringBuilder();
        for (String s : strSplit) {
            StringBuilder reverseString = new StringBuilder(s).reverse();
            String firstLetter = reverseString.substring(0, 1);
            String lettersAfterFirst = reverseString.substring(1);
            resultString.append(firstLetter.toLowerCase()).append(lettersAfterFirst.toUpperCase()).append(" ");
        }
        return resultString.toString();
    }

    public boolean isAnagram(String str1, String str2) {
        String s1 = str1.replaceAll(" ", "");
        String s2 = str2.replaceAll(" ", "");
        if (s1.length() != s2.length()) {
            return false;
        } else {
            char[] arr1 = s1.toLowerCase().toCharArray();
            char[] arr2 = s2.toLowerCase().toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        }
    }

    public String percentages(String str) {
        int upperCounter = 0, lowerCounter = 0, digitCounter = 0, otherCounter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digitCounter++;
            } else if (Character.isLetter(str.charAt(i))) {
                if (Character.isUpperCase(str.charAt(i))) {
                    upperCounter++;
                } else if (Character.isLowerCase(str.charAt(i))) {
                    lowerCounter++;
                }
            } else {
                otherCounter++;
            }
        }
        double upperPercentage = (upperCounter * 100) / str.length();
        double lowerPercentage = (lowerCounter  * 100) / str.length();
        double digitPercentage = (digitCounter  * 100) / str.length();
        double otherPercentage = (otherCounter  * 100) / str.length();
        return "upper: " + upperPercentage + "% lower: " + lowerPercentage + "% digit: " + digitPercentage + "% other: " + otherPercentage + "%";
    }

    public String duplicates(String str) {
//        char[] duplicateChars = new char[str.length()];
//        int counter = 0;
//        String lowerString = str.toLowerCase();
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = i + i; j < str.length(); j++) {
//                if (str.charAt(i) == str.charAt(j)) {
//                    duplicateChars[counter] = lowerString.charAt(i);
//                    counter++;
//                }
//            }
//        }
//        return new String(duplicateChars).trim();

        HashMap<Character, Integer> duplicates = new HashMap<>();
        char[] duplicatesArr = new char[str.length()];
        int counter = 0;
        String lowerCaseStr = str.toLowerCase();

        for (int i = 0; i < lowerCaseStr.length(); i++) {
            if (duplicates.containsKey(str.charAt(i))) {
                duplicates.put(lowerCaseStr.charAt(i), duplicates.get(lowerCaseStr.charAt(i)) + 1);
            } else {
                duplicates.put(lowerCaseStr.charAt(i), 1);
            }
        }
        for (Character character : duplicates.keySet()) {
            if (duplicates.get(character) > 1) {
                duplicatesArr[counter] = character;
                counter++;
            }
        }

        return String.valueOf(duplicatesArr).trim();

    }

    public String removeWhiteSpace(String str) {
//        String[] strSplit = str.split(" ");
//        StringBuilder sb = new StringBuilder();
//        for (String s : strSplit) {
//            sb.append(s);
//        }
//        return sb.toString();

        //or
        return str.replaceAll(" ", "");
    }

    public boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        StringBuilder sb = new StringBuilder(str1);
        return sb.append(str1).toString().contains(str2);
    }

    public int countWords(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                if ((i + 1 < str.length() && str.charAt(i + 1) == ' ') || i == str.length() - 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public String reversePreserve(String str) {
        char[] inputArray = str.toCharArray();
        char[] result = new char[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                result[i] = ' ';
            }
        }

        int j = result.length - 1;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != ' ') {
                if (result[j] == ' ') {
                    j--;
                }
                result[j] = inputArray[i];
                j--;
            }
        }
        return String.valueOf(result);
    }

    public String swap(String str1, String str2) {
//         str1 = "LOVE";
//         str2 = "YOU";
        str1 = str1 + str2; //LOVEYOU
        str2 = str1.substring(0, str1.length() - str2.length()); //LOVE
        str1 = str1.substring(str2.length()); //YOU

        return str1 + str2;
    }

    public String removeChar(String str, int position) {
//        String result = "";
//        for (int i = 0; i < str.length(); i++) {
//            if (i != position) {
//                result = result + str.charAt(i);
//            }
//        }
//        return result;

        return str.substring(0, position) + str.substring(position + 1);
    }

}
