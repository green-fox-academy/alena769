// Given a non-negative integer n, return the sum of it's digits recursively
// (without loops).
//
// Hint
//
// Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
//
// Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).
public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sum(123));

    }
    public static int sum(Integer number){
        if(number<= 1){
            return number;
        }
        return (number % 10 + sum(number / 10));
    }

}
