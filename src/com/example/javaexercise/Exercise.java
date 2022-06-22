package com.example.javaexercise;

import com.example.javaexercise.exercise.StringExercise;

public class Exercise {
    public static void main (String[] args) {
        StringExercise stringExerciseObject = new StringExercise();
        System.out.println(stringExerciseObject.reverse("this is javatpoint"));
        System.out.println(stringExerciseObject.isPalindrome("asd"));
        System.out.println(stringExerciseObject.capitalizeFirstWord("this is javatpoint"));
        System.out.println(stringExerciseObject.reverseEachWord("this is javatpoint"));
        System.out.println(stringExerciseObject.toggle("this is javatpoint"));
        System.out.println(stringExerciseObject.reverseToggle("this is javatpoint"));
        System.out.println(stringExerciseObject.isAnagram("motorcycle", "Leyccoortm"));
        System.out.println(stringExerciseObject.percentages("India is my country 100%"));
        System.out.println(stringExerciseObject.duplicates("Nasdasdino"));
        System.out.println(stringExerciseObject.removeWhiteSpace("I am the   best      one hh"));
        System.out.println(stringExerciseObject.isRotation("javaava", "avajava"));
        System.out.println(stringExerciseObject.countWords("    India Is   . My Country   "));
        System.out.println(stringExerciseObject.reversePreserve("India Is my country"));
        System.out.println(stringExerciseObject.swap("Love", "You"));
        System.out.println(stringExerciseObject.removeChar("India is my country", 7));

    }
}
