# ArrayProblems
### SOLVE THESE USING ARRAYS

**Integer findMissingNumber(Integer min, Integer max, Integer[] array)**
Given an Integer array with lower bound min and upper bound max, find the missing Integer value in the array.
	Ex: min = 1, max = 5, array = {1, 2, 3, 5} ----> returns 4



**Integer[] findMultipleMissingNumbers(Integer min, Integer max, Integer[])**
Given an array with lower bound min and upper bound max, return an array of all missing integer values in the array.
	Ex: min = 1,  max = 5, array = {2, 4} ——> returns {1, 3, 5}


**String[] findZipCoderNamesByFirstLetter(String firstLetter, String[] zipCoders)**
Given a String that is a single letter and String array with the names of ZipCoders, return a String array of all ZipCoders whose names begin with the given letter.
	Ex:  firstLetter = ‘e’, zipCoders = {“Eric”, “Eleonor”, “Francisco”} —> returns {“Eric”, “Eleonor”}


**String[] findZipCodersWhoseNamesContainLetter(String letter, String[] zipCoders)**
Given a String that is a single letter and String array with the names of ZipCoders, return a String array of all ZipCoders whose names contain the given letter.
	Ex: letter = ‘j’, zipCoders = {“Ajah”, “Jim”, “Neela”} ——> returns {“Ajah”, “Jim”}


**String[] removeDuplicateZipcoders{String[] zipCoders)**
Given a String array with the names of ZipCoders, return an alphabetically sorted String array with only one occurrence of each name.
	Ex: zipCoders = {“Sean”, “Delenda”, “Sean”} ——> returns {“Delenda”, “Sean”}



# ArrayListProblems
#### Okay, now you can use ArrayLists

**Integer findMissingNumber(Integer min, Integer max, List<Integer> list)**
Given a List of Integers with lower bound min and upper bound max, find the missing Integer value in the List
	Ex: min = 1, max = 5, List = {1, 2, 3, 5} ----> returns 4
	      min = 1, max = 5, List = {2, 3, 4, 5} —-> returns 1


**List<Integer> findMultipleMissingNumbers(Integer min, Integer max, List<Integer> list)**
Given a list of Integers with lower bound min and upper bound max, return a list of all missing integer values in the list
	Ex: min = 0,  max = 5, list = {0, 2, 4, 5} —> returns List<Integer>{1, 3}


**List<String> findZipCoderNamesByFirstLetter(String firstLetter, List<String> zipCoders)**
Given a String that is a single letter and List of Strings with the names of ZipCoders, return a List of Strings of all ZipCoders whose names begin with the given letter.
	Ex:  firstLetter = ‘b’, zipCoders =  {“Aswathy”, “Brian”, “Cara”} —> returns List<String>{“Brian”}


**List<String> findZipCodersWhoseNamesContainLetter(String letter, List<String> zipCoders)**
Given a String that is a single letter and List of Strings with the names of ZipCoders, return a List of Strings of all ZipCoders whose names contain the given letter.
	Ex: letter = ‘n’, zipCoders = {“Mike”, “Nirmala”, “Yang”} —> returns List<String>{“Nirmala”, “Yang”}


**List<String> removeDuplicateZipcoders{List<String> zipCoders)**
Given a List of Strings with the names of ZipCoders, return an alphabetically sorted List of Strings with only one occurrence of each name.
	Ex: zipCoders = {“Will”, “Ashley”, “Ashley”} ——> returns List<String>{“Ashley”, “Will”}


## Conclusion: ArrayLists are better than Arrays in every way 
