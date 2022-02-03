package ua.pp.helperzit.tasks;

//import java.util.Arrays;

public class ZeroSumDistinctArrayProvider {

    /**
     * Provides appropriate int array of given length
     * <p>
     * All elements of it should be unique and their sum should be 0.
     *
     * @param length
     * @return array
     */
    public int[] provide(final int length) {

        int[] result = new int[length];

        int middle = length / 2;
//        if (length % 2 != 0){
//            result[middle] = 0;
//        }
        for (int i = 1; i <= middle; i++) {
            int left = middle - i;
            int right = middle + i;
            result[left] = -i;
            result[right] = i;
        }

//        System.out.println(Arrays.toString(result));
        return result;
    }
}
