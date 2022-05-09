package pl.sda.arp4;

// Wczytuj liczby tak długo aż użytkownik poda 5 liczb większych od zera, 5 liczb
//        mniejszych od zera (łącznie 10)
//        potem wypisz ich sumę.
//        i potem wypisz największą i najmniejszą z nich

import java.util.Scanner;

public class MainZadanieDomowe08052022_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tablica = new int[10];

        System.out.println("Podaj 10 liczb - dodatnich oraz ujemnych:");

        for (int i = 0; i < tablica.length; i++) {
            int podanaLiczba = scanner.nextInt();

            tablica[i] = podanaLiczba;

            int LiczbyDodatnie = 0;
            int LiczbyUjemne = 0;

            if (podanaLiczba == 0) {
                System.out.println("No dobra, dowolne, za wyjątkiem liczby 0");
                System.out.println("Wybierz proszę raz jeszcze");
                i--;
            } else if ((podanaLiczba > 0) && (LiczbyDodatnie < 5)) {
                System.out.println("Dziękuję, podaj kolejną liczbę");
                LiczbyDodatnie++;
            } else if ((podanaLiczba < 0) && (LiczbyUjemne < 5)) {
                LiczbyUjemne++;
                System.out.println("Dziękuję, podaj kolejną liczbę");
            }
             }
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma = suma + tablica[i];
        }
        System.out.println("Suma: " + suma);


        int maksimum = tablica[0];

        for (int i = 1; i < tablica.length; i++) {
            if (maksimum < tablica[i]) {
                maksimum = tablica[i];
            }
        }
        System.out.println("maksimum: " + maksimum);

        int minimum = tablica[0];

        for (int i = 1; i < tablica.length; i++) {
            if (minimum > tablica[i]) {
                minimum = tablica[i];
            }
        }
        System.out.println("minimum: " + minimum);
    }
}
