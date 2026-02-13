public class Time {
    public static void main(String[] args) {
        int totalSeconds = Integer.parseInt(args[0]);

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds %3600) / 60;
        int seconds = totalSeconds % 60;
        
        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);
        
    }
}
