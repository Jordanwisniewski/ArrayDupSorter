package com.company;
import java.util.Arrays;
import java.util.LinkedHashSet;


public class RemoveDuplicateExample {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        //Array with duplicate elements
        Integer[] numbers = new Integer[] {	1, 1, 2 };

        //This array has duplicate elements
        System.out.println( Arrays.toString(numbers) );

        //Create set from array elements
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(numbers) );

        //Get back the array without duplicates
        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});

        //Verify the array content
        System.out.println( Arrays.toString(numbersWithoutDuplicates) );
    }
}