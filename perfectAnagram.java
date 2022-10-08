import java.util.*;

public class perfectAnagram {

    /*
     * Link for the problem:
     * https://leetcode.com/problems/valid-anagram/submissions/817710354/
     */

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    static public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }else{
            char[] s1;
            char t1[];
            s1 = s.toCharArray();
            t1 = t.toCharArray();
            Arrays.sort(s1);
            Arrays.sort(t1);
            return new String(s1).equals(new String(t1));
        }
    }
}
