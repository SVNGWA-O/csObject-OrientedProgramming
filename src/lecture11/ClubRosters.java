package lecture11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ClubRosters implements ClubManagable {

    public List<String> data;

    public ClubRosters(List<String> data){
        this.data = data;
    }

    public void intake(List<String> data){
        this.data.addAll(data);
    }



    public String mostPopular(){

        List<String> clubs = new LinkedList<>();
        List<Integer> counts = new LinkedList<>();
        for(int i = 0; i < this.data.size(); i += 2){
            String email = this.data.get(i);
            String club = this.data.get(i+1);
            if(email.endsWith("@wpi.edu") &&
               ! clubs.contains(club)){
                clubs.add(club);
                counts.add(1);
            } else if(email.endsWith("@wpi.edu")){
                counts.set(clubs.indexOf(club),
                           counts.get(clubs.indexOf(club)) + 1);
            }
        }

        int biggestCount = 0;
        String biggestClub = "N/A";
        for(int i = 0; i < clubs.size(); i++){
            if(counts.get(i) > biggestCount){
                biggestCount = counts.get(i);
                biggestClub = clubs.get(i);
            }
        }
        return biggestClub;

    }

    public int uniqueClubs(){
        List<String> clubs = new LinkedList<>();
        for(int i = 0; i < this.data.size(); i+=2){
            if( this.data.get(i).endsWith("@wpi.edu") &&
                ! clubs.contains(this.data.get(i+1))){
                clubs.add(this.data.get(i+1));
            }
        }
        return clubs.size();
    }

    public List<String> sortedEmails(String clubName){
        List<String> emails = new LinkedList<>();
        for(int i = 0; i < this.data.size(); i += 2){
            if(data.get(i).endsWith("@wpi.edu") &&
               data.get(i+1).equals(clubName)){
                emails.add(data.get(i));
            }
        }
        emails.sort(String::compareTo);
        return emails;
    }
}
