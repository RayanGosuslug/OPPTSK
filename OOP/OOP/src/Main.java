import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Library VSUL = new LibraryOfVSU("Библиотека ВГУ");
        Library VRNLib = new LibraryOfVoronezh("Воронежская Государственная Библиотека");
        Book book = new Book("VSULIB", "Сказки", "Сказки", "Пушкин", 100);
        Book book1 = new Book("VRNLIB", "Рассказы", "Бедность", "Макс Максбетов", 1337);
        ArrayList<Library> SkaZochki = new ArrayList<>();
        SkaZochki.add(book);
        SkaZochki.add(book1);
        for(Library SkaZochkis : SkaZochki){
            SkaZochkis.displayInfo();
        }
    }
}