package ua.pp.helperzit.codility;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    private static Long MAX_RESULT = 100000000L;
    private static Long EXCEED_MAX_RESULT_OUTPUT = -1L;

    public static void main(String[] args) {
        System.out.println(new Task2().solution(123456789));
    }
    public int solution(int input) {
        // write your code in Java SE 8

        List<Integer> inputList = new ArrayList<>();
        do {
            inputList.add(input % 10);
            input /= 10;
        } while (input > 0);
        inputList.sort(Comparator.naturalOrder());

        Long result = 0L;
        for (int i = 0; i < inputList.size(); i++) {
            result += inputList.get(i) * (long)Math.pow(10, i);
        }

        if(result > MAX_RESULT){
            result = EXCEED_MAX_RESULT_OUTPUT;
        }

        return result.intValue();
    }

    public int solution1(int input) {
        // write your code in Java SE 8

//        String inputString = String.valueOf(input);
//        String[] inputStingArr = inputString.split("");
//        int[] inputArr = new int[inputString.length()];
//        for (int i = 0; i < inputString.length(); i++) {
//            inputArr[i] = Integer.valueOf(inputStingArr[i]);
//        }

//        String f = Stream.of(String.valueOf(inputInt).split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        String family = String.valueOf(input).chars()
                .mapToObj(Character::toString)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());

        Long result = Long.valueOf(family);

        if(result > MAX_RESULT){
            result = EXCEED_MAX_RESULT_OUTPUT;
        }

        return result.intValue();
    }
}
