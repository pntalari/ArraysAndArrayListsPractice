import org.junit.Assert;
import org.junit.Test;


public class ArrayFindMultipleMissingNumbersTests {

    @Test
    public void findMultipleMissingNumbersTest(){
        // Given
        ArrayProblems arrayProblems = new ArrayProblems();
        Integer min = 5;
        Integer max = 20;
        Integer[] array = {20, 6, 8, 9, 10, 11, 12, 15, 16, 17, 19, 5};
        Integer[] expected = {7, 13, 14, 18};

        // When
        Integer[] actual = arrayProblems.findMultipleMissingNumbers(min, max, array);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void findMultipleMissingNumbersTest2(){
        // Given
        ArrayProblems arrayProblems = new ArrayProblems();
        Integer min = 2;
        Integer max = 22;
        Integer[] array = {3, 4, 5, 6, 7, 8, 12, 10, 14, 16, 17, 18, 19 ,20};
        Integer[] expected = {2, 9, 11, 13, 15, 21, 22};

        // When
        Integer[] actual = arrayProblems.findMultipleMissingNumbers(min, max, array);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void findMultipleMissingNumbersTest3(){
        // Given
        ArrayProblems arrayProblems = new ArrayProblems();
        Integer min = 0;
        Integer max = 10;
        Integer[] array= {};
        Integer[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // When
        Integer[] actual = arrayProblems.findMultipleMissingNumbers(min, max, array);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void findMultipleMissingNumbersTest4(){
        // Given
        ArrayProblems arrayProblems = new ArrayProblems();
        Integer min  = 0;
        Integer max = 10;
        Integer[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] expected = {};

        // When
        Integer[] actual = arrayProblems.findMultipleMissingNumbers(min, max, array);

        // Then
        Assert.assertArrayEquals(expected,actual);
    }


    @Test
    public void findMultipleMissingNumbersTest5(){
        // Given
        ArrayProblems arrayProblems = new ArrayProblems();
        Integer min = 2;
        Integer max = 2;
        Integer[] array = {};
        Integer[] expected = {2};

        // When
        Integer[] actual = arrayProblems.findMultipleMissingNumbers(min, max, array);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }
}
