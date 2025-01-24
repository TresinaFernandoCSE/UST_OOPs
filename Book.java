
// Program 8: Class with Getters and Setters
class Book {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Book b = new Book("Java Programming", 450.5);
        System.out.println("Book: " + b.getTitle() + ", Price: " + b.getPrice());
        b.setPrice(500.0);
        System.out.println("Updated Price: " + b.getPrice());
    }
}
