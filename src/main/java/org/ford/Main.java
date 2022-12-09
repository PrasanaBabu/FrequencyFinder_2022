package org.ford;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sizeOfArray;
        int counted;
        Scanner sc=new Scanner(System.in);
        NumberFrequencyProvider numberFrequency=new NumberFrequencyProvider();
        System.out.println("Enter number of elements to find frequency:");
        sizeOfArray=sc.nextInt();
        int frequency[]=new int[sizeOfArray];
        System.out.println("Enter Elements to find Frequency:");
        int numbers[]=new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++)
        {
            numbers[i]= sc.nextInt();
        }
        //displaying
        frequency=numberFrequency.findFrequency(numbers);
        counted=numberFrequency.counted;
        displayFrequencyOfNumbers(numbers,frequency,counted);



    }
    public static void displayFrequencyOfNumbers(int numbers[],int frequency[], int counted)
    {
        for(int i = 0; i < frequency.length; i++){
            if(frequency[i] != counted)
                System.out.println("Element: "+numbers[i] + " Frequency: " + frequency[i]);
        }
    }

}
