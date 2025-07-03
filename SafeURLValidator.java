import java.util.Scanner;

public class SafeURLValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter URL to check:");
        String url = scanner.nextLine().trim();

        if (url.toLowerCase().startsWith("https://") && url.matches("^https://[a-zA-Z0-9./\\-_%]+$")) {
            System.out.println("This URL uses HTTPS and looks safe (format check only).");
        } else if (url.toLowerCase().startsWith("http://")) {
            System.out.println("Warning: This URL does NOT use HTTPS.");
        } else {
            System.out.println("Invalid or unsupported URL format.");
        }
        scanner.close();
    }
}