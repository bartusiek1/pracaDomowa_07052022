package pl.sda.arp4;

// Pobierz od użytkownika liczbę X, a następnie wylosuj 5 liczb z zakresu 1-49.
//Sprawdź czy liczba użytkownika jest w wylosowanych liczbach.


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainZadanieDomowe08052022_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę od 1-49:");
        int wskazanaLiczba = scanner.nextInt();

        for (int i = 0; i < 1; i++) {

            if ((wskazanaLiczba > 49) || (wskazanaLiczba < 1)) {
                System.out.println("Wskazałeś liczbę spoza przedziału - spróbuj ponownie");
                wskazanaLiczba = scanner.nextInt();
                i--;
            }
        }
        int[] tablica = new int[5];

        for (int i = 0; i < tablica.length; i++) {
            int wylosowanaLiczba = new Random().nextInt(49) + 1;

            tablica[i] = wylosowanaLiczba;

            System.out.print(tablica[i]);
            System.out.println();
        }

        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] == wskazanaLiczba) {
                System.out.println(wskazanaLiczba + " jest wśród wygranych liczb!");
            } else {
                System.out.println(wskazanaLiczba + " niestety nie jest wśród wygranych liczb");
            }
        }
    }
}


