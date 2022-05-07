package pl.sda.arp4;

// litery od 'A' do 'Z', tylko co drugą

public class MainZadanie1i {
    public static void main(String[] args) {
        for (char c = 'A'; c <= 'Z'; c+=2) {
            System.out.println(c);
        }
    }
}
