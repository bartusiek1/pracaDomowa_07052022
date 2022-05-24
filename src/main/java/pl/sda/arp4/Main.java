package pl.sda.arp4;

import java.util.Random;
import java.util.Scanner;

//     Napisz aplikację w której zadeklaruj tablicę 10 elementów a następnie:
//
//    wypełnij je losowymi wartościami z przedziału -10 - 10
//    wypisz na ekranie zawartość tablicy
public class Main {
    public static void main(String[] args) {

        // 100 liczba z zakresu 0-50

        for (int i = 0; i < 101; i++) {
            int losowanaLiczba = new Random().nextInt(50);

            System.out.println(losowanaLiczba);
        }
        System.out.println();

        //  // 100 liczba z zakresu 100-1000 -w jednej lini odzielonej spacją

        for (int i = 0; i < 101; i++) {
            int losowanaLiczba = new Random().nextInt(901) + 100;

            System.out.print(losowanaLiczba + " ");
        }
        System.out.println();

        //  // 10 liczba z zakresu -200 do 5000 -w jednej lini odzielonej spacją

        for (int i = 0; i < 10; i++) {
            int losowanaLiczba = new Random().nextInt(5201) - 200;

            System.out.print(losowanaLiczba + " ");
        }
        System.out.println();

        //  // 10 liczba z zakresu 0 do 10 -w jednej lini
        // sprawdź jak często pojawia się tam liczba 5

        int losowanaLiczba;
        int licznikPiatek = 0;

        for (int i = 0; i < 10; i++) {
            losowanaLiczba = new Random().nextInt(11);

            System.out.print(losowanaLiczba + " ");

            if (losowanaLiczba == 5) {
                licznikPiatek = licznikPiatek + 1;
            }
        }
            System.out.println("Liczbę 5 wylosowano: " + licznikPiatek + " razy");
        System.out.println();

        //  // 10 liczba z zakresu 0 do 10 -w jednej lini
        // sprawdź jak często pojawia się tam liczba 5

        int licznikCzworek = 0;
        int licznikDwojek = 0;

        for (int i = 0; i < 20; i++) {
            losowanaLiczba = new Random().nextInt(5) +1;

            System.out.print(losowanaLiczba + " ");

            if (losowanaLiczba == 4) {
                licznikCzworek = licznikCzworek + 1;
            } else if (losowanaLiczba == 2) {
                licznikDwojek = licznikDwojek + 1;
            }
        }
        System.out.println("Liczbę 2 wylosowano: " + licznikDwojek + " razy");
        System.out.println("NAtomiast liczbę 4 wylosowano: " + licznikCzworek + " razy");

        }
    }
