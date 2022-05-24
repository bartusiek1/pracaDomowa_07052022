package pl.sda.arp4;

public class MainTworzenieFunkcjiZadanie {

    public static void main(String[] args) {
        int[] tablica = new int[] {1,2,3,4,5};

        int suma = sumujElementy(tablica);
        System.out.println("Suma: " + suma);
        System.out.println(sumujElementy(tablica));

        int minimum = szukaneMinimum(tablica);
        System.out.println("Szukane minimum to: " + minimum);

        int maksimum = wyszukajMaksimum(tablica);
        System.out.println("Szukane maksimum to: " + maksimum);


        int indeksMax = znajdzIndeksMaksimum(tablica);
        System.out.println("Największa wartość znajduje się w komórce nr: " + indeksMax);

    }

    private static int znajdzIndeksMaksimum(int[] tablica) {
        int indeksMaksimum = 0;
        int szukaneMaksimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (szukaneMaksimum < tablica[i]) {
                szukaneMaksimum = tablica[i];
                indeksMaksimum = i;
            }
        }
        return indeksMaksimum;
    }

    private static int wyszukajMaksimum(int[] tablica) {
        int maksimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            // jeśli obecne maksimum jest mniejsze niż element tablicy
            if (maksimum < tablica[i]) {
                // to znaczY ze musimy nadpisać maksimum
                // znaleźliśmy większy element
                maksimum = tablica[i];
            }
        }
        return maksimum;
    }

    private static int szukaneMinimum(int[] tablica) {
        int minimum = tablica[0];
        for (int i = 1; i < tablica.length; i++)

        {
            // jeśli obecne minimum jest większe niż element tablicy
            if (minimum > tablica[i]) {
                // to znaczY ze musimy nadpisać minimum
                // znaleźliśmy mniejszy element
                minimum = tablica[i];
            }
        }
        return minimum;
    }

    private static int sumujElementy(int[] tablica) {
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma = suma + tablica[i];
        }
        return suma;            // zwracamy wynik, w tym wypadku - sumę
    }
}
