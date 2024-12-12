public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Ivanov", "Andrey");
        Author secondAuthor = new Author("Borisov", "Ivan");

        Book Azbuka = new Book("Azbuka", firstAuthor, 2024);
        Book Literatura = new Book("Literatura", secondAuthor, 2024);

        System.out.println(firstAuthor.toString());  // Ivanov Andrey
        System.out.println(secondAuthor.toString()); // Borisov Ivan

        System.out.println(Azbuka.toString());  // Book: Azbuka, Author: Ivanov Andrey, Year: 2024
        System.out.println(Literatura.toString());  // Book: Literatura, Author: Borisov Ivan, Year: 2024
    }

}
