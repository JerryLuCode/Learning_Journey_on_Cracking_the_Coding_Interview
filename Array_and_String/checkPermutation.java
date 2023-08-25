import java.util.Arrays;

class Exercise2 {
    public static String sort(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    // method 1: try to sort the String array and compare 2 sorted array
    public static boolean isPer(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        return sort(str1).equals(sort(str2));
    }

    // method 2: use an int[] to store the frequency of characters, add first sub second
    public static boolean isPer2(String str1, String str2) {


        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPer("Hello", "world"));
        System.out.println(isPer("Johnson", "John"));
        System.out.println(isPer("Johnson", "son"));
        System.out.println(isPer("Johnson", "hns"));
        System.out.println(isPer("Johnson", "Johna"));
    }
}