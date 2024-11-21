//Create a Program to merge two Sorted arrays.
package Array.Challenges.Task8;

public class mergeTwoSortedArray {
    public static void main(String[] args){
        System.out.println("Welcome to merge Sorted Array");
        int[] arr1 = MergeUtility.inputArray();
        int[] arr2 = MergeUtility.inputArray();
        int[] mergeArray = merge(arr1, arr2);
        System.out.println("Your merged Array is: ");
        MergeUtility.displayArr(mergeArray);
    }
    public static int[] merge(int[] arr1, int[] arr2){
        int newSize = arr1.length+ arr2.length;
        int[] newArray = new int[newSize];
        int i = 0, j = 0, k=0;
        while (i< arr1.length || j< arr2.length){
            if(j== arr2.length || (i<arr1.length && arr1[i]<arr2[j])){
                newArray[k]=arr1[i];
                i++;
                k++;
            }else {
                newArray[k]=arr2[j];
                k++;
                j++;
            }

        }
        return newArray;
    }
}
