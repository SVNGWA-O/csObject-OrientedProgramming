package lecture13.activity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ClubRostersRTP extends ClubRoastersTemplate implements ClubManagable {

    public ClubRostersRTP(){
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

    public void intake(List<String> data){
        super.intake(data);
        this.clean();
        this.parse();
        this.sort();
    }



}
