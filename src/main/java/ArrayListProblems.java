import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListProblems {

    public Integer findMissingNumber(Integer min, Integer max, List<Integer> list) {

        for(int i = min; i <= max; i++){
            if(!list.contains(i)){
                return i;
            }
        }
        return null;
    }


    public List<Integer> findMultipleMissingNumbers(Integer min, Integer max, List<Integer> list) {

        List<Integer> answerList = new ArrayList<>();

        for(int i = min; i <= max; i++){
            if(!list.contains(i)){
                answerList.add(i);
            }
        }
        return answerList;
    }


    public List<String> findZipCoderNamesByFirstLetter(String firstLetter, List<String> zipcoders) {

        List<String> zipcodersAnswer = new ArrayList<>();
        for(String s : zipcoders){
            if(s.substring(0, 1).equalsIgnoreCase(firstLetter)){
                zipcodersAnswer.add(s);
            }
        }
        return zipcodersAnswer;
    }


    public List<String> findZipCodersWhoseNamesContainLetter(String letter, List<String> zipcoders) {

        List<String> zipcodersAnswer = new ArrayList<>();

        for(String s: zipcoders){
            for(int i = 0; i < s.length(); i++){
                if(s.substring(i, i + 1).equalsIgnoreCase(letter)){
                    zipcodersAnswer.add(s);
                    i = s.length();
                }
            }
        }
        return zipcodersAnswer;
    }



    public List<String> removeDuplicateZipCoders(List<String> zipcoders) {

        List<String> zipcodersNoDuplicates = new ArrayList<>();
        Collections.sort(zipcoders);

        if(zipcoders.size() > 0){
            zipcodersNoDuplicates.add(zipcoders.get(0));
        }

        for(int i = 1; i < zipcoders.size(); i++){
            if(!zipcoders.get(i - 1).equals(zipcoders.get(i))){
                zipcodersNoDuplicates.add(zipcoders.get(i));
            }
        }
        return zipcodersNoDuplicates;
    }


}
