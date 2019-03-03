import org.junit.Assert;
import org.junit.Test;

public class ArrayFindZipCodersWhoseNamesContainLetterTests {

    String[] zipCoders = {"Ajah", "Alex", "Arcelia", "Ashley", "Ashley",
            "Aswathy", "Brian", "Cara", "Charlie", "Cristina", "David", "Davis", "Delenda",
            "Eleonor", "Eric", "Francisco", "Jim", "Joe", "Julian", "Kate",
            "Kyle", "Laxmi", "Leah", "Mark", "Marlys", "Marshilla", "Mike",
            "Neela", "Nirmala", "Reese", "Robyn", "Sean", "Sean", "Thao",
            "Shuchi", "Sravani", "Sunhyun", "Swapna", "Swathi", "Will",
            "Yang", "Zaina"};

    @Test
    public void findZipcodersWhoseNamesContainLetterTest1(){
        // Given
        ArrayProblems arrayProblems = new ArrayProblems();
        String letter = "y";
        String[] expected = {"Ashley", "Ashley", "Aswathy", "Kyle", "Marlys", "Robyn", "Sunhyun", "Yang"};

        // When
        String[] actual = arrayProblems.findZipCodersWhoseNamesContainLetter(letter, zipCoders);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findZipcodersWhoseNamesContainLetterTest2(){
        // Given
        ArrayProblems arrayProblems = new ArrayProblems();
        String letter = "q";
        String[] expected = {};

        // When
        String[] actual = arrayProblems.findZipCodersWhoseNamesContainLetter(letter, zipCoders);

        // Then
        Assert.assertArrayEquals(expected, actual);

    }

}
