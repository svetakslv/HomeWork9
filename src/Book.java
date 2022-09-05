import java.util.Objects;

public class Book {

    private String title;
    private int publishYear;
    private Author author;

    public String getTitle() {
        return title = title;
    }

    public int getPublishYear() {
        return publishYear = publishYear;
    }

    public Author getAuthor() {
        return author = author;
    }

    public Book(String title, int publishYear, Author author) {
        this.title = title;
        this.publishYear = publishYear;
        this.author = author;

    }

    public void setPublishYear(int publishYear) {
        if (publishYear < 1980 || publishYear > 2050) {
            System.out.println("Неверно введенная дата публикации: " + publishYear);
            return;
        }
        this.publishYear = publishYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return publishYear == book.publishYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publishYear, author);
    }

    @Override
    public String toString() {
        return  "Название книги: " + title +
                ", год публикации: " + publishYear +
                ", автор: " + author + ".";
    }
}
