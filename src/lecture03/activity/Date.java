package lecture03.activity;

/**
 * a Simple representation of a yyyymmdd date
 */
public class Date {
    public int year;
    public int month;
    public int day;

    /**
     * Constructor for a 3 part date
     * @param year in yyyy format
     * @param month 1-12
     * @param day 1-31
     */
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
public int compareTo(Date otherDate){
        if(this.year != otherDate.year){
            return  Integer.compare(this.year, otherDate.year);
        }
        else if (this.month != otherDate.month){
            return Integer.compare(this.month, otherDate.month);
        }
        else{
            return Integer.compare(this.day, otherDate.day);
        }
}

}
