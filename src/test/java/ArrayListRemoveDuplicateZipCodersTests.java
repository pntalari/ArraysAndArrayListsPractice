import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListRemoveDuplicateZipCodersTests {

    String[] zipcodersArray = {"Swathi", "Nirmala", "Ajah", "Sean", "Alex", "Ashley",
            "Aswathy", "Brian", "Cara", "Cristina", "David", "Davis", "Delenda",
            "Eleonor", "Eric", "Francisco", "Jim", "Joe", "Julian", "Zaina", "Kate",
            "Laxmi", "Leah", "Mark", "Marlys", "Arcelia", "Marshilla", "Mike",
            "Neela", "Charlie", "Reese", "Robyn", "Sean", "Thao", "Ashley", "Yang",
            "Shuchi", "Sravani", "Kyle", "Sunhyun", "Swapna", "Will"};

    @Test
    public void removeDuplicateZipCodersTest(){
        // Given
        ArrayListProblems arrayListProblems = new ArrayListProblems();
        List<String> zipcodersList;
        zipcodersList = Arrays.asList(zipcodersArray);
        List<String> expected = new ArrayList<>();
        expected.addAll(zipcodersList);
        Collections.sort(expected);
        expected.remove("Sean");
        expected.remove("Ashley");


        // When
        List<String> actual = arrayListProblems.removeDuplicateZipCoders(zipcodersList);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void removeDuplicateZipCodersAllSeansAndAshleysTest(){
        // Given
        ArrayListProblems arrayListProblems = new ArrayListProblems();
        List<String> zipcodersList = new ArrayList<>();
        zipcodersList.add("Ashley");
        zipcodersList.add("Sean");
        zipcodersList.add("Sean");
        zipcodersList.add("Ashley");

        List<String> expected = new ArrayList<>();
        expected.addAll(zipcodersList);
        Collections.sort(expected);
        expected.remove("Sean");
        expected.remove("Ashley");


        // When
        List<String> actual = arrayListProblems.removeDuplicateZipCoders(zipcodersList);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void removeDuplicateZipCodersCaraClones() {
        // Given
        ArrayListProblems arrayListProblems = new ArrayListProblems();
        List<String> allZipcoders = Arrays.asList(zipcodersArray);
        List<String> zipcodersList = new ArrayList<>();
        zipcodersList.addAll(allZipcoders);
        zipcodersList.add("Cara");
        zipcodersList.add("Cara");
        zipcodersList.add("Cara");
        List<String> expected = new ArrayList<>();
        expected.addAll(zipcodersList);
        Collections.sort(expected);
        expected.remove("Sean");
        expected.remove("Ashley");
        expected.remove("Cara");
        expected.remove("Cara");
        expected.remove("Cara");

        // When
        List<String> actual = arrayListProblems.removeDuplicateZipCoders(zipcodersList);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeDuplicateZipcodersNoDuplicatesTest(){
        // Given
        ArrayListProblems arrayListProblems = new ArrayListProblems();
        List<String> allZipcoders = Arrays.asList(zipcodersArray);
        List<String> zipcodersList = new ArrayList<>();
        zipcodersList.addAll(allZipcoders);
        zipcodersList.remove("Sean");
        zipcodersList.remove("Ashley");

        List<String> expected = new ArrayList<>();
        expected.addAll(zipcodersList);
        Collections.sort(expected);

        // When
        List<String> actual = arrayListProblems.removeDuplicateZipCoders(zipcodersList);

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void removeDuplicateZipcodersNoZipcodersTest(){
        // Given
        ArrayListProblems arrayListProblems = new ArrayListProblems();
        List<String> emptyList = new ArrayList<>();

        // When
        List<String> actual = arrayListProblems.removeDuplicateZipCoders(emptyList);

        // Then
        Assert.assertEquals(emptyList, actual);
    }



}
