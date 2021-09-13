public class Triangle {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 8;
        System.out.println(isTriangle(a, b, c));
    }

    public static boolean isTriangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {

            return true;
        }

        return false;
    }
}
