public class Author {
    private String name;
    private String surName;


    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName = surName;
    }

    public String toString() {
        return "автор: " + name + " " + surName;
    }

    public Author(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }
}


