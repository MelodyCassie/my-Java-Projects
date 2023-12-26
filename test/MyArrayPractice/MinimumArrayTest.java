package MyArrayPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumArrayTest {
    @Test
    public void minimumTest(){
        int[] numbers = {10, 3, 8, 14, 5, 21};
        int minimum = MinimumArray.getMinimum(numbers);
        assertEquals(3,minimum);

    }

}