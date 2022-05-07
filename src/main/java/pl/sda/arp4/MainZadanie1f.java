package pl.sda.arp4;

// liczby parzyste z zakresu -100 - 100 w tej samej linii oddzielone średnikami

public class MainZadanie1f {
    public static void main(String[] args) {
        for (int i = -101; i < 100; i++) {
            if (i % 2 != 0)
            System.out.print(i + 1 + ";");
            }
        }
    }
