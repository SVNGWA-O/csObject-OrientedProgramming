package lecture09.answers;
public class Media {
    public String title;
    public String author;

    public Media(String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString(){
        return String.format("\"%s\" by %s", this.title, this.author);
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Media m){
            return this.title.equals(m.title) && this.author.equals(m.author);
        }
        return false;
    }

    public boolean isCreatedBy(String author){
        return this.author.equals(author);
    }


}
