import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFindMultipleMissingNumbersTest {

    @Test
    public void findMultipleMissingNumbersTest(){
        // Given
        ArrayListProblems arrayListProblems = new ArrayListProblems();
        Integer min = 5;
        Integer max = 20;
        List<Integer> list = new ArrayList<>();
        for(int i = min; i <= max; i++){
            list.add(i);
        }
        List<Integer> expected = new ArrayList<>();
        expected.add(7);
        expected.add(14);
        expected.add(18);

        list.removeAll(expected);

        // When
        List<Integer> actual = arrayListProblems.findMultipleMissingNumbers(min, max, list);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void findMultipleMissingNumbersTest2(){
        // Given
        ArrayListProblems arrayListProblems = new ArrayListProblems();
        Integer min = 2;
        Integer max = 22;
        List<Integer> list = new ArrayList<>();
        for(int i = min; i <= max; i++){
            list.add(i);
        }
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        expected.add(21);
        expected.add(22);

        list.removeAll(expected);

        // When
        List<Integer> actual = arrayListProblems.findMultipleMissingNumbers(min, max, list);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void findMultipleMissingNumbersTest3(){
        // Given
        ArrayListProblems arrayListProblems = new ArrayListProblems();
        Integer min = 0;
        Integer max = 10;
        List<Integer> list = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        for(int i = min; i <= max; i++){
            expected.add(i);
        }

        // When
        List<Integer> actual = arrayListProblems.findMultipleMissingNumbers(min, max, list);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void findMultipleMissingNumbersTest4(){
        // Given
        ArrayListProblems arrayListProblems = new ArrayListProblems();
        Integer min = 0;
        Integer max = 10;
        List<Integer> list = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        for(int i = min; i <= max; i++){
            list.add(i);
        }

        // When
        List<Integer> actual = arrayListProblems.findMultipleMissingNumbers(min, max, list);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void findMultipleMissingNumbersTest5(){
        // Given
        ArrayListProblems arrayListProblems = new ArrayListProblems();
        Integer min = 1000;
        Integer max = 1000;
        List<Integer> list = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        expected.add(1000);

        // When
        List<Integer> actual = arrayListProblems.findMultipleMissingNumbers(min, max, list);

        // Then
        Assert.assertEquals(expected, actual);
    }

}
