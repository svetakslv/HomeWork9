public class Author {
    private String name;
    private String surName;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surName = surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String toString() {
        return "автор: " + name + " " + surName;
    }

    public Author(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }
}


