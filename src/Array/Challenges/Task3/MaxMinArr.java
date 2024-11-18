//Create a program to find the maximum and minimum element in an array.
package Array.Challenges.Task3;

import Array.Challenges.Task3.MaxMinArrUtility.MaxMinArrUtility;

public class MaxMinArr {
    public static void main(String[] args){
        System.out.println("Welcome to Max and Min Finder");
        int[] numArray = MaxMinArrUtility.inputArray();
        int Max = max(numArray);
        int Min = min(numArray);
        System.out.println("Max of the Array is: "+Max);
        System.out.println("Min of the Array is: "+Min);
    }
    public static int max(int[] numArray){
        if(numArray.length==0){
            return Integer.MIN_VALUE;
        }
        int max = numArray[0];
        int i = 1;
        while(i<numArray.length){
            if(max< numArray[i]){
                max = numArray[i];
            }
            i++;
        }
        return max;
    }
    public static int min(int[] numArray){
        if(numArray.length==0){
            return Integer.MAX_VALUE;
        }
        int min = numArray[0];
        int i = 1;
        while(i<numArray.length){
            if(min>numArray[i]){
                min=numArray[i];
            }
            i++;
        }
        return min;
    }
}
