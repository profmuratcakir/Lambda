package fonksiyonelArayuzler;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionFonksiyonelArayuzu {
    public static void main(String[] args) {
        System.out.print("Virgülle ayrılmış olarak sayıları giriniz:");
        Scanner scanner = new Scanner(System.in);
        String[] giris = scanner.nextLine().split(",");
        Function<String, Integer> cevirici = x -> Integer.parseInt(x);
        int toplam = 0;
        for (String s : giris) {
            toplam += cevirici.apply(s);
        }
        System.out.println("Sayısı = " + giris.length);
        System.out.println("Toplamı = " + toplam);
    }

}
