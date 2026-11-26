import java.util.Scanner;
public class EvenPositionDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int pos = 1;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (pos % 2 == 0) {
                sum += digit;
            }
            n = n / 10;
            pos++;
        }

        System.out.println(sum);
        sc.close();
    }
}

