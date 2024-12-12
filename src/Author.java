import java.util.Objects;

public class Author {
    private String surName;
    private String firstName;

    //Конструктор
    public Author(String surName, String firstName) {
        this.surName = surName;
        this.firstName = firstName;
    }

    //Геттеры и Сеттеры
    public String getSurName() {
        return surName;
    }

    public String getFirstName() {
        return firstName;
    }

    // Метод toString
    @Override
    public String toString() {
        return firstName + " " + surName;
    }

    // Метод equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Author author = (Author) obj;
        return Objects.equals(firstName, author.firstName) && Objects.equals(surName, author.surName);
    }

    // Метод hashCode
    @Override
    public int hashCode() {
        return Objects.hash(firstName, surName);
    }

}
