package streamOrnekler;

import java.util.ArrayList;
import java.util.List;

public class Stream01Integer {

    public static void main(String[] args) {

        List<Integer> rakamlar = new ArrayList<>();
        rakamlar.add(5);
        rakamlar.add(5);
        rakamlar.add(7);
        rakamlar.add(7);
        rakamlar.add(9);
        rakamlar.add(-1);
        rakamlar.add(2);
        rakamlar.add(4);
        rakamlar.add(-1000);
        rakamlar.add(4);

        System.out.println("==== TEK SAYILAR ======");
        rakamlar.stream().filter(t -> t%2 != 0).forEach(x ->System.out.print(x));

        System.out.println("\n==== ÇİFT SAYILAR ======");
        rakamlar.stream().filter(t -> t%2 == 0).forEach(Stream01Integer::yazdır);

        System.out.println("\n==== TEK SAYILAR =====");
        rakamlar.stream().filter(Stream01Integer::tekMi).forEach(Stream01Integer::yazdır);

    }
    public static boolean tekMi(int x){
        return x % 2 != 0;
    }


    public static void yazdır(int x){
        System.out.print( x + " ");
    }


}
