// Write a recursive function that takes one parameter: n and
// adds numbers from 1 to n.
public class NumberAdder {
    public static void main(String[] args) {
     System.out.println(adder(3));

    }
    public static int adder(Integer number){
        if(number <= 1){
            return number;
        }
        else {
            return adder(number - 1) + number;
        }
    }
}
