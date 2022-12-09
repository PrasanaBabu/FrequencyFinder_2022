package org.ford;

import java.util.HashMap;
import java.util.Map;

public class NumberFrequencyProvider implements FrequencyProvider {
    public int counted;
    @Override
    public  int[] findFrequency(int numbers[]){
        int [] frequency = new int [numbers.length];
        counted = -1;
        for(int i = 0; i < numbers.length; i++){
            int count = 1;
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    count++;
                    frequency[j] = counted;
                }
            }
            if(frequency[i] != counted)
                frequency[i] = count;

        }
        return frequency;
    }
}
