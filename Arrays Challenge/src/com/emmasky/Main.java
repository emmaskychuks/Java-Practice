package com.emmasky;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
	    int[] intArray = getIntegers(10);
	    intArray = sortArray(intArray);
	    print(intArray);
    }

    public static int[] getIntegers(int arrayLength)
    {
        System.out.println("Enter " + arrayLength + " Integer Values: \r");
        int tempIntArray[] = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++)
        {
            tempIntArray[i] = scanner.nextInt();
        }
        return tempIntArray;
    }

    public static int[] sortArray(int[] integerArray)
    {
        int temp;
        int[] intArray = integerArray;
        for(int i = 0; i < intArray.length - 1; i++)
        {
            for(int j = i + 1; j < intArray.length; j++)
            {
                if(intArray[i] < intArray[j])
                {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        return intArray;
    }

    public static void print(int[] intArray)
    {
        for (int value:
             intArray)
        {
            System.out.println(value);
        }
    }
}
