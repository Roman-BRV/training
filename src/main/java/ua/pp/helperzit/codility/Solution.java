package ua.pp.helperzit.codility;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    public static void main (String[] args){

        System.out.println(new Solution().solution2(new int[]{-1, 0, 1, 2, 5}));

    }
    public int solution1(int[] input) {
        // write your code in Java SE 8
        int result = 0;
        Set<Integer> inputSet = IntStream.of(input).boxed().collect(Collectors.toSet());
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if(!inputSet.contains(i)){
                result = i;
                break;
            }
        }
        System.out.println(inputSet);

        return result;
    }

    public int solution2(int[] input) {
        // write your code in Java SE 8
        int result = 0;
        List<Integer> positiveSorted = IntStream.of(input)
                .boxed()
                .distinct()
                .filter(x -> x > 0)
                .sorted()
                .collect(Collectors.toList());
        if (positiveSorted.isEmpty()){
            result = 1;

        } else if(positiveSorted.size() == positiveSorted.get(positiveSorted.size()-1)){
            result = positiveSorted.get(positiveSorted.size()-1) + 1;

        } else {
            for (int i = 0, res = 1; i < positiveSorted.size() + 1; i++, res++) {
                if(res != positiveSorted.get(i)){
                    result = res;
                    break;
                }
            }
            System.out.println(positiveSorted);
        }

        return result;
    }
}
