public class Loop {

    public static void main(String[] args) {

        System.out.println(loop());

    }

    public static int loop() {
        int tmp = 1;

        for (int i = 0; i <=5 ; i++) {
            if(i < 4) {
                tmp += 2;
            }else if (i > 4) {
                tmp += 1;
            }else {
                tmp = 0;
            }
        }

        return tmp;
    }
}
