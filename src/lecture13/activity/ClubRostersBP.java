package lecture13.activity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ClubRostersBP extends ClubRoastersTemplate implements ClubManagable  {



    public ClubRostersBP(){
        this.intakeData = new ArrayList<>();
        this.sortedRosters = new LinkedList<>();
    }



    private ClubRoster findOrCreate(String clubName){
        for(ClubRoster roster : this.sortedRosters){
            if(roster.getClubName().equals(clubName)){
                return roster;
            }
        }
        ClubRoster roster = new ClubRoster(clubName);
        this.sortedRosters.add(roster);
        return roster;
    }

    public String mostPopular(){
        this.clean();
        this.parse();
        this.sort();

        if(this.sortedRosters.isEmpty()){
            return "N/A";
        }
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
