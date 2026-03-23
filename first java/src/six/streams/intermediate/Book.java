package six.streams.intermediate;

public class Book {

    String name;
    int publicationYear;
    double price;
    String category;

    public Book(String name, int publicationYear, double price, String category) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", publicationYear=" + publicationYear +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
