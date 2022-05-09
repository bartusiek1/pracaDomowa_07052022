package pl.sda.arp4;

import java.util.Scanner;


// Napisać program pobierający  od użytkownika dwie liczby całkowite A oraz B, A < B, a
//następnie wyznaczający sumę ciągu liczb od A do B, czyli sumę ciągu (A,A + 1,...,B).
//Obliczenia  należy  wykonać  dwukrotnie  stosując  kolejno  pętle:  while, for.

public class MainZadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj A:");
        int a = scanner.nextInt();

        System.out.println("Podaj B:");
        int b = scanner.nextInt();

        if (b < a) {
            System.out.println("Błąd Podałeś błędne liczby");
        }
            int suma = 0;
            for (int i = a; i <=b ; i++) {
                suma = suma + i;
            }
            System.out.println(suma);
            }
        }
