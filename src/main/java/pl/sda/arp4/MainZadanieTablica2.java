package pl.sda.arp4;

// c. wypisz sumę elementów w tablicy - kontymuacja zadania Tablica 1

import java.util.Scanner;

public class MainZadanieTablica2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] tablica = new int[10];

            // a.
            for (int i = 0; i < tablica.length; i++) {
                System.out.println("Podaj " + (i+1) + " liczbę:");
                int podanaLiczba = scanner.nextInt();

                tablica[i] = podanaLiczba;
            }

            // b.
            for (int i = 0; i < tablica.length; i++) {
                System.out.println(tablica[i] + " ");
            }

            int suma = 0;
            for (int i = 0; i < tablica.length; i++) {
                 suma = suma + tablica[i];
            }
            System.out.println("Suma: " + suma);
        }
    }
