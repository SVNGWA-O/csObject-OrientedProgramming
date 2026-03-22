package lecture09.answers;
import java.util.List;

public class Book extends Media{
    public List<String> chapters;

    public Book(String title, String author, List<String> chapters){
        super(title, author);
        this.chapters = chapters;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Book b){
            return super.equals(b);
        }
        return false;
    }

    public int numberOfChapters(){
        return this.chapters.size();
    }
}
