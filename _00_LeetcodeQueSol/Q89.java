package _00_LeetcodeQueSol;

import java.util.LinkedList;
import java.util.List;

public class Q89 {
    public static void main(String[] args) {

    }
    public List<Integer> grayCode(int n) {
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < 1<<n; i++) result.add(i ^ i>>1);
        return result;
    }
}
