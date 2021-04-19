package fonksiyonelArayuzler;
import java.util.function.Supplier;

// Supplier Fonksiyonel arayüz örneği
public class SupplierFonksiyonelArayuzu {

    public static void main(String[] args) {
        Supplier<Kisi> supplier = () -> new Kisi("Hasan", 30) ;

        Kisi kisi = supplier.get();
        System.out.println("Kişi Detayı:\n" + kisi.getIsim() + ", " + kisi.getYas());
    }
}
