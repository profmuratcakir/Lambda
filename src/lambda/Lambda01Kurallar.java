package lambda;
import java.util.Arrays;
import java.util.List;

// Javada Lambda fonksiyonları sadece Fonksiyonel interface'ler ile kullanılabilir.
// Sadece bir adet abstract metodu olan interface'lere fonksiyonel interface denilir.
// Kullanıcı isterse kendi fonksiyonel interface'ini yazabilir. Ama Javada hali hazırda
// Consumer, Function, Supplier, Predicate gibi tanımlanmış interfaceler bulunmaktadır.
// Ayrıca bu interface'leri parametre olarak alabilen High Order Function (HOF)'lar da bulunmaktadır.
// foreEach(), map(), filter(), reduce() gibi HOF'lar fonksiyonel interfaceler ile çalıştığı için
// içerisinde Lambda fonksiyonları yazmak mümkündür.
// Javada genelde bu gibi fonksiyonlar üzerinden Lambda ifadeleri kullanılmaktadır.

public class Lambda01Kurallar {
    public static void main(String[] args) {

        List<Integer> liste = Arrays.asList(1,2,3,4,5);

        // forEach() bir collection'nın iterasyonu için kullanılan HOF'dur.
        // Parametre olarak bir lambda fonksiyonu alabilir.

        // Dizinin Elemanlarını yazdıralım
        System.out.println("=== Dizinin Elamanlarını Yazdır ===");
        liste.forEach((x) ->System.out.print(x));

        //Listenin elemanlarını 2 arttırarak yazdıralım.
        System.out.println("\n == Dizinin Elamanlarını 2 arttırarak Yazdır ==");
        liste.forEach(t-> System.out.print(t+2 + " "));

        System.out.println("\n=== Eğer satır sayısı 1'den fazla ise {} kullanmalıyız..=== ");
        liste.forEach(t-> {
            int miktar = 2;
            System.out.print(t + miktar + " ");
        });

        System.out.println("\n === Veri tipi kullanılırsa : Explicit ==");
        System.out.println("Dizinin Elemanlarının 2 katını yazdır.");
        liste.forEach((Integer x) -> System.out.print(x*2 + " "));

        System.out.println("\nLambda ifadesinde dış değişkenler kullanalıbilir");
        System.out.println("Ancak bu değişken Final gibi davranır.");
        int deger= 6;
        liste.forEach(t-> System.out.println(t+deger));

        // Metot Refransı =====> Class adı :: Metot adı
        System.out.println("\nJavanın Method referansını kullanabiliriz");
        liste.forEach(System.out::print);

        // Metot Referansı =====> Class adı :: Metot adı
        System.out.println("\nKendimizin yazdığı metotları da Method referansı olarak kullanabiliriz");
        liste.forEach(Lambda01Kurallar::yazdır);
    }
    // int değer yazdıran metot
    public static void yazdır(int x){
        System.out.print(x + " ");
    }
}
