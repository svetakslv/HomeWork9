public class Main {
    public static void main(String[] args) {

        Book horror = new Book("Pet Sematary",1983);
        System.out.println("horror.name = " + horror.name);
        System.out.println("horror.year = " + horror.year);


        Book novel = new Book("The Alchemist", 1988);
        System.out.println("novel.name = " + novel.name);
        System.out.println("novel.year = " + novel.year);


    }
}