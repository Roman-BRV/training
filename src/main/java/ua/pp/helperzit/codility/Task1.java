package ua.pp.helperzit.codility;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {

    private static int NEGATIVE = -1;
    private static int ZERO = 0;
    private static int POSITIVE = 1;

    public static void main(String[] args) {
        System.out.println(new Task1().solution(new int[]{1, -1, -1, -1, 0}));
    }

    public int solution(int[] input) {
        // write your code in Java SE 8

        List<Integer> listNegative = IntStream.of(input).boxed().filter(x -> x < 0).collect(Collectors.toList());
        List<Integer> listZero = IntStream.of(input).boxed().filter(x -> x == 0).collect(Collectors.toList());
        if(!listZero.isEmpty()){
            return ZERO;
        } else if(listNegative.isEmpty() || listNegative.size() % 2 == 0){
            return POSITIVE;
        } else {
            return NEGATIVE;
        }
    }
}
