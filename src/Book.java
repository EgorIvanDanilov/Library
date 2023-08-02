public class Book {
  private String name;
  private String author;

  public Book(String name, String author) {
    this.name = name;
    this.author = author;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getTitle() {
    return name;
  }
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }

  @Override
  public String toString(){
    return "Book: " + getTitle() + " Author: " + getAuthor();
  }

  //public int getHashCode() {
    //Доделать
    //return  Object.getHash(name, author);
  //}

  @Override
  public  boolean equals(Object obj) {
    if(this==obj){
      return true;
    }
    if(!(obj instanceof Book book)){
      return false;
    }
    return (this.getTitle().equals(book.getTitle()) && this.getAuthor().equals(book.getAuthor()));
  }

}
