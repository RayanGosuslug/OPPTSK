public class Main {
    public static void main(String[] args) {
        Library VSUL = new LibraryOfVSU("Библиотека ВГУ");
        Book book = new Book("VSULIB", "Сказки", "Сказки", "Пушкин", 100);
        VSUL.libraryType();
        book.displayInfo();
    }
}