package lecture09.answers;
public class Song extends Media{
    public String lyrics;

    public Song(String title, String author, String lyrics){
        super(title, author);
        this.lyrics = lyrics;
    }


    @Override
    public boolean equals(Object o){
        if(o instanceof Song s){
            return super.equals(s);
        }
        return false;
    }

    public boolean isCreatedBy(String author){
        return this.author.equals(author);
    }

    public int howManyLyrics(){
        String[] lyricLines = this.lyrics.split("\n");
        return lyricLines.length + 1;
    }
}
