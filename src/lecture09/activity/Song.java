package lecture09.activity;
public class Song extends Media{
    public String lyrics;

    public Song(String title, String author, String lyrics){
        super(title, author);
        this.lyrics = lyrics;
    }


    @Override
    public boolean equals(Object o){
        if(o instanceof Song b){
            return super.equals(b);
        }
        return false;
    }


    public int howManyLyrics(){
        String[] lyricLines = this.lyrics.split("\n");
        return lyricLines.length;
    }
}
