public class Main {

  public static void main(String[] args) {
    // Создайте класс Book (книга), в конструктор которого
    // передавайте автора, название книги и количество страниц.
    // Реализуйте интерфейс для сравнения книг: они должны сортироваться
    // по авторам, а если авторы совпадают - по названиям (и там, и там - по алфавиту, "в словарном порядке"),
    // а если и авторы совпадают - по количеству страниц (по возрастанию).
    String name1 = "Experiment";
    String author1 = "Brothers Strugatsky";
    Book book1 = new Book(name1, author1);

    String name2 = "One Hundred Years of Solitude";
    String author2 = "Gabriel Garcia Marquez";
    Book book2 = new Book(name2, author2);

    String name3 = "Don Quixote";
    String author3 = "Miguel de Cervantes";
    Book book3 = new Book(name3, author3);

    String name4 = "Don Quixote";
    String author4 = "Miguel de Cervantes";
    Book book4 = new Book(name4, author4);

    compareBooks(book1, book2);
    compareBooks(book3, book4);

  }
  private static void compareBooks(Book book1, Book book2){
    if(book1.equals(book2)){
      System.out.println("The " + book1 + " matches the "+ book2);
    } else {
      System.out.println("The "  + book1 + " does not match the "+ book2);
    }
  }
}