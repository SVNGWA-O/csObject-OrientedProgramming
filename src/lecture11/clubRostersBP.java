package lecture11;


import java.util.LinkedList;
import java.util.List;

public class ClubRostersBP implements ClubManagable {

    public List<String> data;

    public List<ClubRoster> roaster = new LinkedList<>();

    public ClubRostersBP(List<String> data){
        this.data = new LinkedList<>(data);
    }

    public ClubRostersBP(){
        this.data = new LinkedList<>();
    }
    public void intake(List<String> data){
        this.data.addAll(data);
    }

public void clean(){

        List<String> cleanedData = new LinkedList<>();
        for (int i=0; i<this.data.size(); i+=2){
            if(this.data.get(i).endsWith("@wpi.edu")){
                cleanedData.add(this.data.get(i));
                cleanedData.add(this.data.get(i+1));
            }

    }
    this.data = cleanedData;
}

public void parse(){
        for(int i=0; i<this.data.size(); i+=2){
            String email = this.data.get(i);
            String club = this.data.get(i+1);
            addEmailToClub(email, club);

        }
    this.data.clear();
}

private void addEmailToClub(String email, String club){
        for(ClubRoster roaster:this.roaster){
            if(roaster.getClubName().equals(club)){
                roaster.addEmail(email);
                return;
            }

        }

        ClubRoster roster = new ClubRoster(club);
        roster.addEmail(email);
        this.roaster.add(roster);
}

    public String mostPopular(){

        this.clean();
        this.parse();
        ClubRoster biggest = this.roaster.get(0);
        for (ClubRoster roaster : this.roaster){
            if(roaster.size() > biggest.size()){
                biggest = roaster;
            }
        }

        return biggest.getClubName();

    }

    public int uniqueClubs(){
        this.clean();
        this.parse();
        return roaster.size();
    }

    public List<String> sortedEmails(String clubName){
        this.clean();
        this.parse();
        List<String> emails = new LinkedList<>();
        for(ClubRoster roaster: this.roaster ){
            if(roaster.getClubName().equals(clubName)){
                roaster.sort();
                emails = roaster.getEmails();
            }
        }
        return emails;
    }
}
