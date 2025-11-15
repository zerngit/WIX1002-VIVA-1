import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Number of Queries (Between 1 and 50): ");
        int queries = sc.nextInt();
        while (queries<1 || queries > 50){
            System.out.println("Make Sure to enter a value between 1 and 50");
            System.out.print ("Number of Queries (Between 1 and 50): ");
            queries = sc.nextInt();
        }
        int [] height = new int [queries];
        char[] pattern = new char [queries];
        for (int i=0; i<queries;i++) {
            System.out.print("Please enter the pattern you want to form in the form of (Height Pattern). For Example: 4 P: ");
            height[i] = sc.nextInt();
            pattern[i] = sc.next().charAt(0);
            if (height[i] <= 1 || height[i] >= 9) {
                System.out.println("Please enter a height from 1 to 9 only");
                i--;
            } else if (pattern[i] != 'P' && pattern[i] != 'A') {
                System.out.println("Please enter a valid pattern either 'P' or 'A'");
                i--;
            }
        }

        for (int i=0; i<queries; i++){
                if (pattern[i] == 'P'){
                    pyramidPalindrome(height[i]);
                }else if (pattern [i] =='A'){
                    angled(height[i]);
                }
            }
        }

    public static void pyramidPalindrome(int height) {
        // print blank space
        for (int i = 1; i <= height; i++) {
            for (int blank = (height-i); blank>0 ; blank --){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print(j);
            }
            for (int repeatNum = (i-1); repeatNum >=1; repeatNum-- ){
                System.out.print(repeatNum);
            }
            System.out.print("\n");
        }
    }

    public static void angled (int height){
        for (int i =1; i<=height; i++){
            for (int j=1; j<=i; j++){
                System.out.print (i);
            }
            System.out.print("\n");
        }
    }
}
