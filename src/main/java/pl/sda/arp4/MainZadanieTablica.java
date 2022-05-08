package pl.sda.arp4;

//    Napisz aplikację w której zadeklaruj tablicę 10 elementów a następnie:
//
//    wypełnij je losowymi wartościami z przedziału -10 - 10
//    wypisz na ekranie zawartość tablicy

import java.util.Random;

public class MainZadanieTablica {
    public static void main(String[] args) {
        int[] tablica = new int[10];

        // a.
        for (int i = 0; i < tablica.length; i++) {
            int wylosowanaLiczba = new Random().nextInt(21)-10;

            tablica[i] = wylosowanaLiczba;
        }

        // b.
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }
    }
}
