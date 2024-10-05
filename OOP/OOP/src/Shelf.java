class Shelf extends Library {
    private String category;
    public Shelf(String library, String category) {
        super(library);
        this.category = category;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Категория полки: " + category);
    }

    @Override
    public void libraryType() {
    }
}
