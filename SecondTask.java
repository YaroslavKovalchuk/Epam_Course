
public class SecondTask {

    public static String[] wordMix(String mainWord){

        String [] arrWords = new String[mainWord.length()];
        char first;
        arrWords[0] = mainWord;

        for (int i = 1; i < mainWord.length(); i++) {

            first = mainWord.charAt(0);

            mainWord = mainWord + first;

            mainWord = mainWord.substring(1);

            arrWords[i] = mainWord;

            mainWord =  arrWords[i];
        }
        return arrWords;
    }

    public static String[] sortWords(String[] arr){
        for(int i = 0; i<arr.length-1; i++) {
            for (int j = i+1; j<arr.length; j++) {
                if(arr[i].compareTo(arr[j])>0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return  arr;
    }

    public static String resultWord(String[] arr, String word){
        String res = "";
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i].charAt( arr.length-1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)){
                position = i+1;
            }
        }
        return res + ", " + position;
    }

    public static void main(String[] args) {

        String name ="president";

        String res = resultWord(sortWords(wordMix(name)),name);

        System.out.println(res);

    }
}
