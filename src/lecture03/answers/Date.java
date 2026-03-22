package lecture03.answers;

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

    /**
     * Compares two dates for < == > like comparisons
     * @param otherDate a date to compare this date to
     * @return -1 when this date is earlier, 0 if equal, 1 if later
     */
    public int compareTo(Date otherDate){
        if(this.year < otherDate.year)       { return -1; }
        else if(this.year > otherDate.year)  { return 1;  }
        else if(this.month < otherDate.month){ return -1; }
        else if(this.month > otherDate.month){ return 1;  }
        else if(this.day < otherDate.day)    { return -1; }
        else if(this.day > otherDate.day)    { return 1;  }
        else                                 { return 0;  }
    }
}
