public class LibraryOfVoronezh extends Library {
    public LibraryOfVoronezh(String libname) {
        super(libname);
    }

    @Override
    public void libraryType() {
        System.out.println("Библиотека Воронежа.");
    }
}
