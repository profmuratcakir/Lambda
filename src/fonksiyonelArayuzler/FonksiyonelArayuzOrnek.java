package fonksiyonelArayuzler;
/*
    Kendi fonksiyonel arayüzümüzü tanımlayabiliriz.
*/
@FunctionalInterface
interface MesajVer{
    void merhaba(String mesaj);         // abstract metot

    default void bye(){                 // Concrete metot
        System.out.println("Güle Güle");
    }
}

public class FonksiyonelArayuzOrnek {
    public static void main(String[] args) {

        MesajVer mesajVer = (msg) -> System.out.println(msg);
        mesajVer.merhaba ("Merhaba fonksiyonel arayüzler.");
        mesajVer.bye();

    }
}
