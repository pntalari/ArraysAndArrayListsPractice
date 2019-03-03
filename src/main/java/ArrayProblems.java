import java.util.Arrays;

public class ArrayProblems {


    public Integer findMissingNumber(Integer min, Integer max, Integer[] array) {

        int totalSum = 0;
        for(int i = min; i <= max; i++){
            totalSum += i;
        }

        int arraySum = 0;
        for(Integer i : array){
            arraySum += i;
        }

        return totalSum - arraySum;
    }



    public Integer[] findMultipleMissingNumbers(Integer min, Integer max, Integer[] array) {

        Arrays.sort(array);
        int amountMissing = (max - min + 1) - array.length;
        Integer[] missingNumbers = new Integer[amountMissing];
        int index = 0;


        for (int i = min; i <= max; i++) {
            if (i - min - index < array.length) {
                if (array[i - min - index] != i) {
                    missingNumbers[index] = i;
                    index++;
                }
            } else {
                missingNumbers[index] = i;
                index++;
            }
        }
        return missingNumbers;
    }



    public String[] findZipCoderNamesByFirstLetter(String firstLetter, String[] zipCoders) {

        int answerLength = 0;
        for(String s : zipCoders){
            if(s.substring(0, 1).equalsIgnoreCase(firstLetter)){
                answerLength++;
            }
        }

        String[] answer = new String[answerLength];
        int index = 0;
        for(String s : zipCoders){
            if(s.substring(0, 1).equalsIgnoreCase(firstLetter)){
                answer[index] = s;
                index++;
            }
        }
        return answer;
    }



    public String[] findZipCodersWhoseNamesContainLetter(String letter, String[] zipCoders) {

        String[] tempArray = new String[zipCoders.length];

        int index = 0;
        for(int i = 0; i < zipCoders.length; i++){
            for(int j = 0; j < zipCoders[i].length(); j++){
                if(zipCoders[i].substring(j, j+1).equalsIgnoreCase(letter)){
                    tempArray[index] = zipCoders[i];
                    j = zipCoders[i].length();
                    index++;
                }
            }
        }

        String[] answer = new String[index];

        for(int i = 0; i < answer.length; i++){
            answer[i] = tempArray[i];
        }

        return answer;
    }




    public String[] removeDuplicateZipcoders(String[] zipcoders) {

        Arrays.sort(zipcoders);

        String zipCodersWithoutDuplicates = "";

        if(zipcoders.length > 0){
            zipCodersWithoutDuplicates = zipcoders[0];
        }
        else{
            return new String[]{};
        }

        for (int i = 1; i < zipcoders.length; i++){
            if(!zipcoders[i].equalsIgnoreCase(zipcoders[i - 1])){
                zipCodersWithoutDuplicates += " " + zipcoders[i];
            }
        }
        return zipCodersWithoutDuplicates.split(" ");
    }
}
