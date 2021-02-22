/*
 * Author: @ballm06m06
 * Qusetion: Reverse Integer
 * Description: Given a signed 32-bit integer x, return x with its digits reversed. 
 *              If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], 
 *              then return 0.
 *
 *   Time Complexity:  O(logn) ???
 *   Space Complexity: O(1)
 */

public class ReverseInteger {
    public int reverse(int x) {
        //declare long cuz it's 64bit, while int is 32bits, 
        //so if we use int, it'll definitely overflow
        long reverse=0;
        
        while(x != 0){
            int remainder = x % 10;
            x = x/10;
            reverse =  reverse*10 + remainder;
        }
        
        //if it's overflow
        if(reverse >= Integer.MAX_VALUE || reverse <= Integer.MIN_VALUE)
            return 0;
        
        return (int)reverse;
        
    }
}
