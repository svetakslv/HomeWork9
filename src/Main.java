public class Main {

    public static void main(String[] args) {

        Author author = new Author("Stephen", "King");
        Book petSematary = new Book("Кладбище домашних животных",1983, author);
        petSematary.setPublishYear(1983);
        System.out.println(petSematary);

        Author pauloCoelho = new Author("Paulo", " Coelho");
        Book theAlchemist = new Book("The Alchemist", 1988, author);
        theAlchemist.setPublishYear(1988);
        System.out.println(theAlchemist);
    }
}

