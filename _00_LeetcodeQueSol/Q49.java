package _00_LeetcodeQueSol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q49 {
    public static void main(String[] args) {

    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm =new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char [] chr=strs[i].toCharArray();
            Arrays.sort(chr);
            String s=new String(chr);
            if(!hm.containsKey(s)) hm.put(s,new ArrayList<>());
            hm.get(s).add(strs[i]);
        }
        return new ArrayList(hm.values());
    }
}
