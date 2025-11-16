import java.util.Scanner;

public class VivaQ3 {

    // Main program
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of queries
        System.out.print("Number of Queries (Between 1 and 50): ");
        int queries = sc.nextInt();

        while (queries < 1 || queries > 50) {
            System.out.println("Make sure to enter a value between 1 and 50.");
            System.out.print("Number of Queries (Between 1 and 50): ");
            queries = sc.nextInt();
        }

        int[] height = new int[queries];
        char[] pattern = new char[queries];

        // Input each case
        for (int i = 0; i < queries; i++) {
            System.out.print("Enter Height and Pattern (Example: 4 P): ");
            height[i] = sc.nextInt();
            pattern[i] = sc.next().charAt(0);

            // Validate height
            if (height[i] < 1 || height[i] > 9) {
                System.out.println("Error: Height must be between 1 and 9.");
                i--;
                continue;
            }

            // Validate pattern code
            if (pattern[i] != 'A' && pattern[i] != 'P') {
                System.out.println("Error: Pattern must be 'A' or 'P'.");
                i--;
            }
        }

        // Process each test case
        for (int i = 0; i < queries; i++) {
            if (pattern[i] == 'A') {
                angled(height[i]);
            }
            else {
                pyramid(height[i]);
            }
        }

        sc.close();
    }

    // Generates the Angled Staircase (Style 'A')
    public static void angled(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    // Generates the Pyramid Palindrome (Style 'P')
    public static void pyramid(int height) {

        for (int i = 1; i <= height; i++) {

            // Print leading spaces
            for (int s = 0; s < height - i; s++) {
                System.out.print(" ");
            }

            // Ascending numbers
            for (int num = 1; num <= i; num++) {
                System.out.print(num);
            }

            // Descending numbers
            for (int num = i - 1; num >= 1; num--) {
                System.out.print(num);
            }

            System.out.println();
        }
    }
}

