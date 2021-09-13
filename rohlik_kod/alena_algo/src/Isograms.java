public class Isograms {
    public static void main(String[] args) {
        String s = "Dermatoglyphics";
        String s1 = "aba";
        String s2 = "moOse";

        System.out.println(isIsogram(s));
        System.out.println(isIsogram(s1));
        System.out.println(isIsogram(s2));
    }

    public static boolean isIsogram(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        String checker = "";
        StringBuilder sb = new StringBuilder();

        for (char c : chars) {
            if (Character.isDigit(c)) {

                return false;
            }
        }
        for (char ch: chars) {
            if(checker.contains(Character.toString(ch))) {
                return false;
            } else {
                checker = sb.append(ch).toString();
            }
        }

        return true;
    }

}

