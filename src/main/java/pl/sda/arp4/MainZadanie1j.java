package pl.sda.arp4;

// litery  od ‘a’ do ‘z’ tylko co drugą zaczynając od ‘b’ i tylko jeśli jej kod ascii jest
//podzielny przez 5

public class MainZadanie1j {
    public static void main(String[] args) {
        for (int i = 'b'; i <= 'z'; i += 2) {
            if (i % 5 == 0) {
                System.out.println((char) i);
            }
        }
    }
}
