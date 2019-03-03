import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListFindZipCoderNamesTests {

    String[] zipcodersArray = {"Ajah", "Alex", "Arcelia", "Ashley", "Ashley",
            "Aswathy", "Brian", "Cara", "Charlie", "Cristina", "David", "Davis", "Delenda",
            "Eleonor", "Eric", "Francisco", "Jim", "Joe", "Julian", "Kate",
            "Kyle", "Laxmi", "Leah", "Mark", "Marlys", "Marshilla", "Mike",
            "Neela", "Nirmala", "Reese", "Robyn", "Sean", "Sean", "Thao",
            "Shuchi", "Sravani", "Sunhyun", "Swapna", "Swathi", "Will",
            "Yang", "Zaina"};


    @Test
    public void findZipCoderNamesByFirstLetterTest1() {
        // Given
        ArrayListProblems arrayListProblems = new ArrayListProblems();
        List<String> zipcodersList;
        zipcodersList = Arrays.asList(zipcodersArray);

        String letter = "z";
        List<String> expected = new ArrayList<>();
        expected.add("Zaina");

        // When
        List<String> actual = arrayListProblems.findZipCoderNamesByFirstLetter(letter, zipcodersList);

        // Then
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void findZipCoderNamesByFirstLetterTest2() {
        // Given
        ArrayListProblems arrayListProblems = new ArrayListProblems();
        List<String> zipcodersList;

        zipcodersList = Arrays.asList(zipcodersArray);

        String letter = "a";
        List<String> expected = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            expected.add(zipcodersList.get(i));
        }

        // When
        List<String> actual = arrayListProblems.findZipCoderNamesByFirstLetter(letter, zipcodersList);

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findZipCoderNamesByFirstLetterTest3() {
        // Given
        ArrayListProblems arrayListProblems = new ArrayListProblems();
        List<String> zipcodersList;
        zipcodersList = Arrays.asList(zipcodersArray);

        String letter = "g";
        List<String> expected = new ArrayList<>();

        // When
        List<String> actual = arrayListProblems.findZipCoderNamesByFirstLetter(letter, zipcodersList);

        // Then
        Assert.assertEquals(expected,actual);
    }
}
