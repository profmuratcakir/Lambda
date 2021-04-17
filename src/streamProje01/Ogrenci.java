package streamProje01;

public class Ogrenci {
    private String ad;
    private String soyAd;
    private int yas;
    private double diplomaNotu;
    private String cinsiyet;

    public Ogrenci(String ad, String soyAd, int yas, double diplomaNotu, String cinsiyet) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.yas = yas;
        this.diplomaNotu = diplomaNotu;
        this.cinsiyet = cinsiyet;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getDiplomaNotu() {
        return diplomaNotu;
    }

    public void setDiplomaNotu(double diplomaNotu) {
        this.diplomaNotu = diplomaNotu;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    @Override
    public String toString() {
        return "ad='" + ad + '\'' +
                ", soy ad='" + soyAd + '\'' +
                ", yaş=" + yas +
                ", diploma Notu=" + diplomaNotu +
                ", cinsiyet='" + cinsiyet + '\'';
    }
}
