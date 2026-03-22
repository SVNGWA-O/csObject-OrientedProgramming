package lecture10.answers;

import java.util.List;

public abstract class RottenTomatoes {

    public double averageScore(){
        List<FilmEntry> data = this.getFilmEntries();
        double total = 0.0;
        for(FilmEntry e : data){
            total += e.score;
        }

        return data.isEmpty() ? 0.0 : total / data.size();
    }

    public abstract List<FilmEntry> getFilmEntries();
}
