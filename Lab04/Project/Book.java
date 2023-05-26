import java.util.ArrayList;

public class Book {
    private int id;
    private String title;
    private String category;
    private ArrayList<String> authors;
    
    public Book(int id, String title, String category, ArrayList<String> authors) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.authors = authors;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getCategory() {
        return category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    
    public ArrayList<String> getAuthors() {
        return authors;
    }
    
    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }
    
    public void addAuthor(String authorName) {
        authors.add(authorName);
    }
    
    public void removeAuthor(String authorName) {
        authors.remove(authorName);
    }
}