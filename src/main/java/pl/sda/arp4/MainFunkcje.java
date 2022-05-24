package pl.sda.arp4;

public class MainFunkcje {
    public static void main(String[] args) {

        int[] tablica = new int[10];

        // wypisanie tablicy
        funkcjaWypiszTablice(tablica);
    }

    private static void funkcjaWypiszTablice(int[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i] + " ");
        }
    }
}
