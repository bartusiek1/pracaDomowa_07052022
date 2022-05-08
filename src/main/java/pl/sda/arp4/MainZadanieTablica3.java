package pl.sda.arp4;

import java.util.Arrays;
import java.util.Scanner;

public class MainZadanieTablica3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] tablica = new int[10];

            // a.
            for (int i = 0; i < tablica.length; i++) {
                System.out.println("Podaj " + (i + 1) + " liczbę:");
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

            // szukanie minimum

            int minimum = tablica[0];
            for (int i = 1; i < tablica.length; i++) {
                // jeśli obecne minimum jest większe niż element tablicy
                if (minimum > tablica[i]) {
                    // to znaczY ze musimy nadpisać minimum
                    // znaleźliśmy mniejszy element
                    minimum = tablica[i];
                }
            }
            System.out.println("minimum: " + minimum);

            // szukaniem maksimum

            int maksimum = tablica[0];
            for (int i = 1; i < tablica.length; i++) {
                // jeśli obecne maksimum jest mniejsze niż element tablicy
                if (maksimum < tablica[i]) {
                    // to znaczY ze musimy nadpisać maksimum
                    // znaleźliśmy większy element
                    maksimum = tablica[i];
                }
            }
            System.out.println("maksimum: " + maksimum);

            // znajdz i wypisz numer komórki największego elementu z tablicy

            int indeksMaksimum = 0;                     // indeks odpowiada numerowi komórki w tablicy
            int szukaneMaksimum = tablica[0];
            for (int i = 1; i < tablica.length; i++) {
                if (szukaneMaksimum < tablica[i]) {
                    szukaneMaksimum = tablica[i];
                    indeksMaksimum = i;
                }
            }
            System.out.println("Maksimum o wartości: " + szukaneMaksimum + " znalezione w komórce: " + indeksMaksimum);


            // wylicz średnią arytmetyczną

            double zmiennaSrednia = ((double) suma) / tablica.length;     // wynik jest, a średnia musi być double -> wymuszamy konwersję
            System.out.println("Srednia: " + zmiennaSrednia);

            //wytliczenie średniej arytmetycznej, wariant B

            double sumaDouble = suma;
            double zmiennaSrednia2 = sumaDouble / tablica.length;
            System.out.println("Srednia: " + zmiennaSrednia2);

            // wypisz ilość elementów większych od średniej

            System.out.println("Elementy większe od średniej:");

            // dla tablicy:
            // 1 3 5 2 10 13 20 7 = 61
            // średnia = 7,625
            // większych = 3

            int licznikWiekszychElementow = 0;
            for (int i = 0; i < tablica.length; i++) {
                if (tablica[i] > zmiennaSrednia2) {
                    System.out.println(tablica[1] + " ");
                    licznikWiekszychElementow = licznikWiekszychElementow + 1;
                }
            }
            System.out.println("Licznik większych elementów: " + licznikWiekszychElementow);

            // wypisz tablicę w odwrotnej kolejności
            // jeśli length = 10 - to ostatnia komórka ma numer 9
            // jeśli length = 5 - to ostatnia komórka ma numer 4

            for (int i = tablica.length - 1; i >= 0; i--) {
                System.out.println(tablica[i] + " ");
            }

            // sortowanie tablicy

            Arrays.sort(tablica);
            System.out.println();
            System.out.println(Arrays.toString(tablica));


            // // wypisanie mediany     (środkowa wartość tablicy)
            // długość / 2
            // 11 elementów: 0 1 2 3 4 [5] 6 7 8 9 10   -> mediana to 5 element
            // 10 elementów: 0 1 2 3 4 5 6 7 8 9        -> mediana to 4,5
            double mediana;
            if (tablica.length % 2 == 0) {
                // parzyszta liczba elementów
                int indeksSrodkowyElement = tablica.length / 2;

                int wartosc1 = tablica[indeksSrodkowyElement];
                int wartosc2 = tablica[indeksSrodkowyElement - 1];

                mediana = (wartosc1 + wartosc2) / 2.0;
            } else {

            // nieparzysta liczba elementów
            int indeksSrodkowyElement = tablica.length / 2;
            mediana = tablica[indeksSrodkowyElement];
        }
            System.out.println("Mediana: " + mediana);
            }
        }