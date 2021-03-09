public class Cuboid {
    public static void main(String[] args){
        double a = 5;
        double b = 10;
        double c = 12;
        double Surface = 2 * ((a * b) + (a * c) + (c * b));
        double Volume = a * b * c;

        System.out.println(Surface);
        System.out.println(Volume);


    }
}
