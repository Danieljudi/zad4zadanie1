import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.print("Podaj liczbe do sprawdzenia:");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        int limit = liczba / 2;
        boolean isPrime = true;
        String yes = "Liczba " + liczba + " jest liczba pierwsza";
        String no = "Liczba " + liczba + " nie jest pierwsza";

        if (liczba == 0 || liczba == 1 || liczba == 4)
            isPrime = false;

        else if (liczba == 2 || liczba == 3)
            isPrime = true;

        else {
            for (int i = 2; i < limit; i++) {
                if (liczba % i == 0)
                    isPrime = false;
                break;
            }
            if (isPrime)
                System.out.println(yes);
            else
                System.out.println(no);

        }

    }
}