public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Гарри Поттер и узник Азкабана", "Джоан Роулинг", 1999);
        System.out.println("book1 = " + book1.getBookName() + ", " + book1.getAuthor() + ", " + book1.getPublicationYear());
        Book book2 = new Book("Дьюма-Ки", "Стивен Кинг", 2008);
        System.out.println("book2 = " + book2.getBookName() + ", " + book2.getAuthor() + ", " + book2.getPublicationYear());
        book2.setPublicationYear(2009);
        System.out.println("book2 = " + book2.getBookName() + ", " + book2.getAuthor() + ", " + book2.getPublicationYear());

    }


}