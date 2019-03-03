public class Main {

    public static void main(String[] args) {


        System.out.println(reverseCase("$Cara!Marie*"));

    }


    public static String reverseCase(String string){

        String returnVal = "";
        String upperCasedString = string.toUpperCase();
        String lowerCasedString = string.toLowerCase();

        for (int i = 0; i < string.length(); i++){
            if(string.charAt(i) != upperCasedString.charAt(i)){
                returnVal += upperCasedString.charAt(i);
            }
            else{
                returnVal += lowerCasedString.charAt(i);
            }
        }
        return returnVal;
    }
}
