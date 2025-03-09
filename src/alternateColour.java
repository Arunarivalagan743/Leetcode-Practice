//
//3208. Alternating Groups II
//        Solved
//        Medium
//        Topics
//        Companies
//        Hint
//
//        There is a circle of red and blue tiles. You are given an array of integers colors and an integer k. The color of tile i is represented by colors[i]:
//
//        colors[i] == 0 means that tile i is red.
//        colors[i] == 1 means that tile i is blue.
//
//        An alternating group is every k contiguous tiles in the circle with alternating colors (each tile in the group except the first and last one has a different color from its left and right tiles).
//
//        Return the number of alternating groups.
//
//        Note that since colors represents a circle, the first and the last tiles are considered to be next to each other.
//
//
//
//        Example 1:
//
//        Input: colors = [0,1,0,1,0], k = 3
//
//        Output: 3


import java.util.*;

public class alternateColour {
    public int numberOfAlternatingGroups(int[] a, int k) {
        int arr[] = Arrays.copyOf(a, a.length + k-1);
        System.arraycopy(a, 0, arr, a.length, k-1);
        int temp = 1;
        int count = 0;
        for(int i = 0; i < arr.length-1; i++)
        {
            if(arr[i] != arr[i+1])
            {
                temp++;
                if(temp == k) {
                    count++;
                    temp--;
                }
            }
            else
            {
                temp = 1;
            }
        }
        return count;
    }
}