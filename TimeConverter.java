public class TimeConverter {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        int seconds = scanner.nextInt();
        scanner.close();

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        System.out.printf("%d hours, %d minutes, %d seconds", hours, minutes, remainingSeconds);
    }
}