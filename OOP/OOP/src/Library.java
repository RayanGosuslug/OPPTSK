abstract class Library {
    private String library;

    public Library(String libname) {
        this.library = libname;
    }

    public String getLibName() {
        return library;
    }

    public void setLibName(String libname) {
        this.library = libname;
    }

    public void displayInfo() {
        System.out.println("Библиотека: " + library);
    }

    public abstract void libraryType();
}

