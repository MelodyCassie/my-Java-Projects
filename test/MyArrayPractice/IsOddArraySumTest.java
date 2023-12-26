package MyArrayPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsOddArraySumTest  {
    @Test
    public void isOddSumTest(){
        int[] numbers = {17, 25, 8, 11, 36, 42, 7, 19};
        int oddNumbersSum = IsOddArraySum.sumOddNumbers(numbers);
        assertEquals(54, oddNumbersSum);
    }

}