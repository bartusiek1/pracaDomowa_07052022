package pl.sda.arp4;

// 1. Napisać  program,  dla  podanej  liczby  całkowitej  wyświetla  jej  dzielniki.
//Przykładowo, dla liczby 21 dzielniki to: 1, 3, 7, 21.
//
//Notatka:
//- jeśli liczba jest dzielnikiem to nie ma reszty z dzielenia.
//- szukamy liczb mniejszych niż podana (21)
//- sprawdzić czy każda liczba X (21) dzielona przez kolejne liczby z pętli 0-X zwraca resztę
//- wypisz liczby które nie mają reszty z dzielenia

import java.util.Scanner;

public class MainZadanieDomowe08052022_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę:");
        int podanaLiczba = scanner.nextInt();

        for (int i = 1; i <= podanaLiczba; i++) {
            if (podanaLiczba % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
