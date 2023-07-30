public class Main {

  public static void main(String[] args) {
    // Создайте класс Book (книга), в конструктор которого
    // передавайте автора, название книги и количество страниц.
    // Реализуйте интерфейс для сравнения книг: они должны сортироваться
    // по авторам, а если авторы совпадают - по названиям (и там, и там - по алфавиту, "в словарном порядке"),
    // а если и авторы совпадают - по количеству страниц (по возрастанию).
  }
  private static void compareBooks(Book book1, Book book2){
    if(book1.equals(book2)){
      System.out.println("The " + book1 + " matchs the "+ book2);
    } else {
      System.out.println("The"  + book1 + " does not match the "+ book2);
    }
  }
}