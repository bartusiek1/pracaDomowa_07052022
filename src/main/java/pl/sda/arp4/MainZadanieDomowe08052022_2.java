package pl.sda.arp4;

// Wczytuj liczby tak długo aż użytkownik poda 5 liczb większych od zera i potem
//wypisz największą z nich.

import java.util.Scanner;

public class MainZadanieDomowe08052022_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tablica = new int[5];

        for (int i = 0; i < tablica.length; i++) {
                System.out.println("Podaj liczbę:");
                int podanaLiczba = scanner.nextInt();

                tablica[i] = podanaLiczba;

                if (podanaLiczba <= 0) {
                    System.out.println("Błędna wartość");
                    i--;
                }
            }

            int maksimum = tablica[0];

            for (int i = 1; i < tablica.length; i++) {
                if (maksimum < tablica[i]) {
                    maksimum = tablica[i];
                }
            }
                System.out.println("maksimum: " + maksimum);
            }
        }