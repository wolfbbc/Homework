import java.util.TreeSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Suç ve ceza",100);
        Book book2 = new Book("Martin eden",120);
        Book book3 = new Book("Oblomov",140);
        Book book4 = new Book("Fareler ve insalar",110);
        Book book5 = new Book("Beyaz diş", 180);


        TreeSet<Book> trSet = new TreeSet<>(new OrderPageComparator());

        trSet.add(book1);
        trSet.add(book2);
        trSet.add(book3);
        trSet.add(book4);
        trSet.add(book5);
        System.out.println("-Sayfa sayısına göre küçükten büyüğe sıralama-");
        for (Book books : trSet){
            System.out.println(books.getKitapAd());
        }

        TreeSet<Book> treeSet2 = new TreeSet<>(new OrderNamePage());
        treeSet2.add(book1);
        treeSet2.add(book2);
        treeSet2.add(book3);
        treeSet2.add(book4);
        treeSet2.add(book5);
        System.out.println("-Alfabeye göre kitap sıralaması-(A-Z)");
        for (Book books : treeSet2){
            System.out.println(books.getKitapAd());
        }
    }
}