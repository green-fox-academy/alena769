// Given base and n that are both 1 or more, compute recursively (no loops) the
// value of base to the n power, so powerN(3, 2) is 9 (3 squared).
public class Power {
    public static void main(String[] args){
   // power(number base, power number )
        System.out.println(powerFunction(3,3));
    }
    public static int powerFunction(int base, int power){
        if(power == 1){
            return base;
        }
        return (powerFunction(base, power - 1) * base);

    }
}
