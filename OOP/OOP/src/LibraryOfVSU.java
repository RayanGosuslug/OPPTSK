public class LibraryOfVSU extends Library {

    public LibraryOfVSU(String libname) {
        super(libname);
    }

    @Override
    public void libraryType() {
        System.out.println("Библиотека ВГУ.");
    }
}
