package lecture09.activity;

public class Media {
    String author;
    String title;

    public Media(String title, String author){
        this.title = title;
        this.author = author;

    }

    public boolean equals(Object o){
        if(o instanceof Media m){
            return this.title.equals(m.title)&& this.author.equals(m.author);
        }
        else {
            return false;
        }
    }
    public boolean isCreatedBy(String author){
        return this.author.equals(author);
    }

    public String toString(){
        return String.format("\"%s\" by %s", this.title, this.author);
    }


}
