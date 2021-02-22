/*
 * Author: @ballm06m06
 * Qusetion: Reverse String
 * Description: Write a function that reverses a string. The input string is given as an array of characters char[].
 *              Do not allocate extra space for another array, you must do this by modifying the input array 
 *              in-place with O(1) extra memory.
 * 
*/

// Using two-pointer technique
// Time Complexity: O(n), Space Complexity: O(1)
public class ReverseString {
    public void reverseString(char[] s) {
        
        int j = s.length-1;
        
        for(int i = 0; i<s.length/2; i++){
            char tmp = s[i]; 
            s[i] = s[j];
            s[j--] = tmp;
        }
    }
}
