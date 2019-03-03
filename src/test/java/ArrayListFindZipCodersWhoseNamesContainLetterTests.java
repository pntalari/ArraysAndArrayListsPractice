import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListFindZipCodersWhoseNamesContainLetterTests {

    String[] zipcodersArray = {"Ajah", "Alex", "Arcelia", "Ashley", "Ashley",
            "Aswathy", "Brian", "Cara", "Charlie", "Cristina", "David", "Davis", "Delenda",
            "Eleonor", "Eric", "Francisco", "Jim", "Joe", "Julian", "Kate",
            "Kyle", "Laxmi", "Leah", "Mark", "Marlys", "Marshilla", "Mike",
            "Neela", "Nirmala", "Reese", "Robyn", "Sean", "Sean", "Thao",
            "Shuchi", "Sravani", "Sunhyun", "Swapna", "Swathi", "Will",
            "Yang", "Zaina"};


    @Test
    public void findZipCodersWhoseNamesContainLetterTest1() {
        // Given
        ArrayListProblems arrayListProblems = new ArrayListProblems();
        List<String> zipcodersList;
        zipcodersList = Arrays.asList(zipcodersArray);

        String letter = "j";
        List<String> expected = new ArrayList<>();
        expected.add("Ajah");
        expected.add("Jim");
        expected.add("Joe");
        expected.add("Julian");


        // When
        List<String> actual = arrayListProblems.findZipCodersWhoseNamesContainLetter(letter, zipcodersList);

        // Then
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void findZipCodersWhoseNamesContainLetterTest2() {
        // Given
        ArrayListProblems arrayListProblems = new ArrayListProblems();
        List<String> zipcodersList;
        zipcodersList = Arrays.asList(zipcodersArray);

        String letter = "x";
        List<String> expected = new ArrayList<>();
        expected.add("Alex");
        expected.add("Laxmi");


        // When
        List<String> actual = arrayListProblems.findZipCodersWhoseNamesContainLetter(letter, zipcodersList);

        // Then
        Assert.assertEquals(expected,actual);
    }


}
