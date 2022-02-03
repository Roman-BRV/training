package ua.pp.helperzit.tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ZeroSumDistinctArrayProviderTest {

    private static final int LENGTH = 5;

    ZeroSumDistinctArrayProvider provider;

    @BeforeEach
    void setUp() {
        provider = new ZeroSumDistinctArrayProvider();
    }

    @Test
    void provideShouldReturnIntArrayWithAllElementsSumEqualsZero() {
        int result = Arrays.stream(provider.provide(LENGTH)).sum();
        assertEquals(0, result, "Sum of all elements doesn't equals 0.");
    }

    @Test
    void provideShouldReturnIntArrayWithAllDistinctElements() {
        int[] distinct = Arrays.stream(provider.provide(LENGTH)).distinct().toArray();
        int[] result = provider.provide(LENGTH);
        assertEquals(distinct.length, result.length, "Not all elements are unique.");
    }
}
