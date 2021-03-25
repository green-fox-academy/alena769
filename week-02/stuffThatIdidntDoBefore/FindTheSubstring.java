public class FindTheSubstring {

    // Create a function that takes two strings as a parameter
    // Returns the starting index where
    // the second one is starting in the first one
    // Returns `-1` if the second string is not in the first one

    // Example:

    // should print: `17`
    // System.out.println(subStr("this is what I'm searching in", "searching"));

    // should print: `-1`
    // System.out.println(subStr("this is what I'm searching in", "not"));

    //public static int subStr(String input, String q) {
    //return -1;

    public static void main(String[] args) {
        System.out.println(findTheSubstring("Hello this world people", "not"));
        System.out.println(findTheSubstring("Hello this world people", "people"));
    }

    public static int findTheSubstring(String string, String string1) {
        int index = string.indexOf(string1);
        return index;
    }
}
