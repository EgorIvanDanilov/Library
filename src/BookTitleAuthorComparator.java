public class BookTitleAuthorComparator {
  public  int compare(Book o1, Book o2){
    String title1 = o1.getTitle();
    String title2 = o2.getTitle();
    int titleComparison = title1.compareTo(title2);
    if (title1.compareTo(title2) !=0) {
      return title1.compareTo(title2);
    }
  return o1.getAuthor().compareTo(o2.getAuthor());
  }
}
