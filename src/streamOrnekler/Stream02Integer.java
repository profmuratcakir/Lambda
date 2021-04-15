package streamOrnekler;

import java.util.ArrayList;
import java.util.List;

public class Stream02Integer {

    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(12);
        liste.add(9);
        liste.add(13);
        liste.add(4);
        liste.add(9);
        liste.add(2);
        liste.add(4);
        liste.add(12);
        liste.add(15);
        liste.add(500);
        tekKareYazdir(liste);
        System.out.println("\nTOPLAM:" + tekKupToplami(liste));
   }

    //**************************************************************************************
    // ORNEK5: Bir listedeki tek sayıların karelerini yazdıran bir metot tanımlayınız.
    //**************************************************************************************
    // map() metodu collection üzerinde bir transformation işlemi sağlayan ara işlem metodudur.
    // Eğer bir collectionın verilerininin değişik hallerini hesaplama istersek map() kullanabiliriz.
    public static void tekKareYazdir(List <Integer> l){
       l.stream().distinct().filter(Stream01Integer::tekMi).map(x->x*x).forEach(Stream01Integer::yazdir);
    }

    //**************************************************************************************
    // ORNEK6: Bir listedeki tek sayıların küplerinin toplamını hesaplayarak
    // döndüren bir metot tanımlayınız.
    //**************************************************************************************
    // reduce() bir terminal işlemidir. Stream hattını kapatır ve tek bir sonuç üretir.
    // Collection'ı indirgeme işlemini lambda fonksiyonu veya metot refransı ile yapabiliriz.
    public static Integer tekKupToplami(List <Integer> l){
    //  return l.stream().filter(Stream01Integer::tekMi).map(x->x*x*x).reduce(0,(x,y)-> (x+y));
    //  return l.stream().filter(Stream01Integer::tekMi).map(x->x*x*x).reduce(Math::addExact);
        return l.stream().filter(Stream01Integer::tekMi).map(x->x*x*x).reduce(0, Integer::sum);
    }
}
