import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number = input.nextInt();
        int tempNumber = number;
        int digitSum = 0;

        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            digitSum += digit;
            tempNumber /= 10;
        }

        System.out.println("Girilen sayının basamakları toplamı: " + digitSum);
    }
}