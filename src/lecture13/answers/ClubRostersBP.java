package lecture13.answers;

import java.util.List;

public class ClubRostersBP extends ClubRostersTemplate implements ClubManagable {

    public String mostPopular(){
        this.clean();
        this.parse();
        this.sort();
        return super.mostPopular();
    }

    public int uniqueClubs(){
        this.clean();
        this.parse();
        this.sort();
        return super.uniqueClubs();
    }

    public List<String> sortedEmails(String clubName){
        this.clean();
        this.parse();
        this.sort();
        return super.sortedEmails(clubName);
    }
}
