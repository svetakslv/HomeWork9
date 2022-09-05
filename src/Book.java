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

    public String toString() {
        return "Книга - " + title +
                ", дата публикации - " + publishYear +
                ", " + author;
    }

    public void setPublishYear(int publishYear) {
        if (publishYear < 1980 || publishYear > 2030) {
            System.out.println("Неверно введенная дата публикации: " + publishYear);
            return;
        }
        this.publishYear = publishYear;
    }
}
