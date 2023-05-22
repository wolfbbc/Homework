import java.util.Comparator;

public class OrderNamePage implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getKitapAd().compareTo(o2.getKitapAd());
    }
}
