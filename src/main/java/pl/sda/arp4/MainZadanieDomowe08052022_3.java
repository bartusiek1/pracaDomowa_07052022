package pl.sda.arp4;

// Wczytuj liczby tak długo aż użytkownik poda 5 liczb większych od zera, 5 liczb
//        mniejszych od zera (łącznie 10)
//        potem wypisz ich sumę.
//        i potem wypisz największą i najmniejszą z nich

import java.util.Scanner;

public class MainZadanieDomowe08052022_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablicaDodatnie = new int[5];
        for (int i = 0; i < tablicaDodatnie.length; i++) {
            System.out.println("Podaj liczbę " + (i + 1) + "  większą od zera: ");
            int liczba = scanner.nextInt();
            tablicaDodatnie[i] = liczba;
            if (tablicaDodatnie[i] <= 0) {
                System.err.println("Podana liczba jest ujemna, wprowadź ponownie");
                i = i - 1;
            }
        }
        int[] tablicaUjemne = new int[5];
        for (int i = 0; i < tablicaUjemne.length; i++) {
            System.out.println("Podaj liczbę " + (i + 1) + "  mniejszą od zera: ");
            int liczba = scanner.nextInt();
            tablicaUjemne[i] = liczba;
            if (tablicaUjemne[i] > 0) {
                System.err.println("Podana liczba jest dodatnia, wprowadź ponownie");
                i = i - 1;
            }
        }

        int maksimum = tablicaUjemne[0];
        int minimum = tablicaUjemne[0];
        for (int i = 1; i < tablicaUjemne.length; i++) {
            if (maksimum < tablicaUjemne[i]) {
                maksimum = tablicaUjemne[i];
            }
            if (minimum > tablicaUjemne[i]) {
                minimum = tablicaUjemne[i];
            }
        }
        for (int i = 0; i < tablicaDodatnie.length; i++) {
            if (maksimum < tablicaDodatnie[i]) {
                maksimum = tablicaDodatnie[i];
            }
            if (minimum > tablicaUjemne[i]) {
                minimum = tablicaUjemne[i];
            }
        }
        System.out.println("Najwieksza liczba to: " + maksimum);
        System.out.println("Najmniejsze liczba to: " + minimum);

    }
}
