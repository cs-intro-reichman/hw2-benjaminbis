public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);

        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));

        int totalMinutes = hours * 60 + minutes + minutesToAdd;

        int newHours = (totalMinutes / 60) % 24;
        int newMinutes = totalMinutes % 60;

        System.out.printf("%02d:%02d\n", newHours, newMinutes);
    }
}
