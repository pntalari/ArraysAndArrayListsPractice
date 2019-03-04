import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class ArrayListProblems {

    public Integer findMissingNumber(Integer min, Integer max, List<Integer> list) {

        Integer[] arr = new Integer[max - min];
        Integer num = 0;

        for (int i = min; i <= max; i++) {
            if (!list.contains(i)) {
                num = i;
            }
        }
        return num;
    }

    //        ArrayList<String> arr = new ArrayList<>();
//        Iterator<String> iter = arr.iterator();
//        while (iter.hasNext()) {
//            String ele = iter.next();
//            if (true) {
//                iter.remove();


    public List<Integer> findMultipleMissingNumbers(Integer min, Integer max, List<Integer> list) {
        ArrayList<Integer> listR = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (!list.contains(i)) {
                listR.add(i);
            }
        }
        return listR;
    }


    public List<String> findZipCoderNamesByFirstLetter(String firstLetter, List<String> zipcoders) {
        ArrayList<String> retArr = new ArrayList<>();


        for (String s:zipcoders
             ) {
            if (s.toLowerCase().startsWith(firstLetter.toLowerCase())) {
                retArr.add(s);
            }
        }
            return retArr;
    }


    public List<String> findZipCodersWhoseNamesContainLetter(String letter, List<String> zipcoders) {

        ArrayList<String> retArr = new ArrayList<>();

        for (String s:zipcoders
        ) {
            if (s.toLowerCase().contains(letter.toLowerCase())) {
                retArr.add(s);
            }
        }
        return retArr;
    }


    public List<String> removeDuplicateZipCoders(List<String> zipcoders) {
        ArrayList<String> retArr = new ArrayList<>();


        for (String s:zipcoders
        ) {
            if(!retArr.contains(s)){
                retArr.add(s);
            }
        }
        Collections.sort(retArr);
        return retArr;

    }


}
