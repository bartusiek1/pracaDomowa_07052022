package pl.sda.arp4;

// Wygeneruj 100 liczb z zakresu 0-50 i wypisz je na ekran.

import java.util.Arrays;
import java.util.Random;

public class MainZadanieTablica4 {
    public static void main(String[] args) {
        int[] tablica = new int[100];

        for (int i = 0; i < tablica.length; i++) {
            int wylosowanaLiczba = new Random().nextInt(50);

            tablica[i] = wylosowanaLiczba;
        }
        System.out.println("Wynik 1");
        System.out.println(Arrays.toString(tablica));


        // Wygeneruj 100 liczb z zakresu 100-1000 i wypisz je na ekran w jednej linii oddzielone spacją.

        int[] tablica1 = new int[100];

        for (int i = 0; i < tablica1.length; i++) {
            int wylosowanaLiczba1 = new Random().nextInt(901) + 100;

            tablica1[i] = wylosowanaLiczba1;
        }
        System.out.println();
        System.out.println("Wynik 2");
        System.out.print(Arrays.toString(tablica1) + " ");
        System.out.println();


        // Wygeneruj 1000 liczb z zakresu -200 do 5000, wypisz je w jednej linii na ekran

        int[] tablica2 = new int[1000];

        for (int i = 0; i < tablica2.length; i++) {
            int wylosowanaLiczba2 = new Random().nextInt(5201) -200;

            tablica2[i] = wylosowanaLiczba2;
        }
        System.out.println();
        System.out.println("Wynik 3");
        System.out.println(Arrays.toString(tablica2) + " ");
        System.out.println();


        // Wygeneruj 10 liczb z zakresu 0-10 wypisz je na ekran i sprawdź jak często pojawia się tam liczba 5

        int[] tablica3 = new int[10];

        for (int i = 0; i < tablica3.length; i++) {
            int wylosowanaLiczba3 = new Random().nextInt(10);

            tablica3[i] = wylosowanaLiczba3;
        }
        System.out.println("Wynik 4");
        System.out.println(Arrays.toString(tablica3));

        int licznik = 0;
        for (int i = 0; i < tablica3.length; i++) {
            if (tablica3[i] == 5) {
                licznik++;
            }
        }
        System.out.println("Wylosowano: " + licznik + " piątek");


        //  Wygeneruj 20 liczb z zakresu 1-5 i wypisz je na ekran, zlicz ilość wystąpień liczby 2 i 4.

        int[] tablica4 = new int[20];
        int licznik1 = 0;
        int licznik2 = 0;
        for (int i = 1; i < tablica4.length; i++) {
            int liczba4 = new Random().nextInt(5) + 1;

            if (liczba4 == 2) {
                licznik1 = licznik1 + 1;
            } else if (liczba4 == 4) {
                licznik2 = licznik2 + 1;
            }
            System.out.println();
            System.out.println("Wynik 5");
            System.out.print(liczba4 + " ");
        }
        System.out.println();
        System.out.println("ilość dwójek to: " + licznik1 + " a ilość czwórek to: " + licznik2);
    }
}
