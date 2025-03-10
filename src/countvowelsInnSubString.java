//You are given a string word and a non-negative integer k.
//
//        Return the total number of
//
//        of word that contain every vowel ('a', 'e', 'i', 'o', and 'u') at least once and exactly k consonants.
//
//
//
//        Example 1:
//
//        Input: word = "aeioqq", k = 1
//
//        Output: 0
//
//        Explanation:
//
//        There is no substring with every vowel.
//
//        Example 2:
//
//        Input: word = "aeiou", k = 0
//
//        Output: 1
//
//        Explanation:
//
//        The only substring with every vowel and zero consonants is word[0..4], which is "aeiou".
//
//        Example 3:
//
//        Input: word = "ieaouqqieaouqq", k = 1
//
//        Output: 3
//
//        Explanation:
//
//        The substrings with every vowel and one consonant are:
//
//        word[0..5], which is "ieaouq".
//        word[6..11], which is "qieaou".
//        word[7..12], which is "ieaouq".



import java.util.*;
public class countvowelsInnSubString {
    public long countOfSubstrings(String word, int k) {
        if(word.length()<(5+k)){
            return 0;
        }
        return count(word,k)-count(word,k+1);
    }
    private long count(String word,int k){
        long ans=0;
        int cons=0,l=0;
        Map<Character,Integer> vowel=new HashMap<>();
        for(int r=0;r<word.length();r++){
            char ch=word.charAt(r);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowel.put(ch,vowel.getOrDefault(ch,0)+1);
            }
            else{
                cons++;
            }
            while(vowel.size()==5 && cons>=k){
                ans+=word.length()-r;
                char lch=word.charAt(l++);
                if(lch=='a' || lch=='e' || lch=='i' || lch=='o' || lch=='u'){
                    vowel.put(lch,vowel.get(lch)-1);
                    if(vowel.get(lch)==0){
                        vowel.remove(lch);
                    }
                }
                else{
                    cons--;
                }
            }
        }
        return ans;
    }

}
