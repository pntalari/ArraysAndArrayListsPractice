import org.junit.Assert;
import org.junit.Test;

public class ArrayFindZipCoderNamesTests {

    String[] zipCoders = {"Ajah", "Alex", "Arcelia", "Ashley", "Ashley",
            "Aswathy", "Brian", "Cara", "Charlie", "Cristina", "David", "Davis", "Delenda",
            "Eleonor", "Eric", "Francisco", "Jim", "Joe", "Julian", "Kate",
            "Kyle", "Laxmi", "Leah", "Mark", "Marlys", "Marshilla", "Mike",
            "Neela", "Nirmala", "Reese", "Robyn", "Sean", "Sean", "Thao",
            "Shuchi", "Sravani", "Sunhyun", "Swapna", "Swathi", "Will",
            "Yang", "Zaina"};

    @Test
    public void findZipCoderNamesByFirstLetterTest1() {
        // Given
        ArrayProblems arrayProblems = new ArrayProblems();

        String letter = "c";
        String[] expected = {"Cara", "Charlie", "Cristina"};


        // When
        String[] actual = arrayProblems.findZipCoderNamesByFirstLetter(letter, zipCoders);

        // Then
        Assert.assertArrayEquals(expected,actual);
    }


    @Test
    public void findZipCoderNamesByFirstLetterTest2() {
        // Given
        ArrayProblems arrayProblems = new ArrayProblems();

        String letter = "s";
        String[] expected = {"Sean", "Sean", "Shuchi", "Sravani", "Sunhyun", "Swapna",
        "Swathi"};


        // When
        String[] actual = arrayProblems.findZipCoderNamesByFirstLetter(letter, zipCoders);

        // Then
        Assert.assertArrayEquals(expected,actual);
    }


    @Test
    public void findZipCoderNamesByFirstLetterTest3() {
        // Given
        ArrayProblems arrayProblems = new ArrayProblems();

        String letter = "q";
        String[] expected = {};


        // When
        String[] actual = arrayProblems.findZipCoderNamesByFirstLetter(letter, zipCoders);

        // Then
        Assert.assertArrayEquals(expected,actual);
    }

}


