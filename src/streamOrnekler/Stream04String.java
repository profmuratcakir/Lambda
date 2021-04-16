package streamOrnekler;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Stream04String {

    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Jackson");
        liste.add("Amanda");
        liste.add("alihano");
        liste.add("Mariano");
        liste.add("alberto");
        liste.add("Alonzo");
        liste.add("Tucker");
        liste.add("Alfonso");
        liste.add("Christ");

        aIleBaslayanlar(liste);
        System.out.println("===========");
        buyukHarfeCevir(liste);
        System.out.println("===========");
        uzunlugaGoreYazdir(liste,3);
        System.out.println("TÜM ELEMANLAR BELİRTİLEN DEĞERDEN KÜÇÜK:" + uzunlukKucukMu(liste,7));
        System.out.println("BAŞLAYAN YOK MU:"+ baslamayanHarfVarMi(liste,"M"));
        System.out.println("HERHANGİ BİTEN HARF VAR MI:" + herhangiBitenVarMi(liste,"c"));
        System.out.println("===========");
        aileOYazdir(liste);
        System.out.println("===========");
        uzunlugaGoreKucultSirala(liste);
        System.out.println("===========");
        listeleYazdir(liste);
        System.out.println("\n===========");
        yazdir(liste);
        System.out.println("\n===========");
    }

    //********************************************************************************************
    // ORNEK16: Listedeki baş harfi A ile başlayan isimleri yazdıran metodu tanımlayalım..
    //********************************************************************************************
    public static void aIleBaslayanlar(List<String> liste){
        liste.stream().filter(h-> h.startsWith("A")).forEach(System.out::println);
    }

    //********************************************************************************************
    // ORNEK17: Listedeki tüm isimleri büyük harfe çeviren metodu tanımlayalım..
    //********************************************************************************************
    public static void buyukHarfeCevir(List<String> liste){
        liste.stream().map(h-> h.toUpperCase()).forEach(System.out::println);
    }

    //********************************************************************************************
    // ORNEK18: Listedeki tüm elemanların uzunlukları belirtilen uzunluktan fazla ise bunları yazdıran
    // metodu tanımlayalım..
    //********************************************************************************************
    public static void uzunlugaGoreYazdir (List <String> liste, int uzunluk){
        liste.stream().filter(t->t.length() > uzunluk).forEach(System.out::println);
    }
    //********************************************************************************************
    // ORNEK19: Listedeki tüm elemanların uzunluklarına göre sıralayarak KÜÇÜK harf olarak yazdıran
    // metodu tanımlayalım..
    //********************************************************************************************
    public static void uzunlugaGoreKucultSirala (List<String>liste) {
        liste.stream().
                sorted(Comparator.comparing(t -> t.length())).
                map(t -> t.toLowerCase()).
                forEach(System.out::println);
    }
    //*****************************************************************************************
    // ÖRNEK20: Listedeki TÜM elemanların uzunlukları belirtilen uzunluktan KÜÇÜK mü
    // diye kontrol eden metodu yazınız.
    //*****************************************************************************************
    //ALLMATCH() Belirtilen şartları tüm elemanlar sağlıyorsa true döndürür. yoksa false
    public static boolean uzunlukKucukMu(List <String> liste,int uzunluk ){
        return liste.stream().allMatch(t->t.length() < uzunluk);
    }
    //****************************************************************************************************
    // ÖRNEK21: Listedeki TÜM elemanların belirtilen harfi ile başlamadığını kontrol eden metodu yazınız.
    //****************************************************************************************************
    //noneMatch() Belirtilen sartları tüm elemanlar sağlamıyorsa true aksi takdirde false döndürür.
    public static boolean baslamayanHarfVarMi(List <String> liste, String harf){
        return liste.stream().noneMatch(t->t.startsWith(harf));
    }

    //****************************************************************************************************
    // ÖRNEK22: Listede Herhangi bir elaman belirtilen bir harf ile bitiyor mu diye kontrol eden metodu yazınız.
    //****************************************************************************************************
    //anyMatch() Belirtilen şartları sağlayan tek bir eleman bile varsa true aksi takdirde false döndürür.
    public static boolean herhangiBitenVarMi(List <String> liste, String harf){
      return liste.stream().anyMatch(t->t.endsWith(harf));
    }
    //****************************************************************************************************
    // ÖRNEK23: A ile başlayıp O ile biten elemanları yazdıran metotu tanımlayınz.
    //****************************************************************************************************
    public static void aileOYazdir(List <String> liste){
        liste.stream().
                filter(x -> (x.startsWith("A") || x.startsWith("a")) && x.endsWith("o")).
                forEach(System.out::println);
    }

    //****************************************************************************************************
    //  ÖRNEK24: Aşağıdaki formata göre listedeki her bir elemanın uzunluğunu yazdıran metodu yazınız.
    //  Ali: 3        Mark: 4       Amanda: 6     vb.
    //****************************************************************************************************
    public static void listeleYazdir (List<String> liste) {
        liste.stream().sorted(Comparator.comparing(String::length)).
                map(t-> t  + " : " + t.length() + "\t").
                forEach(System.out::print);
    }
    //****************************************************************************************************
    //  ÖRNEK25: Küçük Büyük harf ayırmaksızın A harfi ile başlayan isimleri yazdıran metodu tanımlayınız.
    //****************************************************************************************************
    public static void yazdir(List <String>liste) {
        liste.stream().
                map(String::toLowerCase).
                filter(t->t.startsWith("a")).
                forEach(System.out::println);
    }
 }
