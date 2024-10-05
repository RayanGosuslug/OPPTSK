class Book extends Shelf {
    private String name;
    private String author;
    private int pages;
    public Book(String library, String category, String name, String author, int pages) {
        super(library, category);
        this.name = name;
        this.author = author;
        this.pages = pages;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Книга: " + name + " Автор: " + author + " "+ pages + " Страниц");
    }
}
