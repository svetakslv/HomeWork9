public class Book {

    private String title;
    private int publishYear;
    private Author author;


    public Book(String title, int publishYear, Author author) {
        this.title = title;
        this.publishYear = publishYear;
        this.author = author;
    }

    public String toString() {
        return "Книга - " + title +
                ", дата публикации - " + publishYear +
                ", " + author;
    }

    public void setPublishYear(int i) {
    }
}
