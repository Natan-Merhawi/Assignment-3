package Question1.Assignment3;

public class Book {
    public String title;
    public String author;
    private String isbn;
    int copiesAvailable;


    public Book(String title,String author,String string, int copiesAvailable){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.copiesAvailable=copiesAvailable;
    }

    public Book(String title2, String author2, int copiesAvailable2) {
        
    }

    public String getIsbn() {
        return isbn;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public String getAuthor() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getAuthor'");
    }
}
