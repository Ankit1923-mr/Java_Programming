import java.util.Scanner;
public class patterns {
    public static void main(String[] args) {
        int n1;
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the side of the Square: ");
        n1=scn.nextInt();
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                if (i == 0 || j == 0 || i == n1 - 1 || j == n1 - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
