public class HighestLowest {
    public static void main(String[] args) {
        String s = "-1, -1";

        System.out.println(highest(s));
    }

    public static String highest(String s) {
        String[] digits = s.split(" ");
        Integer highest = Integer.parseInt(digits[0]);
        Integer lowest = Integer.parseInt(digits[0]);
        for (String number: digits) {
            if(Integer.parseInt(number) > highest){
                highest = Integer.parseInt(number);
            }
        }
        for (String n: digits) {
            if(lowest > Integer.parseInt(n)){
                lowest = Integer.parseInt(n);
            }
        }

        return new String(highest + " " + lowest);
    }
}
