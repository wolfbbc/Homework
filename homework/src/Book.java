public class Book {
    private int kitapSayfa;
    private String kitapAd;

    public Book(){

    }
    public Book(String kitapAd,int kitapSayfa){
        this.kitapAd = kitapAd;
        this.kitapSayfa = kitapSayfa;
    }

    public int getKitapSayfa() {
        return kitapSayfa;
    }

    public void setKitapSayfa(int kitapSayfa) {
        this.kitapSayfa = kitapSayfa;
    }

    public String getKitapAd() {
        return kitapAd;
    }

    public void setKitapAd(String kitapAd) {
        this.kitapAd = kitapAd;
    }


}
