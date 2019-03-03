import org.junit.Assert;
import org.junit.Test;

public class ArrayRemoveDuplicateZipCodersTests {

    String[] zipCoders = {"Swathi", "Nirmala", "Ajah", "Sean", "Alex", "Ashley",
            "Aswathy", "Brian", "Cara", "Cristina", "David", "Davis", "Delenda",
            "Eleonor", "Eric", "Francisco", "Jim", "Joe", "Julian", "Zaina", "Kate",
            "Laxmi", "Leah", "Mark", "Marlys", "Arcelia", "Marshilla", "Mike",
            "Neela", "Charlie", "Reese", "Robyn", "Sean", "Thao", "Ashley","Yang",
            "Shuchi", "Sravani", "Kyle", "Sunhyun", "Swapna", "Will"};


    @Test
    public void removeDuplicateZipCodersTest(){
        // Given
        ArrayProblems arrayProblems = new ArrayProblems();
        String[] expected = {"Ajah", "Alex", "Arcelia", "Ashley",
                "Aswathy", "Brian", "Cara", "Charlie", "Cristina", "David", "Davis", "Delenda",
                "Eleonor", "Eric", "Francisco", "Jim", "Joe", "Julian", "Kate",
                "Kyle", "Laxmi", "Leah", "Mark", "Marlys", "Marshilla", "Mike",
                "Neela", "Nirmala", "Reese", "Robyn", "Sean",
                "Shuchi", "Sravani", "Sunhyun", "Swapna", "Swathi", "Thao", "Will",
                "Yang", "Zaina"};

        // When
        String[] actual = arrayProblems.removeDuplicateZipcoders(zipCoders);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeDuplicateZipCodersTest2(){
        // Given
        ArrayProblems arrayProblems = new ArrayProblems();
        String[] onlyDuplicateZipcoders = {"Sean", "Ashley", "Sean", "Ashley"};
        String[] expected = {"Ashley", "Sean"};

        // When
        String[] actual = arrayProblems.removeDuplicateZipcoders(onlyDuplicateZipcoders);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void removeDuplicateZipCodersTest3(){
        // Given
        ArrayProblems arrayProblems = new ArrayProblems();
        String[] caraClones = {"Cara", "Cara", "Cara", "Cara"};
        String[] expected = {"Cara"};

        // When
        String[] actual = arrayProblems.removeDuplicateZipcoders(caraClones);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void removeDuplicateZipCodersTest5(){
        // Given
        ArrayProblems arrayProblems = new ArrayProblems();
        String[] noZipCoders = {};
        String[] expected = {};

        // When
        String[] actual = arrayProblems.removeDuplicateZipcoders(noZipCoders);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }

}
