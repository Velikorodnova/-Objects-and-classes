public class Main {
    public static void main(String[] args) {
        Author author_1 = new Author("Джоан", "Роулинг");
        Author author_2 = new Author("Стивен", "Кинг");

        Book book1 = new Book("Гарри Поттер и узник Азкабана", author_1, 1999);
        System.out.println("book1 = " + book1.getBookName() + ", " + book1.getAuthor() + ", " + book1.getPublicationYear());

        Book book2 = new Book("Дьюма-Ки", author_2, 2008);
        System.out.println("book2 = " + book2.getBookName() + ", " + book2.getAuthor() + ", " + book2.getPublicationYear());

        book2.setPublicationYear(2009);
        System.out.println("book2 = " + book2.getBookName() + ", " + book2.getAuthor() + ", " + book2.getPublicationYear());

    }


}