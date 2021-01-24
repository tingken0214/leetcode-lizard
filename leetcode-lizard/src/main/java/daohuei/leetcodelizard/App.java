package daohuei.leetcodelizard;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Definition for singly-linked list.
 */

public class App {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            ListNode ptr = this;
            String repr = Integer.toString(this.val);
            while (ptr.next != null) {
                ptr = ptr.next;
                repr = repr + " -> " + Integer.toString(ptr.val);
            }
            return repr;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode();
        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        ListNode ans = dummyHead;
        int carry = 0;
        while (ptr1 != null || ptr2 != null) {
            int val1 = 0;
            int val2 = 0;
            if (ptr1 != null) {
                val1 = ptr1.val;
                ptr1 = ptr1.next;
            }
            if (ptr2 != null) {
                val2 = ptr2.val;
                ptr2 = ptr2.next;
            }
            int sum = val1 + val2 + carry;
            ans.next = new ListNode(sum % (10));
            ans = ans.next;
            carry = sum / (10);
        }
        if (carry != 0) {
            ans.next = new ListNode(carry);
        }

        return dummyHead.next;
    }

    public static int reverse(int x) {
        int result = 0;
        int prev = 0;
        while (x != 0) {
            prev = result;
            result = result * 10 + x % 10;
            x /= 10;
            if (result / 10 != prev) {
                return 0;
            }
        }
        return result;
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complimentMap = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            // check if the current number has already appeared and matched one of the
            // compliments.
            if (complimentMap.containsKey(nums[i])) {
                // if so, this is the answer
                res[0] = complimentMap.get(nums[i]);
                res[1] = i;
                // here return the answer
                return res;
            }
            // get the compliment for each number
            int compliment = target - nums[i];
            // put into the map with key: compliment value and value: its index.
            complimentMap.put(compliment, i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("I am a lizard which can help you pass the interview.\n");

        // int[] answer1 = twoSum(new int[] { 2, 7, 11, 15 }, 9);
        // // Output: [0,1]
        // // Output: Because nums[0] + nums[1] == 9, we return [0, 1].
        // System.out.println(Arrays.toString(answer1));

        // answer1 = twoSum(new int[] { 3, 2, 4 }, 6);
        // // Output: [1,2]
        // System.out.println(Arrays.toString(answer1));

        // answer1 = twoSum(new int[] { 3, 3 }, 6);
        // // Output: [0,1]
        // System.out.println(Arrays.toString(answer1));

        // ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        // ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        // ListNode answer2 = addTwoNumbers(l1, l2);
        // System.out.println(answer2);
        // l1 = new ListNode(0);
        // l2 = new ListNode(0);
        // answer2 = addTwoNumbers(l1, l2);
        // System.out.println(answer2);
        // l1 = new ListNode(9,
        // new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new
        // ListNode(9, new ListNode(9)))))));
        // l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        // answer2 = addTwoNumbers(l1, l2);
        // System.out.println(answer2);
        int input7, output7;
        // Example 1:
        // Input: x = 123
        // Output: 321
        input7 = 123;
        output7 = reverse(input7);
        System.out.println(output7);
        // Example 2:
        // Input: x = -123
        // Output: -321
        input7 = -123;
        output7 = reverse(input7);
        System.out.println(output7);
        // Example 3:
        // Input: x = 120
        // Output: 21
        input7 = 120;
        output7 = reverse(input7);
        System.out.println(output7);
        // Example 4:
        // Input: x = 0
        // Output: 0
        input7 = 0;
        output7 = reverse(input7);
        System.out.println(output7);

        input7 = 1534236469;
        output7 = reverse(input7);
        System.out.println(output7);
    }
}