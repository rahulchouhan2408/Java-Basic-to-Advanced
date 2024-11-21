// Create a Program to check is the array is Palindrome or not.
package Array.Challenges.Task7;

public class PalindromeArray {
    public static void main(String[] args){
        System.out.println("Welcome to Palindrome Checker");
        int[] numArray = PalindromeArrayUtility.inputArray();
        boolean isPalin = isPalindrome(numArray);
        if(isPalin){
            System.out.println("Your Array is Palindrome");
        }else {
            System.out.println("Your Array is not palindrome.");
        }
    }
    public static boolean isPalindrome(int[] numArray){
        int i = 0;
        while (i< numArray.length/2){
            if(numArray[i] != numArray[numArray.length-1-i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
