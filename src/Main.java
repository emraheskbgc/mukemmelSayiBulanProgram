import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz = ");
        number = input.nextInt();

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    total += i;
                }


            }
            if (total == (number * 2)) {
                System.out.println(number + " sayısı bir mükemmle sayıdır");
            } else {
                System.out.println(number + " sayısı bir mükemmel sayı değildir.");
            }



    }
}
