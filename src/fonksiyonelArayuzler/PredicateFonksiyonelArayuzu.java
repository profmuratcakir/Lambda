package fonksiyonelArayuzler;
import java.util.function.Predicate;

//Predicate fonksiyonel arayüzü ile ilgili bir örnek
public class PredicateFonksiyonelArayuzu {
    public static void main(String[] args) {
        Predicate<Kisi> predicate = (kisi) -> kisi.getYas() > 18;
        boolean sonuc = predicate.test(new Kisi("Yusuf", 20));
        System.out.println(sonuc);
    }
 }
