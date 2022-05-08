package pl.sda.arp4;

// Napisać program, który wczytuje od użytkownika liczbę całkowitą dodatnią n, a następnie
//wyświetla  na  ekranie  wszystkie  potęgi  liczby  2  nie  większe,  niż  podana  liczba.
//Przykładowo,  dla  liczby 71 program  powinien  wyświetlić:
//    1 2 4 8 16 32 64

import java.util.Scanner;

public class MainZadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int liczba = scanner.nextInt();

        int wynik = 1;
        while (wynik < liczba){
            System.out.println(wynik);
            wynik = wynik * 2;
        }
    }
}
