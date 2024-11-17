package Array.BasicExplaination;

public class program1 {
    public static void main (String[] args){
        int[] myArray = new int[5];
        myArray[0]=89;
        myArray[1]=9;
        myArray[2]=56;
        myArray[3]=34;
    System.out.println(myArray[2]);
    // OR We can create Array like this
        System.out.println("Or we can create Array like this");
        int[] myArr = {9,86,47,5,15};
        System.out.println(myArr[2]);
        System.out.println(myArr[3]);
        //Suppose if we don't know the length of the array the how to print full array.
        System.out.println("Array myNum");
        int[] mynum = {4,85,69,2};
        int index = 0;
        while(index<mynum.length){
            System.out.println(mynum[index]);
            index++;
        }
    }

}
