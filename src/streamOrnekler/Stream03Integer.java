package streamOrnekler;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream03Integer {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(12);
        liste.add(9);
        liste.add(13);
        liste.add(4);
        liste.add(9);
        liste.add(2);
        liste.add(-2);
        liste.add(4);
        liste.add(12);
        liste.add(-1);
        liste.add(15);
        liste.add(500);
        liste.add(-15);

        System.out.println("En BÜYÜK DEĞER:" + buyukBul(liste));
        System.out.println("En BÜYÜK DEĞER:" + buyukBul1(liste));
        System.out.println("En KÜÇÜK DEĞER:" + kucukBul(liste));
        System.out.println("ÇARPIM DEĞERİ:" + carpimBul(liste));
        System.out.println("Eleman Sayısı :" + elemanSay(liste,9));
        negatifSayilariYazdır(liste);
        List<Integer> negatifler = negatifSayiListesi(liste);
        System.out.println("\nNEGATİF LİSTE:" + negatifler);
        System.out.println("TEK SAYILARIN SIRALI KARESİ:" +tekKareSiraliListele(liste));
    }

    //**************************************************************************************
    // ORNEK7: Bir listedeki en büyük sayıyı döndüren metotu tanımlayınız.
    //**************************************************************************************
    public static int buyukBul(List<Integer> liste){
        return liste.stream().reduce(0, (x,y)-> x >y ? x:y);
    }

    //*****************************************************************************************
    // ORNEK8: Bir listedeki en büyük sayıyı döndüren metotu tanımlayınız. (METOT REFERANSI)
    //*****************************************************************************************
    public static int buyukBul1(List<Integer> liste){
        return liste.stream().reduce(0,Math::max);
    }

    //*****************************************************************************************
    // ORNEK9: Bir listedeki en büyük sayıyı SIRALAYARAK bulan ve döndüren metotu tanımlayınız.
    //*****************************************************************************************
    public static int buyukBul2(List<Integer> liste){
        return liste.stream().sorted().reduce(0,(x,y)->y);
    }

    //*****************************************************************************************
    // ORNEK10: Bir listedeki en küçük sayıyı bulan ve döndüren metotu tanımlayınız.
    //*****************************************************************************************
    public static int kucukBul(List<Integer> liste){
        return liste.stream().reduce(0,(x,y)-> x < y ? x:y);
    }

    //*****************************************************************************************
    // ORNEK11: Bir listedeki tüm elemanların  çarpımını bulan ve döndüren metotu tanımlayınız.
    //*****************************************************************************************
    public static int carpimBul(List<Integer> liste){
        return liste.stream().reduce(1,(x,y)-> x*y);
    }

    //********************************************************************************************
    // ORNEK12: Bir listede belirtilen elemandan kaç adet bulunduğunu döndüren metotu tanımlayınız.
    //********************************************************************************************
    public static int  elemanSay(List <Integer> liste, int eleman){
        return (int) liste.stream().filter(x -> x==eleman).count();
    }

    //********************************************************************************************
    // ORNEK13: Bir listedeki negatif sayıları yazdıran metodu tanımlayınız.
    //********************************************************************************************
    public static void negatifSayilariYazdır(List<Integer> liste){
        liste.stream().filter(x-> x<0).forEach(System.out::print);
    }
    //********************************************************************************************
    // ORNEK14: Bir listedeki negatif sayıları ayrı bir liste olarak döndüren metodu yazalım.
    //********************************************************************************************
    public static List<Integer> negatifSayiListesi(List<Integer> liste){
        return liste.stream().filter(x-> x<0).collect(Collectors.toList());
    }

    //********************************************************************************************
    // ORNEK15: Listedeki tek elemanların karelerini sıralı olarak ve tekrarsız bir şekilde
    // listeye kaydeden metodu yazınız. (Kare almak için pow() metodu kullanılabilir.
    //********************************************************************************************
    public static List<Integer> tekKareSiraliListele(List <Integer> liste){
      return liste.
              stream().
              distinct().
              filter(Metotlar::tekMi).
              map(x -> (int) Math.pow(x, 2)).   // pow() double döndürdüğü için int'e çevrilmesi gerekir
              distinct().
              sorted().                         // sorted(Comparator.reverseOrder()).  ----> Ters sıra için
              collect(Collectors.toList());
    }

}
