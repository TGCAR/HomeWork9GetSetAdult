import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int year;

    //    Конструктор
    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    //    Геттеры и сеттеры
    public String getName() {

        return name;
    }

    public Author getAuthor() {

        return author;
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {

        this.year = year;
    }
    @Override
    public String toString() {
        return name + " " + author + " " + year;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return year == book.year && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    // Метод hashCode
    @Override
    public int hashCode() {
        return Objects.hash(name, author, year);
    }
}
