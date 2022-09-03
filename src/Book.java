public class Book {
    String name;
    int year;


    public static Book Book(String name, int year) {
        Book book = new Book();
        book.name = name;
        book.year = year;
        return book;
    }

}
