public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int currentTime = (currentHours * 3600) + (currentMinutes * 60) + currentSeconds;
        int secondsLeft = (24 * 3600) - currentTime;
        System.out.println(secondsLeft);
    }
}
