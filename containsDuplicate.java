import java.util.*;

class Solution {

    /*  
     * link for the question: 
     * https://leetcode.com/problems/contains-duplicate/submissions/817693370/
    */

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet();
        for(int x:nums){
            if(!hs.contains(x))
                hs.add(x);
            else
                return true;
        }
        return false;
    }
}