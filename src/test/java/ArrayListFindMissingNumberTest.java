import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFindMissingNumberTest {

    @Test
    public void findMissingNumberTest1(){
        // Given
        ArrayListProblems arrayListProblems = new ArrayListProblems();
        Integer min = 3;
        Integer max = 35;
        List<Integer> list = new ArrayList<>();
        for(int i = min; i <= max; i++){
            list.add(i);
        }
        Integer expected = 22;
        list.remove(expected);

        // When
        Integer actual = arrayListProblems.findMissingNumber(min, max, list);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findMissingNumberTest2(){
        // Given
        ArrayListProblems arrayListProblems = new ArrayListProblems();
        Integer min = 0;
        Integer max = 10000;
        List<Integer> list = new ArrayList<>();
        for(int i = min; i <= max; i++){
            list.add(i);
        }
        Integer expected = 9999;
        list.remove(expected);

        // When
        Integer actual = arrayListProblems.findMissingNumber(min, max, list);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void findMissingNumberTest3(){
        // Given
        ArrayListProblems arrayListProblems = new ArrayListProblems();
        Integer min = 0;
        Integer max = 10000;
        List<Integer> list = new ArrayList<>();
        for(int i = min; i <= max; i++){
            list.add(i);
        }
        Integer expected = 0;
        list.remove(expected);

        // When
        Integer actual = arrayListProblems.findMissingNumber(min, max, list);

        // Then
        Assert.assertEquals(expected, actual);
    }

}
