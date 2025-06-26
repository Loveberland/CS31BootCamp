import java.util.Scanner;

public class Padoru{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int height = sc.nextInt();

        if (height < 1) {
            System.out.println("*");
        } else if (height == 1) {
            System.out.println(" *");
            System.out.println("/|\\");
        } else if (height > 1) {
            for (int i = 1; i <= height - 2; i++) {
                if (i == 1) {
                    for (int j = 0; j < height - i; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println();
                for (int j = 1; j < height - i; j++) {
                    System.out.print(" ");

                }
                System.out.print("/");
                for (int k = 1; k <= i - 1; k++) {
                    System.out.print(" ");

                }
                System.out.print("|");
                for (int l = 1; l <= i - 1; l++) {
                    System.out.print(" ");

                }
                System.out.print("\\");
                if (i == height - 2) {
                    System.out.println();
                    System.out.print("/");
                    for (int j = 0; j < height - 2; j++) {
                        System.out.print("_");
                    }
                    System.out.print("|");
                    for (int j = 0; j < height - 2; j++) {
                        System.out.print("_");
                    }
                    System.out.print("\\");
                }
            }
        }
        System.out.println();
        for (int i = 1; i <= height - 2; ++i) {
            System.out.print(" ");
        }
        System.out.print("|_|");
    }

}
