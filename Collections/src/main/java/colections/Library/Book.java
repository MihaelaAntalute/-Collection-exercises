package colections.Library;

public class Book implements Comparable <Book>{
    private String title;
    private int year;
    private String author;
    private String genre;

    public Book(String title, int year, String author, String genre) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.genre = genre;
    }
//    public Book(){
//
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }


    @Override
    public int compareTo(Book book1) {
        return  Integer.compare(year,book1.getYear());
    }
}
