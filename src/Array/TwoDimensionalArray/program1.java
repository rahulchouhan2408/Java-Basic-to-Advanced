package Array.TwoDimensionalArray;

public class program1 {
    public static void main(String[] args){
        int[][] myArray = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(myArray[1].length);
        System.out.println("Now we print full 2D Array");
        int i = 0;
        while (i< myArray.length){
            int j = 0;
            while (j<myArray[i].length){
                System.out.print(myArray[i][j]+ " ");
                j++;
            }
            System.out.println();
        i++;
        }
    }
}
