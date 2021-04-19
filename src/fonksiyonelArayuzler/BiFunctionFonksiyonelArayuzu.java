package fonksiyonelArayuzler;

import java.util.function.BiFunction;

public class BiFunctionFonksiyonelArayuzu {
    public static void main(String[] args) {

        BiFunction<Kisi, Kisi, Integer> biFunction = (k1, k2) -> k1.getYas() + k2.getYas();
        int toplamYas = biFunction.apply(new Kisi("John", 40),
                                        new Kisi("Jeniffer", 20));
        System.out.println(toplamYas);
    }
}
