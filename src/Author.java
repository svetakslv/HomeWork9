import java.util.Objects;

public class Author {
    private String name;
    private String surName;


    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName = surName;
    }

    public Author(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return name.equals(author.name) && surName.equals(author.surName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surName);
    }

    @Override
    public String toString() {
        return "Ф.И.О. автора - " +
                "имя: " + name +
                ", фамилия: " + surName;
    }
}


